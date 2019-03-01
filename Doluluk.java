package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class Doluluk implements Initializable {

    @FXML
    private Pane paneView;

    int dolu = 100;
    int bos = 50;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
    }

    private void loadData(){
        paneView.getChildren().clear();
        ObservableList<PieChart.Data> list = FXCollections.observableArrayList();
        list.add(new PieChart.Data("Dolu", 100));
        list.add(new PieChart.Data("Boş", 50));
        PieChart dolulukChart = new PieChart(list);
        dolulukChart.setTitle("Doluluk Oranı");
        paneView.getChildren().add(dolulukChart);
    }

}
