package com.example.tubespbol_finance.Controller;

import com.example.tubespbol_finance.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    public TextField tfUsername;
    public TextField tfPassword;
    public Button btnLogin;
    public Button btnBuatAkun;

    public void btnLoginClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("pageHome.fxml"));
        Parent root = loader.load();
        HomeController hc = loader.getController();
        Stage homeStage = new Stage();
        homeStage.setTitle("my Finance");
        homeStage.setScene(new Scene(root));
        homeStage.initModality(Modality.APPLICATION_MODAL);
        homeStage.showAndWait();
    }

    public void btnBuatAkunCliocked(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("pageCreateUser.fxml"));
        Parent root = loader.load();
        CreateUserController cuc = loader.getController();
        Stage createuserStage = new Stage();
        createuserStage.setTitle("Buat Akun");
        createuserStage.setScene(new Scene(root));
        createuserStage.initModality(Modality.APPLICATION_MODAL);
        createuserStage.showAndWait();
    }
}