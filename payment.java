import java.awt.Color;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class payment extends Application{
    final double WIDTH = 1242/4;
    final double HEIGHT = 2688/4;

    public static void main(String[] args)
    {
       launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Create Buttons
        Button addPaymentMethodButton = new Button("Add new payment method");
        Button RemovePaymentMethodButton1 = new Button("Remoth");
        Button RemovePaymentMethodButton2 = new Button("Remove");
        Button submitPromoCodeButton = new Button("Submit");
        Button backButton = new Button("Back");

        //Create Labels
        Label paymentInformation = new Label("Payment Information");
        Label paymentMethod = new Label("Payment Methods");

        //Create Textfields
        TextField cardNum1 = new TextField("Visa ...1234");
        TextField expirationDate1 = new TextField("01/2099");
        TextField cardNum2 = new TextField("Visa ...5678");
        TextField expirationDate2 = new TextField("01/2099");
        TextField promoCode = new TextField("Enter promocode");
        cardNum1.setEditable(false);
        cardNum2.setEditable(false);
        expirationDate1.setEditable(false);
        expirationDate2.setEditable(false);
        
        //Title Row
        HBox Title = new HBox(backButton, paymentInformation);
        Title.setSpacing(10);

        //Sub Title Row
        HBox subTitle = new HBox(paymentMethod);
        subTitle.setPadding(new Insets(10));
        subTitle.setAlignment(Pos.CENTER);
        
        //Current cards
        VBox cardInfo1 = new VBox(cardNum1, expirationDate1);
        HBox card1 = new HBox(cardInfo1, RemovePaymentMethodButton1);
        card1.setAlignment(Pos.CENTER_LEFT);
        VBox cardInfo2 = new VBox(cardNum2, expirationDate2);
        HBox card2 = new HBox(cardInfo2, RemovePaymentMethodButton2);
        card2.setAlignment(Pos.CENTER_LEFT);

        //Combine the two cards
        VBox cards = new VBox(card1, card2);
        cards.setSpacing(30);
        cards.setPadding(new Insets(10));

        //Promocode Box
        HBox promoCodeBox = new HBox(promoCode, submitPromoCodeButton);
        promoCodeBox.setPadding(new Insets(20));
   
        //Main VBox
        VBox vBox = new VBox(Title, subTitle, cards, addPaymentMethodButton, promoCodeBox);
        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.setPadding(new Insets(10));
        vBox.setSpacing(10);
        Scene scene = new Scene(vBox,WIDTH,HEIGHT);
        scene.getStylesheets().add("payment.css");

        primaryStage.setTitle("Payment");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
