package prototypefys;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.GridPane;
import nl.hva.hboict.sql.DataTable;
import nl.hva.hboict.sql.SQLDataBase;

/**
 *
 * @author Koen Hengsdijk
 */
public class ReportGeneration {
    
    public final String DB_NAME = "MyAirline";
    public final String DB_SERVER = "localhost:3306";
    public final String DB_ACCOUNT = "beheerder";
    public final String DB_PASSWORD = "nooitgedacht";

    ReportGeneration() {

    }
    
    public GridPane MakeReportScreen(){
        
         // setup a connection to MyAirline database on my local server
        SQLDataBase dataBase
                = new SQLDataBase(DB_NAME, DB_SERVER, DB_ACCOUNT, DB_PASSWORD);
        
        // get a table of airport information from the database
        DataTable airportData
                = dataBase.executeDataTableQuery("SELECT country FROM bagage");
        
        GridPane root = new GridPane();
        
        
        root.add(createJavaFXChartAirport(airportData), 1, 1);
        
        return root;
    }
    
    
    
    
    
    
    
    private static PieChart createJavaFXChartAirport(DataTable airportData) {

        // convert the data to the JavaFX Charts format
        ObservableList<PieChart.Data> airportChartData = FXCollections.observableArrayList();
        
        
        for (int i = 0; i < airportData.size(); i++) {
            airportChartData.add(
                new PieChart.Data(airportData.getString(i, "country"),
                   2));
        }

        // build the JavaFX chart
        PieChart chart = new PieChart(airportChartData);
        chart.setTitle("Luchthaven Vlucht Frequenties");

        return chart;
    }

}
