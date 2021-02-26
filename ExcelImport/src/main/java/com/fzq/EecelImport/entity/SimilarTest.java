package com.fzq.EecelImport.entity;

public class SimilarTest {
    private Integer id;

    private String value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }


    @Override
    public String toString() {
        return "SimilarTest{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}