package com.example.tubespbol_finance.Entitas;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pembukuan", schema = "dbfinance", catalog = "")
public class PembukuanEntity {
    private int id;
    private String nama;
    private String jumlah;
    private String keterangan;
    private int categoryId;
    private int userId;

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
    @Column(name = "jumlah")
    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    @Basic
    @Column(name = "keterangan")
    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    @Basic
    @Column(name = "category_id")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PembukuanEntity that = (PembukuanEntity) o;
        return id == that.id && categoryId == that.categoryId && userId == that.userId && Objects.equals(nama, that.nama) && Objects.equals(jumlah, that.jumlah) && Objects.equals(keterangan, that.keterangan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nama, jumlah, keterangan, categoryId, userId);
    }
}
