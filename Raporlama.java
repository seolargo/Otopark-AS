package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Raporlama {

    /*
    JavaFX'te setEditable() fonksiyonu hem TextField'lar için hem de JTextField'lar için geçerli.
    Kaynak: https://www.programcreek.com/java-api-examples/?class=javafx.scene.control.TextField&method=setEditable
     */

    @FXML
    private TextField gunlukKarTF;

    @FXML
    private TextField haftalikKarTF;

    @FXML
    private TextField aylikKarTF;

    @FXML
    private TextField yillikKarTF;

    @FXML
    private TextField gunlukAracTF;

    @FXML
    private TextField haftalikAracTF;

    @FXML
    private TextField aylikAracTF;

    @FXML
    private TextField yillikAracTF;

}
