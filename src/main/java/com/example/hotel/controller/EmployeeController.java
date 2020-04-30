package com.example.hotel.controller;

import com.example.hotel.model.EmployeeModel;
import com.example.hotel.model.GuestModel;
import com.example.hotel.model.RoomModel;
import com.example.hotel.service.IEmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeController {
    private IEmployeeService es;

    @Autowired
    public void setEs(IEmployeeService es) {
        this.es = es;
    }

    @RequestMapping("/add")
    public EmployeeModel add(@RequestBody EmployeeModel em){
        es.add(em);
        return em;
    }

    @RequestMapping("/remove")
    public void remove( @RequestBody EmployeeModel em){
        es.remove(em);
    }

    @RequestMapping("/modify")
    public void modify( @RequestBody EmployeeModel em){
        es.modify(em);
    }

    @RequestMapping("/getEmployeeById")
    public EmployeeModel getEmployeeById(int id) {
        return es.getEmployeeById(id);
    }

    @RequestMapping("/getEmployeeByAll")
    public PageInfo<EmployeeModel> getEmployeeByAll(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize,true);
        return new PageInfo<>(es.getEmployeeByAll());
    }
}
