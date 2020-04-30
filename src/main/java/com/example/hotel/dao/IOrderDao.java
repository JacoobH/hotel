package com.example.hotel.dao;

import com.example.hotel.model.OrderModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface IOrderDao {
    int insert(OrderModel om);
    void update(OrderModel om);
    void delete(OrderModel om);
    List<OrderModel> selectOrderByAll();
    OrderModel selectOrderById(int id);
}
