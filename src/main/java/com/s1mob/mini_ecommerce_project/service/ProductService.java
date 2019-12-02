package com.s1mob.mini_ecommerce_project.service;

import java.util.List;

import com.s1mob.mini_ecommerce_project.models.Product;

public interface ProductService {
	List getAllProducts();
	Product getProductById(String id);
}