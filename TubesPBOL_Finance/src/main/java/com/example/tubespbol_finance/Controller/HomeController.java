package com.example.tubespbol_finance.Controller;

import com.example.tubespbol_finance.Entitas.PembukuanEntity;
import com.example.tubespbol_finance.Entitas.UserEntity;
import com.example.tubespbol_finance.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    public TextField tfNamaPembukuan;
    public TextField tfJumlahPembukuan;
    public ComboBox cbKategori;
    public Button btnSimpan;
    public Label tfJumlahSaldo;
    public TableView<PembukuanEntity> tvPemasukan;
    public TableColumn<PembukuanEntity, String> colNamaPemasukan;
    public TableColumn<PembukuanEntity, String> colJumlahPemasukan;
    public TableView<PembukuanEntity> tvPengeluaran;
    public TableColumn<PembukuanEntity, String> colNamaPengeluaran;
    public TableColumn<PembukuanEntity, String> colJumlahPengeluaran;

    ObservableList<PembukuanEntity> pList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void btnSimpanClicked(ActionEvent actionEvent) {
    }

    public void btnPembukuanClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("pageDetailPembukuan.fxml"));
        Parent root = loader.load();
        DetailPembukuanController dpc = loader.getController();
        Stage detailpembukuanStage = new Stage();
        detailpembukuanStage.setTitle("Pembukuan");
        detailpembukuanStage.setScene(new Scene(root));
        detailpembukuanStage.initModality(Modality.APPLICATION_MODAL);
        detailpembukuanStage.showAndWait();
    }

    public void btnUserClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("pageUser.fxml"));
        Parent root = loader.load();
        UserController uc = loader.getController();
        Stage userStage = new Stage();
        userStage.setTitle("Pembukuan");
        userStage.setScene(new Scene(root));
        userStage.initModality(Modality.APPLICATION_MODAL);
        userStage.showAndWait();
    }

    public void btnExitClicked(ActionEvent actionEvent) {
    }
}
