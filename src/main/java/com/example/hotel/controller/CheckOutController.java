package com.example.hotel.controller;

import com.example.hotel.model.CheckOutModel;
import com.example.hotel.model.OrderModel;
import com.example.hotel.service.ICheckOutService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkOut")
@CrossOrigin
public class CheckOutController {
    private ICheckOutService cs;

    @Autowired
    public void setCos(ICheckOutService cs) {
        this.cs = cs;
    }

    @RequestMapping("/add")
    public CheckOutModel add(@RequestBody CheckOutModel cm){
        cs.add(cm);
        return cm;
    }

    @RequestMapping("/remove")
    public void remove( @RequestBody CheckOutModel cm){
        cs.remove(cm);
    }

    @RequestMapping("/modify")
    public void modify( @RequestBody CheckOutModel cm){
        cs.modify(cm);
    }

    @RequestMapping("/getOrderByAll")
    public PageInfo<CheckOutModel> getOrderByAll(int pageNo, int pageSize){
        PageHelper.startPage(pageNo, pageSize,true);
        return new PageInfo<>(cs.getCheckOutByAll());
    }

    @RequestMapping("/getOrderById")
    public CheckOutModel getOrderById(int id){
        return cs.getCheckOutById(id);
    }
}
