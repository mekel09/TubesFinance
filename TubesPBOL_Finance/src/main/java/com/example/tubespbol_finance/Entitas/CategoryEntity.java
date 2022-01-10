package com.example.tubespbol_finance.Entitas;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "category", schema = "dbfinance", catalog = "")
public class CategoryEntity {
    private int id;
    private String namaCategory;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "namaCategory")
    public String getNamaCategory() {
        return namaCategory;
    }

    public void setNamaCategory(String namaCategory) {
        this.namaCategory = namaCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryEntity that = (CategoryEntity) o;
        return id == that.id && Objects.equals(namaCategory, that.namaCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, namaCategory);
    }
}
