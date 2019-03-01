package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Ucretlendirme {

    /*
    public void saatlikKampanyaliButton(){
    }
    public void gunlukKampanyaliButton(){
    }
    public void aylikKampanyaliButton(){
    }
    public void yillikKampanyaliButton(){
    }
    */

    //TextFields below are set to editable in the GUI. However, those can be changed via setMethods.
    @FXML
    private TextField saatlikUcret;
    @FXML
    private TextField gunlukUcret;
    @FXML
    private TextField aylikUcret;
    @FXML
    private TextField yillikUcret;

    public TextField getSaatlikUcret() {
        return saatlikUcret;
    }

    public TextField getGunlukUcret() {
        return gunlukUcret;
    }

    public TextField getAylikUcret() {
        return aylikUcret;
    }

    public TextField getYillikUcret() {
        return yillikUcret;
    }

    public void setSaatlikUcret(TextField saatlikUcret) {
        this.saatlikUcret = saatlikUcret;
    }

    public void setGunlukUcret(TextField gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }

    public void setAylikUcret(TextField aylikUcret) {
        this.aylikUcret = aylikUcret;
    }

    public void setYillikUcret(TextField yillikUcret) {
        this.yillikUcret = yillikUcret;
    }

    public void saatlikOKButton(){
    }

    public void gunlukOKButton(){
    }

    public void aylikOKButton(){
    }

    public void yillikOKButton(){
    }

}
