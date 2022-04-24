import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class MainSettings extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        int windowWidth = 1242/4, windowHeight = 2688/4;

        //GridPane gridPane = new GridPane();
        //Scene scene = new Scene(gridPane, windowWidth, windowHeight);
        
        //Pane mainPane = new Pane();



        //background area
        VBox backgroundBox = new VBox();
        backgroundBox.setStyle("-fx-background-color: DARKCYAN");



        //profile area
        StackPane profilePane = new StackPane();

        Circle profileCircle = new Circle(30);  //profile image
        Label nameText = new Label("NAME"); //name text

        //add profile objects to panes
        profilePane.getChildren().add(profileCircle);
        profilePane.getChildren().add(nameText);
        backgroundBox.getChildren().add(profilePane);



        //make buttons here and add to list view
        VBox buttonsBox = new VBox();

        //initialize our buttons
        Button notificationsButton = new Button("Notifications");
        Button settingsButton = new Button("Settings");
        Button paymentButton =  new Button("Payment Info");

        //change styles
        int mainButtonWidth = windowWidth - 10;
        int mainButtonHeight = 50;

        notificationsButton.setPrefHeight(mainButtonHeight);
        notificationsButton.setPrefWidth(mainButtonWidth);

        settingsButton.setPrefHeight(mainButtonHeight);
        settingsButton.setPrefWidth(mainButtonWidth);

        paymentButton.setPrefHeight(mainButtonHeight);
        paymentButton.setPrefWidth(mainButtonWidth);

        //add buttons to buttonsBox
        buttonsBox.getChildren().addAll(notificationsButton, settingsButton, paymentButton);
        buttonsBox.setAlignment(Pos.CENTER);

        //add the buttons box to background box
        backgroundBox.getChildren().add(buttonsBox);


        //other buttons area
        //help center button, about hulu button, logout button
        VBox helpArea = new VBox();

        //init buttons
        Button helpCenterButton = new Button("Help Center");
        Button aboutHuluButton = new Button("About Hulu");
        Button logOutButton = new Button("Log Out");

        //edit styles
        int subButtonWidth = 100;
        int subButtonHeight = 40;

        helpCenterButton.setPrefWidth(subButtonWidth);
        helpCenterButton.setPrefHeight(subButtonHeight);

        aboutHuluButton.setPrefWidth(subButtonWidth);
        aboutHuluButton.setPrefHeight(subButtonHeight);

        logOutButton.setPrefWidth(subButtonWidth);
        logOutButton.setPrefHeight(subButtonHeight);

        //add children to help area box
        helpArea.getChildren().addAll(helpCenterButton, aboutHuluButton, logOutButton);

        //add help area box to background box
        backgroundBox.getChildren().add(helpArea);

        //bottom nav bar area
        //toggle buttons
        ToggleButton homeButton = new ToggleButton("H");
        ToggleButton myStuffButton = new ToggleButton("MS");
        ToggleButton downloadsButton = new ToggleButton("D");
        ToggleButton searchButton = new ToggleButton("S");
        ToggleButton profileButton = new ToggleButton("P");

        //setting size of buttons
        /*
        int toggleButtonWidth = 12, toggleButtonHeight = 12;
        homeButton.setPrefSize(toggleButtonWidth, toggleButtonHeight);
        myStuffButton.setPrefSize(toggleButtonWidth, toggleButtonHeight);
        downloadsButton.setPrefSize(toggleButtonWidth, toggleButtonHeight);
        searchButton.setPrefSize(toggleButtonWidth, toggleButtonHeight);
        profileButton.setPrefSize(toggleButtonWidth, toggleButtonHeight);
        */

        //add to toggle group
        ToggleGroup toggleGroup = new ToggleGroup();
        homeButton.setToggleGroup(toggleGroup);
        myStuffButton.setToggleGroup(toggleGroup);
        downloadsButton.setToggleGroup(toggleGroup);
        searchButton.setToggleGroup(toggleGroup);
        profileButton.setToggleGroup(toggleGroup);

        //create button bar
        /*
        ButtonBar bottomNavBar = new ButtonBar();
        bottomNavBar.setMaxWidth(10);
        ButtonBar.setButtonData(homeButton, ButtonData.APPLY);
        ButtonBar.setButtonData(myStuffButton, ButtonData.APPLY);
        ButtonBar.setButtonData(downloadsButton, ButtonData.APPLY);
        ButtonBar.setButtonData(searchButton, ButtonData.APPLY);
        ButtonBar.setButtonData(profileButton, ButtonData.APPLY);
        

        //add buttons to nav bar
        bottomNavBar.getButtons().addAll(homeButton, myStuffButton, downloadsButton, searchButton, profileButton);
        */

        //add to pane
        HBox bottomNavBarBox = new HBox(homeButton, myStuffButton, downloadsButton, searchButton, profileButton);
        bottomNavBarBox.setMaxWidth(windowWidth);
        bottomNavBarBox.setPrefHeight(15);
        bottomNavBarBox.setStyle("-fx-background-color: BLACK");
        bottomNavBarBox.setSpacing(windowWidth/11);

        BorderPane bottomBorderPane = new BorderPane();
        bottomBorderPane.setBottom(bottomNavBarBox);

        backgroundBox.getChildren().add(bottomBorderPane);

        Scene scene = new Scene(backgroundBox, windowWidth, windowHeight);

        //set the stage
        primaryStage.setTitle("Hulu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
