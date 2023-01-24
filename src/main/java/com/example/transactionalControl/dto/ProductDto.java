package com.example.transactionalControl.dto;

import com.example.transactionalControl.model.Sale;

public class ProductDto {
    private long id;
    private String name;
    private Sale sale;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }
}
