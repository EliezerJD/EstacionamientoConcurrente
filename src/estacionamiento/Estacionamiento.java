/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author eliezer
 */
public class Estacionamiento extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException{
        AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("main.fxml"));
    	Scene scene = new Scene(root);
    	stage.setScene(scene);
        stage.setTitle("Estacionamiento");
        stage.show();
        
    }
    
}
