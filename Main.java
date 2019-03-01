package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        /*
         * Initialized code. Do not change anything below.
         */

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Otopark A.Ş.");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
