package com.s1mob.mini_ecommerce_project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.s1mob.mini_ecommerce_project.models.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, String> {
}
