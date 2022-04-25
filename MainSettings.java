import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class MainSettings extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //set the size of our window based on the size  of an iPhone 11 max
        int windowWidth = 1242/4, windowHeight = 2688/4;

        VBox spacer1 = new  VBox();  //will serve as a spacer for our page

        //background area
        VBox backgroundBox = new VBox();
        backgroundBox.setStyle("-fx-background-color: DARKCYAN");


        //spacer for top portion of the app
        spacer1.setPrefSize(windowWidth, 20);
        backgroundBox.getChildren().add(spacer1);


        //profile area
        VBox profileBox = new  VBox();

        //init profile objects
        Label profileLabel = new Label("PROFILE");
        Circle profileCircle = new Circle(30);  //profile image
        Label nameText = new Label("NAME"); //name text
        

        //change styels
        //make the circle clear with a border

        //add profile objects to panes
        profileBox.getChildren().addAll(profileLabel, profileCircle, nameText);
        profileBox.setAlignment(Pos.CENTER);

        //add  the profile pane to  the  bakgroundBox
        backgroundBox.getChildren().add(profileBox);

        //spacer under the main buttons but above the nav bar and sub  buttons
        VBox spacer2 = new VBox();
        spacer2.setPrefSize(windowWidth, 20);
        backgroundBox.getChildren().add(spacer2);

        //make buttons here and add to list view
        VBox buttonsBox = new VBox();

        //initialize our buttons
        Button notificationsButton = new Button("Notifications");
        Button settingsButton = new Button("Settings");
        Button paymentButton =  new Button("Payment Info");
        Button personalInfoButton = new  Button("Personal Info");
        Button subscriptionButton = new  Button("Subscription");
        Button manageAccountButton = new  Button("Manage Account");

        //change styles
        int mainButtonWidth = windowWidth - 10;
        int mainButtonHeight = 50;

        //setting button sizes
        notificationsButton.setPrefHeight(mainButtonHeight);
        notificationsButton.setPrefWidth(mainButtonWidth);
        settingsButton.setPrefHeight(mainButtonHeight);
        settingsButton.setPrefWidth(mainButtonWidth);
        paymentButton.setPrefHeight(mainButtonHeight);
        paymentButton.setPrefWidth(mainButtonWidth);
        personalInfoButton.setPrefHeight(mainButtonHeight);
        personalInfoButton.setPrefWidth(mainButtonWidth);
        subscriptionButton.setPrefHeight(mainButtonHeight);
        subscriptionButton.setPrefWidth(mainButtonWidth);
        manageAccountButton.setPrefHeight(mainButtonHeight);
        manageAccountButton.setPrefWidth(mainButtonWidth);

        //add buttons to buttonsBox
        buttonsBox.getChildren().addAll(notificationsButton, settingsButton, paymentButton, personalInfoButton, subscriptionButton, manageAccountButton);
        buttonsBox.setAlignment(Pos.CENTER);

        //add the buttons box to background box
        backgroundBox.getChildren().add(buttonsBox);

        //spacer under the main buttons but above the nav bar and sub  buttons
        VBox spacer3 = new VBox();
        spacer3.setPrefSize(windowWidth, 85);
        backgroundBox.getChildren().add(spacer3);



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


        //add bottom nav bar to pane
        HBox bottomNavBarBox = new HBox(homeButton, myStuffButton, downloadsButton, searchButton, profileButton);
        bottomNavBarBox.setMaxWidth(windowWidth);
        bottomNavBarBox.setPrefHeight(33);
        bottomNavBarBox.setStyle("-fx-background-color: BLACK");
        bottomNavBarBox.setSpacing(windowWidth/11);

        //make a border pane for the nav bar and add it to the backgrond box
        BorderPane bottomBorderPane = new BorderPane();
        bottomBorderPane.setBottom(bottomNavBarBox);
        backgroundBox.getChildren().add(bottomBorderPane);


        //set up button funcitonality
        notificationsButton.setOnAction(value -> {
            //open notifications window
            System.out.println("Notifications button clicked!");
        });

        //add the functinality for the rest of the buttons here

        settingsButton.setOnAction(value -> {
            //open notifications window
            System.out.println("Settings button clicked!");
        });

        paymentButton.setOnAction(value -> {
            //open notifications window
            System.out.println("Payment button clicked!");
        });

        personalInfoButton.setOnAction(value -> {
            //open notifications window
            System.out.println("Personal info button clicked!");
        });

        subscriptionButton.setOnAction(value -> {
            //open notifications window
            System.out.println("Subscription button clicked!");

            Subscription subWindow = new Subscription();
            Stage subscriptionStage = new Stage();

            subWindow.start(subscriptionStage);
            subscriptionStage.show();
        });

        manageAccountButton.setOnAction(value -> {
            //open notifications window
            System.out.println("Notifications button clicked!");
        });




        //init the scene
        Scene scene = new Scene(backgroundBox, windowWidth, windowHeight);

        //set the stage
        primaryStage.setTitle("Hulu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
