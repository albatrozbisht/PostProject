package com.rest.restTemplate.service.serviceImpl;

import com.rest.restTemplate.entity.Product;
import com.rest.restTemplate.repository.ProductRepository;
import com.rest.restTemplate.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public List<Product> showProduct(){
        List<Product> products = productRepository.findAll();
        return products;
    }
}
