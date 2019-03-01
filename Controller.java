package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller{

    @FXML
    private TextField plakaNoGirinizTF;

    public void aboneEkleButtonClicked(ActionEvent event) throws IOException{

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/Abonelik.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 600, 600));
            stage.setTitle("Abonelik");
            stage.show();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public void aboneleriGosterButtonClicked(ActionEvent event) throws IOException{

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/AboneleriGoster.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 600, 600));
            stage.setTitle("Aboneler Bilgi Ekranı");
            stage.show();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public void raporlamaButtonClicked(){

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/Raporlama.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 600, 600));
            stage.setTitle("Raporlama");
            stage.show();
        } catch(IOException e){
            e.printStackTrace();
        }

    }

    public void loglamaButtonClicked(){

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/Loglama.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 600, 600));
            stage.setTitle("Loglama");
            stage.show();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public void ucretlendirmeButtonClicked(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/ucretlendirme.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 600, 600));
            stage.setTitle("Ucretlendirme");
            stage.show();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    private PieChart pieChart;

    int dolu = 100;
    int bos = 50;

    public void loadData(){
        ObservableList<PieChart.Data> list = FXCollections.observableArrayList(
        new PieChart.Data("Dolu", 100),
        new PieChart.Data("Boş", 50)
    );
        pieChart.setData(list);
    }

    public void girisClicked(){
    }

    public void cikisClicked(){
    }

}
