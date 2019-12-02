package com.s1mob.mini_ecommerce_project.repository;

import org.springframework.data.repository.CrudRepository;
import com.s1mob.mini_ecommerce_project.models.Product;

public interface ProductRepository extends CrudRepository<Product, String> {
}
