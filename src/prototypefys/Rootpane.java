
package prototypefys;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author Koen Hengsdijk
 */
public class Rootpane {
    
    private static BorderPane EerstePane = new BorderPane();
    
    Rootpane(){      
    }
    
    public Pane getRootPane(){
       
        return EerstePane;
    } 
    
    public void addnewpane(Pane NieuwPane){
        EerstePane.getChildren().clear();
        EerstePane.setCenter(NieuwPane);
        
    }
    
}
