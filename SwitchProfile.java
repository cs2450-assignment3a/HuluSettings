import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class SwitchProfile extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        
        //set the size of our window based on the size  of an iPhone 11 max
        int windowWidth = 1242/4, windowHeight = 2688/4;

        //our background VBox
        VBox backgroundBox = new VBox();

        //profile name section
        VBox profileNameArea = new VBox();
        profileNameArea.setPadding(new Insets(10, 10, 10, 10));

        Button profile1Label = new Button("Kai");
        Button profile2Label = new Button("Michelle");
        Button profile3Label = new Button("Brandon");
        Button profile4Label = new Button("Alex");
        Button profile5Label = new Button("Nathan");
        Button addProfileButton = new Button("+ New Profile");

        //change style
        profile1Label.getStyleClass().add("profile-name");
        profile2Label.getStyleClass().add("profile-name");
        profile3Label.getStyleClass().add("profile-name");
        profile4Label.getStyleClass().add("profile-name");
        profile5Label.getStyleClass().add("profile-name");
        addProfileButton.getStyleClass().add("add-profile-button");

        profile3Label.setStyle(
            "-fx-text-fill: rgb(152, 255, 152);"
        );

        addProfileButton.setPadding(new Insets(0, 0, 0, 10));

        //add buttons to profileNameArea
        profileNameArea.getChildren().addAll(profile1Label, profile2Label, profile3Label, profile4Label, profile5Label, addProfileButton);
        backgroundBox.getChildren().add(profileNameArea);


        //add button funcitnality
        //when a button is clicked, set all the others to white
        //and make the current one green

        profile1Label.setOnAction(value -> {
            System.out.println("profile 1 button clicked");
            profile1Label.setStyle("-fx-text-fill: rgb(152, 255, 152);");
            profile2Label.setStyle("-fx-text-fill: white;");
            profile3Label.setStyle("-fx-text-fill: white;");
            profile4Label.setStyle("-fx-text-fill: white;");
            profile5Label.setStyle("-fx-text-fill: white;");
        });

        profile2Label.setOnAction(value -> {
            System.out.println("profile 2 button clicked");
            profile1Label.setStyle("-fx-text-fill: white;");
            profile2Label.setStyle("-fx-text-fill: rgb(152, 255, 152);");
            profile3Label.setStyle("-fx-text-fill: white;");
            profile4Label.setStyle("-fx-text-fill: white;");
            profile5Label.setStyle("-fx-text-fill: white;");
        });

        profile3Label.setOnAction(value -> {
            System.out.println("profile 3 button clicked");
            profile1Label.setStyle("-fx-text-fill: white;");
            profile2Label.setStyle("-fx-text-fill: white;");
            profile3Label.setStyle("-fx-text-fill: rgb(152, 255, 152);");
            profile4Label.setStyle("-fx-text-fill: white;");
            profile5Label.setStyle("-fx-text-fill: white;");
        });

        profile4Label.setOnAction(value -> {
            System.out.println("profile 4 button clicked");
            profile1Label.setStyle("-fx-text-fill: white;");
            profile2Label.setStyle("-fx-text-fill: white;");
            profile3Label.setStyle("-fx-text-fill: white;");
            profile4Label.setStyle("-fx-text-fill: rgb(152, 255, 152);");
            profile5Label.setStyle("-fx-text-fill: white;");
        });

        profile5Label.setOnAction(value -> {
            System.out.println("profile 5 button clicked");
            profile1Label.setStyle("-fx-text-fill: white;");
            profile2Label.setStyle("-fx-text-fill: white;");
            profile3Label.setStyle("-fx-text-fill: white;");
            profile4Label.setStyle("-fx-text-fill: white;");
            profile5Label.setStyle("-fx-text-fill: rgb(152, 255, 152);");
        });


        //init the scene
        Scene scene = new Scene(backgroundBox, windowWidth, windowHeight);

        //add css file
        scene.getStylesheets().add("switchprofile.css");

        //set the stage
        primaryStage.setTitle("Change Profile");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
