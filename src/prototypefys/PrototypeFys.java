package prototypefys;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import nl.hva.hboict.sql.DataRow;
import nl.hva.hboict.sql.DataTable;
import nl.hva.hboict.sql.SQLDataBase;

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
      
        
    
    GridPane scherm = MaakHetScherm();
    
    Pane scherm2 = MaakCatalogue();
       
    
    
    Scene scene = new Scene(scherm, 900, 800);
    Scene scene2 = new Scene(scherm2, 900, 800);    
    
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
        VoegKnopToe(scherm, login);
    }

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
    public final String DB_NAME = "MyAirline";
    public final String DB_SERVER = "localhost:3306";
    public final String DB_ACCOUNT = "beheerder";
    public final String DB_PASSWORD = "nooitgedacht";
    
    public GridPane MaakCatalogue() {
        
          // setup a connection to MyAirline database on my local server
        SQLDataBase dataBase
                = new SQLDataBase(DB_NAME, DB_SERVER, DB_ACCOUNT, DB_PASSWORD);
        
        // get a table of airport information from the database
        DataTable airportData
                = dataBase.executeDataTableQuery("SELECT * FROM bagage");
        
        GridPane root = new GridPane();
        root.getColumnConstraints().add(new ColumnConstraints(200));
        
        GridPane Zoekscherm = new GridPane();
        Zoekscherm.setPrefSize(150, 100);
        Zoekscherm.setMaxSize(150, 100);
        Zoekscherm.setStyle("-fx-base:orange;-fx-border-color:black");
        Zoekscherm.setAlignment(Pos.CENTER);

        Zoekscherm.setPrefSize(250, 250);
        Zoekscherm.setMaxSize(250, 250);
        
        StackPane EmptyPane = new StackPane();
        EmptyPane.setPrefSize(250, 150);
        
        TextField tekst = new TextField("search");

        HBox hbox = new HBox();
        hbox.setPadding(new Insets(5, 12, 5, 12));
        hbox.setSpacing(10);
        

        Button buttonCurrent = new Button("main menu");
        buttonCurrent.setPrefSize(100, 20);

        Button buttonProjected = new Button("options");
        buttonProjected.setPrefSize(100, 20);
        hbox.getChildren().addAll(buttonCurrent, buttonProjected);

        Zoekscherm.add(tekst, 1, 0);
        
        root.add(EmptyPane, 0, 1);
        root.add(Zoekscherm, 0 , 3);
        root.add(hbox, 0, 2);
        
        
        root.add(createJavaFXReadOnlyDataTableView(airportData), 1 , 2 , 1, 2);
        

        return root;
    }
    private static TableView<DataRow> createJavaFXReadOnlyDataTableView(DataTable dt) {
        TableView<DataRow> tv = new TableView<>();
        tv.setPrefWidth(5000);

        // define a JavaFX TableColumn for every column in the DataTable
        for (int c = 0; c < dt.getNColumns(); c++) {
            TableColumn<DataRow, String> tc = new TableColumn(dt.getColumnName(c));
            tc.setStyle("-fx-alignment: CENTER;");
            tc.setResizable(true);
            final int colIndex = c;

            // configure the Cell Value generator
            tc.setCellValueFactory(data -> {
                DataRow dr = data.getValue();
                String cellValue;
                cellValue = dr.getString(colIndex);
                return new ReadOnlyStringWrapper(cellValue);
            });
            tv.getColumns().add(tc);
        }

        // Add all Data Table data to the TableView
        for (int i = 0; i < dt.size(); i++) {
            tv.getItems().add(dt.get(i));
        }

        // align the view with the boundaries of the container
        tv.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        //tv.setColumnResizePolicy((param) -> true);

        return tv;
    }
    
    public void VoegKnopToe(GridPane scherm, Button Knop){
        
        scherm.add(Knop, 0, 3);
        
        
    }
    
}
