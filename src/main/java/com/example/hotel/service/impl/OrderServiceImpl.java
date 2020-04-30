package com.example.hotel.service.impl;

import com.example.hotel.dao.IOrderDao;
import com.example.hotel.model.OrderModel;
import com.example.hotel.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("orderService")
@Transactional
public class OrderServiceImpl implements IOrderService {

    private IOrderDao od;

    @Autowired
    public void setOd(IOrderDao od) {
        this.od = od;
    }

    @Override
    public int add(OrderModel om) {
        return od.insert(om);
    }

    @Override
    public void modify(OrderModel om) {
        od.update(om);
    }

    @Override
    public void remove(OrderModel om) {
        od.delete(om);
    }

    @Override
    public List<OrderModel> getOrderByAll() {
        return od.selectOrderByAll();
    }

    @Override
    public OrderModel getOrderById(int id) {
        return od.selectOrderById(id);
    }
}
