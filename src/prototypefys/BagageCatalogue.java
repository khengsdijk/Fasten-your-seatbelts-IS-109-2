package prototypefys;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
 *
 * @author Koen Hengsdijk
 */
public class BagageCatalogue {

    BagageCatalogue() {
    }
    
    public final String DB_NAME = "MyAirline";
    public final String DB_SERVER = "localhost:3306";
    public final String DB_ACCOUNT = "beheerder";
    public final String DB_PASSWORD = "nooitgedacht";

    public Pane MaakCatalogue() {
        
        
        
        GridPane root = new GridPane();
        
        GridPane Zoekscherm = new GridPane();
        Zoekscherm.setPrefSize(150, 100);
        Zoekscherm.setMaxSize(150, 100);
        Zoekscherm.setStyle("-fx-base:orange;-fx-border-color:black");
        Zoekscherm.setAlignment(Pos.CENTER);

        Zoekscherm.setPrefSize(250, 250);
        Zoekscherm.setMaxSize(250, 250);
        
        GridPane EmptyPane = new GridPane();
        EmptyPane.setPrefSize(250, 550);
        EmptyPane.setMinSize(250, 550);
        EmptyPane.setStyle("-fx-base:orange;-fx-border-color:blue");
        TextField tekst = new TextField("search");

        HBox hbox = new HBox();
        hbox.setPadding(new Insets(5, 12, 5, 12));
        hbox.setSpacing(10);
        

        Button buttonCurrent = new Button("Main menu");
        buttonCurrent.setPrefSize(100, 20);

        Button buttonProjected = new Button("options");
        buttonProjected.setPrefSize(100, 20);
        hbox.getChildren().addAll(buttonCurrent, buttonProjected);

        Zoekscherm.add(tekst, 1, 0);
        
        root.add(EmptyPane, 0, 1);
        root.add(Zoekscherm, 0 , 3);
        root.add(hbox, 0, 2);

        return root;
    }

}
