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
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private ProductService productService;


    @Transactional
    public HttpStatus createSale(SaleDto saleDto) {
        Sale sale = SaleMapper.fromDtoToSale(saleDto);
        saleRepository.save(sale);
        productService.saveProducts(sale.getProductList());
//        throw new RuntimeException();
        return HttpStatus.OK;
    }

}
