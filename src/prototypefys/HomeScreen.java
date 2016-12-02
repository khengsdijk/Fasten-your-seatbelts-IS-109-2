/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypefys;

/**
 *
 * @author Koen Hengsdijk
 */

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class HomeScreen {
    
    Rootpane rootpane = new Rootpane();
    
    BagageCatalogue scherm2 = new BagageCatalogue();
    GridPane cataloog = scherm2.MaakCatalogue();
    
    HomeScreen(){
        
    }
    
    public HBox maakhomescreen(){
        
        HBox hbox = new HBox(200);
        hbox.setAlignment(Pos.CENTER);

        VBox vbox1 = new VBox(20);
        vbox1.setAlignment(Pos.CENTER);


            Button bt_VEC = new Button("View Existing Case");
            Button bt_VBC = new Button("View Baggage Catalogue ");
            bt_VBC.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                rootpane.addnewpane(cataloog);
            }
            });
            
            
            
            Button bt_RFB = new Button("Report Found Baggage ");
            Button bt_RLB = new Button("Report Lost Baggage ");
            Button bt_OPT = new Button("Options ");
            Button bt_LOG = new Button("Logout ");

            vbox1.getChildren().add(bt_VEC);
            vbox1.getChildren().add(bt_VBC);
            vbox1.getChildren().add(bt_RFB);
            vbox1.getChildren().add(bt_RLB);
            vbox1.getChildren().add(bt_OPT);
            vbox1.getChildren().add(bt_LOG);

        

        hbox.getChildren().addAll(vbox1);
    
        return hbox;
        }
}   