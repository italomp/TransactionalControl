package com.example.transactionalControl.controller;

import com.example.transactionalControl.dto.SaleDto;
import com.example.transactionalControl.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/sales")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @PostMapping
    public ResponseEntity<HttpStatus> createSale(SaleDto saleDto){
        return new ResponseEntity<>(saleService.createSale(saleDto));
    }
}
