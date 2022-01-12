package com.example.tubespbol_finance.Controller;

import com.example.tubespbol_finance.Dao.UserDaoImpl;
import com.example.tubespbol_finance.Entitas.UserEntity;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class UserController implements Initializable {

    public TableView<UserEntity> tvUser;
    public TableColumn<UserEntity, Integer> colID;
    public TableColumn<UserEntity, String> colUsername;
    public TableColumn<UserEntity, String> colNama;
    public TableColumn<UserEntity, String> colAlamat;
    public TableColumn<UserEntity, String> colTelepon;
    public TableColumn<UserEntity, Date> colTanggalLahir;
    public TableColumn<UserEntity, String> colEmail;
    public TableColumn<UserEntity, String> colKeterangan;

    ObservableList<UserEntity> uList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
