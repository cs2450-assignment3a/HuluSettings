import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
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
        //backgroundBox.setStyle("-fx-background-color: DARKCYAN");


        //spacer for top portion of the app
        spacer1.setPrefSize(windowWidth, 20);
        backgroundBox.getChildren().add(spacer1);


        //profile area
        VBox profileBox = new  VBox();

        //init profile objects
        Label profileLabel = new Label("PROFILE");
        Button manageProfilesButton = new  Button("Manage Profiles");
        Circle profileCircle = new Circle(35);  //profile image
        Label nameText = new Label("NAME"); //name text
        

        //change styles
        profileLabel.getStyleClass().add("profile-area-label");
        manageProfilesButton.getStyleClass().add("profile-manage-button");
        profileCircle.getStyleClass().add("profile-image-circle");
        nameText.getStyleClass().add("profile-name-text");

        profileLabel.setPadding(new Insets(5, 0, 15, 0));
        manageProfilesButton.setPadding(new Insets(0, 0, 10, 0));
        nameText.setPadding(new Insets(10, 0, 10, 0));

        profileCircle.setFill(Color.TRANSPARENT);
        profileCircle.setStroke(Color.WHITE);
        

        //add profile objects to panes
        profileBox.getChildren().addAll(profileLabel,manageProfilesButton, profileCircle, nameText);
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
        Button settingsButton = new Button("Settings");
        Button paymentButton =  new Button("Payment Info");
        Button personalInfoButton = new  Button("Personal Info");
        Button subscriptionButton = new  Button("Manage Subscription");
        

        settingsButton.getStyleClass().add("main-button");
        paymentButton.getStyleClass().add("main-button");
        personalInfoButton.getStyleClass().add("main-button");
        subscriptionButton.getStyleClass().add("main-button");

        //change styles
        int mainButtonWidth = windowWidth - 40;
        int mainButtonHeight = 50;

        //setting button sizes
        settingsButton.setPrefHeight(mainButtonHeight);
        settingsButton.setPrefWidth(mainButtonWidth);
        paymentButton.setPrefHeight(mainButtonHeight);
        paymentButton.setPrefWidth(mainButtonWidth);
        personalInfoButton.setPrefHeight(mainButtonHeight);
        personalInfoButton.setPrefWidth(mainButtonWidth);
        subscriptionButton.setPrefHeight(mainButtonHeight);
        subscriptionButton.setPrefWidth(mainButtonWidth);

        //add buttons to buttonsBox
        buttonsBox.getChildren().addAll(personalInfoButton, paymentButton, subscriptionButton, settingsButton);
        buttonsBox.setAlignment(Pos.CENTER);
        buttonsBox.setSpacing(5);

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

        //set classes for css file
        helpCenterButton.getStyleClass().add("helparea-button");
        aboutHuluButton.getStyleClass().add("helparea-button");
        logOutButton.getStyleClass().add("helparea-button");

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
        int navbarHeight = 33;
        int navbarButtonHeight = navbarHeight;

        //toggle buttons
        ToggleButton homeButton = new ToggleButton("HOME");
        ToggleButton myStuffButton = new ToggleButton("MY STUFF");
        ToggleButton downloadsButton = new ToggleButton("DOWNLOADS");
        ToggleButton searchButton = new ToggleButton("SEARCH");
        ToggleButton profileButton = new ToggleButton("PROFILE");

        //set style sheet classes
        homeButton.getStyleClass().add("nav-bar-button");
        myStuffButton.getStyleClass().add("nav-bar-button");
        downloadsButton.getStyleClass().add("nav-bar-button");
        searchButton.getStyleClass().add("nav-bar-button");
        profileButton.getStyleClass().add("nav-bar-button");
        
        //set size of toggle buttons
        int toggleButtonWidth = 38;
        homeButton.setPrefSize(toggleButtonWidth, navbarButtonHeight);
        myStuffButton.setPrefSize(toggleButtonWidth + 12, navbarButtonHeight);
        downloadsButton.setPrefSize(toggleButtonWidth + 20, navbarButtonHeight);
        searchButton.setPrefSize(toggleButtonWidth + 10, navbarButtonHeight);
        profileButton.setPrefSize(toggleButtonWidth, navbarButtonHeight);
        

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
        bottomNavBarBox.setPrefHeight(navbarHeight);
        bottomNavBarBox.getStyleClass().add("bottom-nav-bar");
        bottomNavBarBox.setStyle("-fx-background-color: BLACK");
        bottomNavBarBox.setSpacing(windowWidth/16);

        //make a border pane for the nav bar and add it to the backgrond box
        BorderPane bottomBorderPane = new BorderPane();
        bottomBorderPane.setBottom(bottomNavBarBox);
        backgroundBox.getChildren().add(bottomBorderPane);




        //set up button funcitonality
        settingsButton.setOnAction(value -> {
            //open settings window
            System.out.println("Settings button clicked!");
        });

        paymentButton.setOnAction(value -> {
            //open payment window
            System.out.println("Payment button clicked!");

            //make new windows
            payment paymentWindow = new payment();
            Stage paymentStage = new Stage();

            //make windows visible
            try {
                paymentWindow.start(paymentStage);
            }
            catch (Exception e) {
                System.out.println("There was a problem opening the payment page");
            }
            paymentStage.show();
        });

        personalInfoButton.setOnAction(value -> {
            //open personal info window
            System.out.println("Personal info button clicked!");

            //make new windows
            MyProfile personalInfoWindow = new MyProfile();
            Stage personalInfoStage = new Stage();

            //make windows visible
            personalInfoWindow.start(personalInfoStage);
            personalInfoStage.show();
        });

        subscriptionButton.setOnAction(value -> {
            //open subscritption window
            System.out.println("Subscription button clicked!");

            //make new windows
            Subscription subWindow = new Subscription();
            Stage subscriptionStage = new Stage();

            //make windows visible
            subWindow.start(subscriptionStage);
            subscriptionStage.show();
        });

        manageProfilesButton.setOnAction(value -> {
            //open account management window
            System.out.println("Notifications button clicked!");

            //make new windows
            SwitchProfile manageAccountWindow = new SwitchProfile();
            Stage manageAccountStage = new Stage();

            //make windows visible
            manageAccountWindow.start(manageAccountStage);
            manageAccountStage.show();
        });


        //init the scene
        Scene scene = new Scene(backgroundBox, windowWidth, windowHeight);

        //add css file
        scene.getStylesheets().add("mainsettings.css");

        //set the stage
        primaryStage.setTitle("Hulu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
