 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypefys;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Daniel
 */
public class adminScherm {
    
    
    adminScherm(){
        
    }   
    
    public HBox maakAdminScherm() {
    
    
    Rootpane rootpane = new Rootpane();
    
        HBox hbox = new HBox(200);
        hbox.setAlignment(Pos.CENTER);

        VBox vbox1 = new VBox(20);
        vbox1.setAlignment(Pos.CENTER);
        
                    
            Button bt_MA = new Button("Manage Accounts ");
            bt_MA.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                System.out.println("X");
            }
            });
            
            Button bt_VL = new Button("View Logs ");
            bt_VL.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                System.out.println("X");
            }
            });
            
            Button bt_VDC = new Button("View Deleted Cases ");
            bt_VDC.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                System.out.println("X");
            }
            });
        
            vbox1.getChildren().add(bt_MA);
            vbox1.getChildren().add(bt_VL);
            vbox1.getChildren().add(bt_VDC);
    
            
        hbox.getChildren().addAll(vbox1);
    
        return hbox;
       
            
    }
 
     

}