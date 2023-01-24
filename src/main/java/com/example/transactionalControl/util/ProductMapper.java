package com.example.transactionalControl.util;

import com.example.transactionalControl.dto.ProductDto;
import com.example.transactionalControl.model.Product;
import com.example.transactionalControl.model.Sale;

import java.util.ArrayList;
import java.util.List;

public class ProductMapper {
    public static List<Product> fromDtoListToProductList(List<ProductDto> productDtoList, Sale sale){
        List<Product> productList = new ArrayList<>();
        productDtoList.forEach(productDto -> {
            productList.add(new Product(
                    productDto.getName(),
                    sale
            ));
        });
        return productList;
    }
}
