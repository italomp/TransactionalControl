package com.example.transactionalControl.util;

import com.example.transactionalControl.dto.SaleDto;
import com.example.transactionalControl.model.Product;
import com.example.transactionalControl.model.Sale;

import java.util.List;

public class SaleMapper {
    public static Sale fromDtoToSale(SaleDto saleDto){
        Sale sale = new Sale();
        sale.setId(saleDto.getId());
        List<Product> productList = ProductMapper.fromDtoListToProductList(saleDto.getProductList(), sale);
        sale.setProductList(productList);
        return sale;
    }
}
