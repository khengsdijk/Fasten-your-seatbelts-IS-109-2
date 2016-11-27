package prototypefys;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.GridPane;
import nl.hva.hboict.sql.DataTable;

/**
 *
 * @author Koen Hengsdijk
 */
public class ReportGeneration {

    ReportGeneration() {

    }
    
    public GridPane MakeReportScreen(){
        
        GridPane root = new GridPane();
        
        
        return root;
    }
    
    
    
    
    
    
    
    private static PieChart createJavaFXChartAirport(DataTable airportData) {

        // convert the data to the JavaFX Charts format
        ObservableList<PieChart.Data> airportChartData = FXCollections.observableArrayList();
        for (int i = 0; i < airportData.size(); i++) {
            airportChartData.add(
                new PieChart.Data(airportData.getString(i, "iataCode"),
                    airportData.getInt(i, "flightsPerWeek")));
        }

        // build the JavaFX chart
        PieChart chart = new PieChart(airportChartData);
        chart.setTitle("Luchthaven Vlucht Frequenties");

        return chart;
    }

}
