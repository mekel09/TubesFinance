package com.example.tubespbol_finance.Entitas;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tipeuser", schema = "dbfinance", catalog = "")
public class TipeuserEntity {
    private int id;
    private String namaTipe;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "namaTipe")
    public String getNamaTipe() {
        return namaTipe;
    }

    public void setNamaTipe(String namaTipe) {
        this.namaTipe = namaTipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipeuserEntity that = (TipeuserEntity) o;
        return id == that.id && Objects.equals(namaTipe, that.namaTipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, namaTipe);
    }
}
