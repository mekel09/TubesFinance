package com.example.tubespbol_finance.Entitas;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "dbfinance", catalog = "")
public class UserEntity {
    private int id;
    private String nama;
    private String alamat;
    private String telepon;
    private Date tanggalLahir;
    private String email;
    private String saldo;
    private String username;
    private String password;
    private int tipeuserId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nama")
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Basic
    @Column(name = "alamat")
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Basic
    @Column(name = "telepon")
    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    @Basic
    @Column(name = "tanggalLahir")
    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "saldo")
    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "tipeuser_id")
    public int getTipeuserId() {
        return tipeuserId;
    }

    public void setTipeuserId(int tipeuserId) {
        this.tipeuserId = tipeuserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id && tipeuserId == that.tipeuserId && Objects.equals(nama, that.nama) && Objects.equals(alamat, that.alamat) && Objects.equals(telepon, that.telepon) && Objects.equals(tanggalLahir, that.tanggalLahir) && Objects.equals(email, that.email) && Objects.equals(saldo, that.saldo) && Objects.equals(username, that.username) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nama, alamat, telepon, tanggalLahir, email, saldo, username, password, tipeuserId);
    }
}
