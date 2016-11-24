package prototypefys;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
    
   BagageCatalogue cataloog = new BagageCatalogue();
   
   Pane scherm2 = cataloog.MaakCatalogue();
       
    
    
    Scene scene = new Scene(scherm2, 900, 800);
        
        primaryStage.setTitle("loginscherm test");
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        primaryStage.show();
    
        
         
        
        
        
    /**
     * @param args the command line arguments
     */
    
   
    
    
    
}

    
}