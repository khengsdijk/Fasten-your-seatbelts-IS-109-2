package prototypefys;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Koen Hengsdijk
 */
public class PrototypeFys extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
      
        
    LoginScherm root = new LoginScherm();
    Pane scherm = root.MaakHetScherm();
    
    Scene scene = new Scene(scherm, 900, 800);
        
        primaryStage.setTitle("loginscherm test");
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        primaryStage.show();
    
        
        
        
    /**
     * @param args the command line arguments
     */
    
   
    
    
    
}

    
}