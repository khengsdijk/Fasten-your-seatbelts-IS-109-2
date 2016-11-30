package prototypefys;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import javafx.stage.Stage;


/**
 * jasdhakjsdjkas
 * @author Koen Hengsdijk
 */
public class PrototypeFys extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
      
        LoginScherm loginscherm = new LoginScherm();
        GridPane scherm = loginscherm.MaakHetScherm();
        
        BagageCatalogue cataloog = new BagageCatalogue(); 
        GridPane scherm2 = cataloog.MaakCatalogue();
        
        submitCase submit = new submitCase();
        GridPane scherm4 = submit.MakeSubmitScreen();
        
        // het homescreen wordt gemaakt
        HomeScreen homescherm = new HomeScreen();
        HBox scherm5 = homescherm.maakhomescreen();
    
    Scene scene = new Scene(scherm, 900, 800);
    Scene scene2 = new Scene(scherm5, 900, 800);    
    
        primaryStage.setTitle("loginscherm test");
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        primaryStage.show();
        
        Button login = new Button();
        login.setText("Login");
        login.setStyle("-fx-background-color: #F42BA0;-fx-text-fill:#FAFA4A");
        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(scene2);
            }
        });
        
        loginscherm.VoegKnopToe(scherm, login);
    }

   
    
    
}
