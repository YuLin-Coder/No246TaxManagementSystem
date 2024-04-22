package com.tax.model;

public class TaxType {
    private Integer id; //ID
    private String typeName; //类型名

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = (typeName == null) ? null : typeName.trim();
    }
}

