package com.example.transactionalControl.service;

import com.example.transactionalControl.model.Product;
import com.example.transactionalControl.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public void saveProducts(List<Product> products){
        products.forEach(product -> {
            productRepository.save(product);
        });
//        throw new RuntimeException();
    }
}
