package com.s1mob.mini_ecommerce_project.service;

import java.util.List;

import com.s1mob.mini_ecommerce_project.models.Order;

public interface OrderService {
    Order saveOrder(Order order);
    void deleteOrder(String id);
    List getAllOrders();
    Order getOrderById(String id);
}
