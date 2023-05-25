package com.rest.restTemplate.controller;

import com.rest.restTemplate.entity.Product;
import com.rest.restTemplate.service.serviceImpl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductServiceImpl productService;
    @GetMapping("/v1/show/your/product")
    public ResponseEntity<List<Product>> showProduct(){
        List<Product> productAddition = productService.showProduct();
        return new ResponseEntity<>(productAddition, HttpStatus.OK);
    }
}
