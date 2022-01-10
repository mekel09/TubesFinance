package com.example.tubespbol_finance.Entitas;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "saldo", schema = "dbfinance", catalog = "")
public class SaldoEntity {
    private int id;
    private String noRek;
    private String jumlah;
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
    @Column(name = "No Rek")
    public String getNoRek() {
        return noRek;
    }

    public void setNoRek(String noRek) {
        this.noRek = noRek;
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
        SaldoEntity that = (SaldoEntity) o;
        return id == that.id && userId == that.userId && Objects.equals(noRek, that.noRek) && Objects.equals(jumlah, that.jumlah);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, noRek, jumlah, userId);
    }
}
