package com.s1mob.mini_ecommerce_project.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s1mob.mini_ecommerce_project.models.Product;
import com.s1mob.mini_ecommerce_project.repository.ProductRepository;
import com.s1mob.mini_ecommerce_project.service.ProductService;

@Service
@Transactional
public class ProductServiceImp implements ProductService {
    @Autowired
    private ProductRepository repository;


    @Override
    public List getAllProducts() {
        final List products = new ArrayList();
        repository.findAll().forEach(products::add);
        return products;
    }

    @Override
    public Product getProductById(String id) {
        return repository.findById(id).orElseGet(Product::new);
    }
}
