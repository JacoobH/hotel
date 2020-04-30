package com.example.hotel.controller;

import com.example.hotel.model.EmployeeModel;
import com.example.hotel.model.GuestModel;
import com.example.hotel.model.OrderModel;
import com.example.hotel.service.IEmployeeService;
import com.example.hotel.service.IGuestService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/guest")
@CrossOrigin
public class GuestController {
    private IGuestService gs;

    @Autowired
    public void setGs(IGuestService gs) {
        this.gs = gs;
    }

    @RequestMapping("/add")
    public GuestModel add(@RequestBody GuestModel gm){
        gs.add(gm);
        return gm;
    }

    @RequestMapping("/remove")
    public void remove( @RequestBody GuestModel gm){
        gs.remove(gm);
    }

    @RequestMapping("/modify")
    public void modify( @RequestBody GuestModel gm){
        gs.modify(gm);
    }

    @RequestMapping("/getGuestById")
    public GuestModel getGuestById(int id) {
        return gs.getGuestById(id);
    }

    @RequestMapping("/getGuestByAll")
    public PageInfo<GuestModel> getGuestByAll(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize,true);
        return new PageInfo<>(gs.getGuestByAll());
    }
}
