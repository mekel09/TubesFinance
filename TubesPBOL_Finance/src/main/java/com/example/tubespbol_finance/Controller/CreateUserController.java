package com.example.tubespbol_finance.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateUserController implements Initializable {
    public TextField tfUsername;
    public TextField tfPassword;
    public TextField tfNama;
    public TextField tfAlamat;
    public TextField tfTelepon;
    public DatePicker dpTanggalLahir;
    public TextField tfEmail;
    public Button btnBuatAkun;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void btnBuatAkunClicked(ActionEvent actionEvent) {
    }


}
