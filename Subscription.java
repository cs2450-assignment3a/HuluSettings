import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class Subscription extends Application{
    final double WIDTH = 1242/4;
    final double HEIGHT = 2688/4;
    public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
        // Create Buttons
        Button managePlanButton = new Button("Manage Plan");
        Button helpButton = new Button("Need help?");
        Button viewDetailButton = new Button("View Details");
        Button manageAddonButton = new Button("Manage Add-Ons");
        Button addAddonButton = new Button("Add");
        Button pauseSubButton = new Button("Pause");
        Button cancelSubButton = new Button("Cancel");

        // Create labels
        Label topLabel = new Label("Your subscription");
        Label basePlan = new Label("Hulu Base Plan");
        Label addOnLabel = new Label("Add-Ons");
        Label cancelSubLabel = new Label("Cancel your subscription");
        Label pauseSubLabel = new Label("Pause your subscription");

        // Create Textfields
        TextField planName = new TextField("Hulu (No Ads)");
        TextField planPrice = new TextField("$12.99 / mo");
        TextField renewalDate = new TextField("Renews on May 1");
        TextField addOnList = new TextField("None Added");
        // all textfield should not be edited, only retrive data from database
        planName.setEditable(false);
        planPrice.setEditable(false);
        renewalDate.setEditable(false);
        addOnList.setEditable(false);
       
        // top row
        HBox topRow = new HBox(topLabel,createSpace(),helpButton);
        // set size of top row
        topRow.prefWidthProperty().bind(primaryStage.widthProperty().multiply(0.9));
        topRow.setAlignment(Pos.CENTER);
        topRow.setPadding(new Insets(10,5,0,5));
            
        // Second row of the design
        HBox secondRow1 = new HBox(basePlan,createSpace(),managePlanButton);
        HBox secondRow2 = new HBox(planName,createSpace(),planPrice);
        HBox secondRow3 = new HBox(viewDetailButton,createSpace(),renewalDate);
        // subpart of second row
        VBox subSecondRow = new VBox(5,secondRow2,secondRow3);
        // indent second part of row 2
        subSecondRow.setPadding(new Insets(10,20,10,20));
        subSecondRow.prefWidthProperty().bind(primaryStage.widthProperty().multiply(0.7));
        planPrice.setAlignment(Pos.BOTTOM_RIGHT);
        renewalDate.setAlignment(Pos.BOTTOM_RIGHT);
        // put everything under second row together
        VBox secondRow = new VBox(10,secondRow1,subSecondRow);
        secondRow.setAlignment(Pos.CENTER);
        secondRow.setPadding(new Insets(10,20,10,20));
        secondRow.prefWidthProperty().bind(primaryStage.widthProperty().multiply(0.8));

        // third row of the design
        HBox thirdRow1 = new HBox(addOnLabel,createSpace(),manageAddonButton);
        HBox thirdRow2 = new HBox(addOnList,createSpace(),addAddonButton);
        // indent second part of row 3
        thirdRow2.setPadding(new Insets(10,20,10,20));
        thirdRow2.prefWidthProperty().bind(primaryStage.widthProperty().multiply(0.7));
        // put everything under third row together
        VBox thirdRow = new VBox(10,thirdRow1,thirdRow2);
        thirdRow.setAlignment(Pos.CENTER);
        thirdRow.setPadding(new Insets(10,20,10,20));
        thirdRow.prefWidthProperty().bind(primaryStage.widthProperty().multiply(0.8));

        // fourth row of the design
        HBox fourthRow1 = new HBox(pauseSubLabel,createSpace(),pauseSubButton);
        HBox fourthRow2 = new HBox(cancelSubLabel,createSpace(),cancelSubButton);
        // put everything under fourth part together
        VBox fourthRow = new VBox(10,fourthRow1,fourthRow2);
        // config fourth(bottom) row
        fourthRow.setAlignment(Pos.CENTER);
        fourthRow.setPadding(new Insets(10,20,10,20));
        fourthRow.prefWidthProperty().bind(primaryStage.widthProperty().multiply(0.8));

        // a huge vbox to assemble everything together
        VBox vBox = new VBox(20,topRow,createSpace(),secondRow,thirdRow,createSpace(),fourthRow);
    
        // Create a Scene and display it.
        Scene scene = new Scene(vBox,WIDTH,HEIGHT);
        // apply css file
        scene.getStylesheets().add("subscription.css");
        // load the scene
        primaryStage.setTitle("Subscription");
        primaryStage.setScene(scene);
        primaryStage.show();
   }

   // func to create space
   private Region createSpace(){
        final Region space = new Region();
        HBox.setHgrow(space, Priority.ALWAYS);
        return space;
   }
}
