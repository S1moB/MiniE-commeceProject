package com.s1mob.mini_ecommerce_project.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.s1mob.mini_ecommerce_project.models.Order;
import com.s1mob.mini_ecommerce_project.repository.OrderRepository;
import com.s1mob.mini_ecommerce_project.service.OrderService;

public class OrderServiceImp implements OrderService {
    @Autowired
    private OrderRepository repository;

    @Override
    public Order saveOrder(Order order) {
        return repository.save(order);
    }

    @Override
    public void deleteOrder(String id) {
         repository.deleteById(id);
    }

    @Override
    public List getAllOrders() {
        List orders = new ArrayList();
        repository.findAll().forEach(orders::add);
        return orders;
    }

    @Override
    public Order getOrderById(String id) {
        return repository.findById(id).orElseGet(Order::new);
    }
}
