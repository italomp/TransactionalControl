package com.example.transactionalControl.service;

import com.example.transactionalControl.dto.SaleDto;
import com.example.transactionalControl.model.Product;
import com.example.transactionalControl.model.Sale;
import com.example.transactionalControl.repository.ProductRepository;
import com.example.transactionalControl.repository.SaleRepository;
import com.example.transactionalControl.util.SaleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public HttpStatus createSale(SaleDto saleDto) {
        System.out.println("saleDto == null: " + (saleDto == null));
        System.out.println("saleDto.getProductList() == null: " + (saleDto.getProductList() == null));
        Sale sale = SaleMapper.fromDtoToSale(saleDto);
        saveProducts(sale.getProductList());
        saleRepository.save(sale);
        return HttpStatus.OK;
    }

    @Transactional
    public void saveProducts(List<Product> products){
        for(int i = 0; i < products.size(); i++){
            Product currProduct = products.get(i);
            productRepository.save(currProduct);
        }
    }
}
