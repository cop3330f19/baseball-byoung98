/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseballcontroller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
/**
 *
 * @author Brittany
 */
public class BaseballController extends Application {
    
    @FXML private TableColumn <String, Baseball> Player;
    @FXML private TableColumn <String, Baseball> BattingAvg;
    @FXML private ListView PickTeam;
    
    private final List<Baseball> baseball = new ArrayList<>();
    
    private final String DIR = System.getProperty("user.dir");
   
    @Override
    

    private void readFile() { 

        //ObservableList to add states to the ListView
        ObservableList<String> BaseballList = FXCollections.observableArrayList();    

        //Open csv file for input
 try(BufferedReader input = Files.newBufferedReader(Paths.get("C:\\Users\\Brittany\\Documents\\NetBeansProjects\\BaseballController\\src\\baseballcontroller\\playersprof.xml"))){
            
            }     

        }catch(IOException e){
            System.err.println("Error openning file");
            e.printStackTrace();
        }       
    }
   
}
