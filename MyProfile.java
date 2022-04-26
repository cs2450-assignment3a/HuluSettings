import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class MyProfile extends Application
{
   private int buttonWidth = 150;   // set common width for buttons
   private int sectionPadding = 10; // spacing between header and change buttons

   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }  // end main
   
   @Override
   public void start(Stage primaryStage)
   {
      int windowWidth = 1242/4;  // width of scene
      int windowHeight = 2688/4; // height of scene

      // Create title label
      Label profileTitle = new Label("MY PROFILE");
      profileTitle.getStyleClass().add("label-sectionHeader");

      // Create Personal Info section header label
      Label personalInfoHeader = new Label("Personal Info");
      personalInfoHeader.getStyleClass().add("label-sectionHeader");

      // Create Email section header label 
      Label emailHeader = new Label("Email");
      emailHeader.getStyleClass().add("label-sectionHeader");
      
      // Create Password section header label
      Label passwordHeader = new Label("Password");
      passwordHeader.getStyleClass().add("label-sectionHeader");

      User Brandon = new User("Brandon", "03/14/1978", "b@hotpot.com", "******"); // create test user
      
      // set labels for user info 
      Label userName = new Label(String.format("%s", Brandon.name));
      userName.getStyleClass().add("label-details");
      Label birthDate = new Label(String.format("%s", Brandon.birthdate));
      birthDate.getStyleClass().add("label-details");
      Label email = new Label(String.format("%s", Brandon.email));
      email.getStyleClass().add("label-details");
      Label password = new Label(String.format("%s", Brandon.password));
      password.getStyleClass().add("label-details");


      /** My Profile Nav Bar  */
      // Create back button
      Button myProfileBackButton = new Button("<");
      
      // Combine back button and Profile title label into hbox 
      HBox hboxNavBar = new HBox(windowWidth/5, myProfileBackButton, profileTitle);
      /** end My Profile Nav Bar */
      

      /** Personal Info section */
      // Create button to change personal info
      Button changePersonalInfoButton = new Button("Change Personal Info");
      changePersonalInfoButton.setMinWidth(buttonWidth);   // set button width

      final Pane personalInfoHeaderSpacer = new Pane();  // create empty pane to act as spacing between header title and buttons
      HBox.setHgrow(personalInfoHeaderSpacer, Priority.ALWAYS);   // allows spacing to grow as window size is changed, ensuring button stays at the right edge of screen

      // Combine Personal Info header and personal info button into hbox, with a spacer in between
      HBox personalInfoSectionHeader = new HBox(personalInfoHeader, personalInfoHeaderSpacer, changePersonalInfoButton);
      
      VBox personalInfoDetails = new VBox(2, userName, birthDate);

      // Combine personal info section header and personalInfo details into Vbox
      VBox personalInfoSection = new VBox(10, personalInfoSectionHeader, personalInfoDetails);
      /** End Personal Info section */


      /** Email section */
      Button changeEmailButton = new Button("Change Email");
      changeEmailButton.setMinWidth(buttonWidth); 

      final Pane emailHeaderSpacer = new Pane();  
      HBox.setHgrow(emailHeaderSpacer, Priority.ALWAYS);

      HBox emailSectionHeader = new HBox(emailHeader, emailHeaderSpacer, changeEmailButton);

      VBox emailSection = new VBox(10, emailSectionHeader, email);
      /** End Email section */


      /** Password section */
      Button changePasswordButton = new Button("Change Password");
      changePasswordButton.setPrefWidth(buttonWidth); 

      final Pane passwordHeaderSpacer = new Pane();  
      HBox.setHgrow(passwordHeaderSpacer, Priority.ALWAYS);

      HBox passwordSectionHeader = new HBox(passwordHeader, passwordHeaderSpacer, changePasswordButton);

      VBox passwordSection = new VBox(10, passwordSectionHeader, password);
      /** End Password section */


      // Combine nav bar and each section in My Profile into single vbox
      VBox myProfile = new VBox(40, hboxNavBar, personalInfoSection, emailSection, passwordSection);
      myProfile.setPadding(new Insets(0, sectionPadding, 0, sectionPadding));

      // Set scene to myProfile VBox
      Scene myProfileScene = new Scene(myProfile, windowWidth, windowHeight);
      myProfileScene.getStylesheets().add("myProfileStyles.css");

      // Add the Scene to the Stage.
      primaryStage.setScene(myProfileScene);
      
      // Set the stage title.
      primaryStage.setTitle("My Profile");
      
      // Show the window.
      primaryStage.show();
   }  // end start 

   public class User
   {
      private String name;
      private String birthdate;
      private String email;
      private String password;

      public User(String name, String birthdate, String email, String password)  // user constructor
      {  
         // Set attributes to parameter values
         this.name = name;
         this.birthdate = birthdate;
         this.email = email;
         this.password = password;
      }  // end constructor

   }  // end user class

}  // end huluPersonal class

