package com.example.hotel.service;

import com.example.hotel.model.OrderModel;

import java.util.List;

public interface IOrderService {
    int add(OrderModel om);
    void modify(OrderModel om);
    void remove(OrderModel om);
    List<OrderModel> getOrderByAll();
    OrderModel getOrderById(int id);
}
