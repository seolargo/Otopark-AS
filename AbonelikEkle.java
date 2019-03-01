package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class AbonelikEkle {

    @FXML
    private TextField adTF;
    @FXML
    private TextField soyadTF;
    @FXML
    private TextField plakaNoTF;
    @FXML
    private TextField telefonTF;
    @FXML
    private TextField baslangicTarihiTF;
    @FXML
    private TextField bitisTarihiTF;

    @FXML
    private TextField plakaNoGuncelleTF;
    @FXML
    private TextField baslangicTF;
    @FXML
    private TextField bitisTF;

    public TextField getAdTF() {
        return adTF;
    }

    public void setAdTF(TextField adTF) {
        this.adTF = adTF;
    }

    public TextField getSoyadTF() {
        return soyadTF;
    }

    public void setSoyadTF(TextField soyadTF) {
        this.soyadTF = soyadTF;
    }

    public TextField getPlakaNoTF() {
        return plakaNoTF;
    }

    public void setPlakaNoTF(TextField plakaNoTF) {
        this.plakaNoTF = plakaNoTF;
    }

    public TextField getTelefonTF() {
        return telefonTF;
    }

    public void setTelefonTF(TextField telefonTF) {
        this.telefonTF = telefonTF;
    }

    public TextField getBaslangicTarihiTF() {
        return baslangicTarihiTF;
    }

    public void setBaslangicTarihiTF(TextField baslangicTarihiTF) {
        this.baslangicTarihiTF = baslangicTarihiTF;
    }

    public TextField getBitisTarihiTF() {
        return bitisTarihiTF;
    }

    public void setBitisTarihiTF(TextField bitisTarihiTF) {
        this.bitisTarihiTF = bitisTarihiTF;
    }

    public TextField getPlakaNoGuncelleTF() {
        return plakaNoGuncelleTF;
    }

    public void setPlakaNoGuncelleTF(TextField plakaNoGuncelleTF) {
        this.plakaNoGuncelleTF = plakaNoGuncelleTF;
    }

    public TextField getBaslangicTF() {
        return baslangicTF;
    }

    public void setBaslangicTF(TextField baslangicTF) {
        this.baslangicTF = baslangicTF;
    }

    public TextField getBitisTF() {
        return bitisTF;
    }

    public void setBitisTF(TextField bitisTF) {
        this.bitisTF = bitisTF;
    }


    public void aboneEkleButton(){
    }
    public void aboneGuncelleButton(){
    }

}
