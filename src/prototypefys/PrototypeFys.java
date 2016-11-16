package prototypefys;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Koen Hengsdijk
 */
public class PrototypeFys extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25, 25, 25, 25));
        
        GridPane Scherm2 = new GridPane();
        Scherm2.setAlignment(Pos.CENTER);
        Scherm2.setHgap(10);
        Scherm2.setVgap(10);
        Scherm2.setPadding(new Insets(25, 25, 25, 25));
        
        Button btn2 = new Button();
        btn2.setText("View existing case ");
        btn2.setPrefSize(200, 50);
        btn2.setFont(Font.font("Times New Roman", 15));
        btn2.setStyle("-fx-base:red;-fx-border-color:blue");
        
         btn2.setOnAction(new EventHandler<ActionEvent>() {

                    int i = 0;
                    
                    @Override
                    public void handle(ActionEvent event) {

                        i++;
                        btn2.setText(String.valueOf(i));    
                    }
                });
        
        Scherm2.add(btn2, 0, 1);
        
        Button btn3 = new Button();
        btn3.setText("View Baggage Catalogue ");
        btn3.setPrefSize(200, 50);
        btn3.setFont(Font.font("Times New Roman", 15));
        btn3.setStyle("-fx-base:red;-fx-border-color:blue");
        
         btn3.setOnAction(new EventHandler<ActionEvent>() {

                    int i = 0;
                    
                    @Override
                    public void handle(ActionEvent event) {

                        i++;
                        btn3.setText(String.valueOf(i));    
                    }
                });
        
        Scherm2.add(btn3, 0, 2);
        
        Scene scene2 = new Scene(Scherm2, 1000, 650);
        
        
        Button btn = new Button();
        btn.setText("login");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(scene2);
            }
        });
        root.add(btn, 1, 3);
        
        Label userName = new Label("User Name:");
        root.add(userName, 0, 1);

        TextField userTextField = new TextField();
        root.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        root.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        root.add(pwBox, 1, 2);
        ImageView Corendon = new ImageView("/resources/CorendonAirlines.png");
        Corendon.setFitHeight(150);
        Corendon.setFitWidth(300);
        
        root.add(Corendon, 1, 0);
        
        
        
        Scene scene = new Scene(root, 600, 450);
        
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
