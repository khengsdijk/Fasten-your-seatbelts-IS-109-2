package prototypefys;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 *
 * @author Koen Hengsdijk
 */
public class LoginScherm {
    
    private Button login = new Button();

    LoginScherm() {

    }
    
    public final String DB_NAME = "MyAirline";
    public final String DB_SERVER = "localhost:3306";
    public final String DB_ACCOUNT = "beheerder";
    public final String DB_PASSWORD = "nooitgedacht";

    public GridPane MaakHetScherm() {
        
        
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(10, 10, 10, 10));
        

        ImageView Corendon = new ImageView("/resources/CorendonAirlines.png");
        Corendon.setFitHeight(100);
        Corendon.setFitWidth(200);
        
        root.add(Corendon, 0, 0, 2, 1);
        
        Text username = new Text("Username:");
        root.add(username, 0, 1);

        TextField text = new TextField();
        text.setPrefColumnCount(1);
        text.setPrefWidth(100);
        root.add(text, 1, 1);

        Text password = new Text("Password:");
        root.add(password, 0, 2);

        TextField text2 = new TextField();
        text2.setPrefColumnCount(1);
        text2.setPrefWidth(10);
        root.add(text2, 1, 2);
        root.setStyle("-fx-background-color: #15EA4B;");
        
        
        
        return root;
    }
    
    public void VoegKnopToe(GridPane scherm, Button Knop){
        
        scherm.add(Knop, 0, 3); 
    }
}
