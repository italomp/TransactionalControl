package com.example.transactionalControl.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SaleDto implements Serializable {
    private long id;
    private List<ProductDto> productList;

    public SaleDto() {
        this.productList = new ArrayList<>();
    }

    public SaleDto(List<ProductDto> productList) {
        this.productList = productList;
    }

    public SaleDto(long id, List<ProductDto> productList) {
        this.id = id;
        this.productList = productList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<ProductDto> getProductList() {
        return this.productList;
    }

    public void setProducts(List<ProductDto> productList) {
        this.productList = productList;
    }
}
