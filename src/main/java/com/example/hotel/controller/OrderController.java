package com.example.hotel.controller;

import com.example.hotel.model.OrderModel;
import com.example.hotel.model.OrderModel;
import com.example.hotel.model.RoomTypeModel;
import com.example.hotel.service.IOrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {
    private IOrderService os;

    @Autowired
    public void setOs(IOrderService os) {
        this.os = os;
    }

    @RequestMapping("/add")
    public OrderModel add(@RequestBody OrderModel om){
        os.add(om);
        return om;
    }

    @RequestMapping("/remove")
    public void remove( @RequestBody OrderModel om){
        os.remove(om);
    }

    @RequestMapping("/modify")
    public void modify( @RequestBody OrderModel om){
        os.modify(om);
    }

    @RequestMapping("/getOrderByAll")
    public PageInfo<OrderModel> getOrderByAll(int pageNo, int pageSize){
        PageHelper.startPage(pageNo, pageSize,true);
        return new PageInfo<>(os.getOrderByAll());
    }

    @RequestMapping("/getOrderById")
    public OrderModel getOrderById(int id){
        return os.getOrderById(id);
    }
}
