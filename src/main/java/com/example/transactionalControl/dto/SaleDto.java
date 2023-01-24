package com.example.transactionalControl.dto;

import java.util.List;

public class SaleDto {
    private long id;
    private List<ProductDto> productList;

    public SaleDto(List<ProductDto> productList) {
        this.productList = productList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<ProductDto> getProductList() {
        return productList;
    }

    public void setProducts(List<ProductDto> productList) {
        this.productList = productList;
    }
}
