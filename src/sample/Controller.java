package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class Controller {
    @FXML private Label labela;
    public void fja(ActionEvent actionEvent) {
        labela.setText("HelloWorld");

    }
}
