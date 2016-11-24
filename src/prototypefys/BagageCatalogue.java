package prototypefys;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author Koen Hengsdijk
 */
public class BagageCatalogue {

    BagageCatalogue() {
    }

    public Pane MaakCatalogue() {

        BorderPane root = new BorderPane();

        GridPane Zoekscherm = new GridPane();
        Zoekscherm.setPrefSize(150, 100);
        Zoekscherm.setMaxSize(150, 100);
        Zoekscherm.setStyle("-fx-base:orange;-fx-border-color:blue");
        Zoekscherm.setAlignment(Pos.CENTER);

        Zoekscherm.setPrefSize(250, 250);
        Zoekscherm.setMaxSize(250, 250);
        
        StackPane emptyPane = new StackPane();
        emptyPane.setPrefSize(150, 250);
        emptyPane.getChildren().addAll(Zoekscherm);
        
        TextField tekst = new TextField("search");

        HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 12, 15, 12));
        hbox.setSpacing(10);
        hbox.setStyle("-fx-background-color: #336699;");

        Button buttonCurrent = new Button("Current");
        buttonCurrent.setPrefSize(100, 20);

        Button buttonProjected = new Button("Projected");
        buttonProjected.setPrefSize(100, 20);
        hbox.getChildren().addAll(buttonCurrent, buttonProjected);

        Zoekscherm.add(tekst, 1, 0);
        
        root.setLeft(emptyPane);
        root.setTop(hbox);

        return root;
    }

}
