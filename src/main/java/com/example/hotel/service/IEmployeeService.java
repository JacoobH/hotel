package com.example.hotel.service;

import com.example.hotel.model.EmployeeModel;

import java.util.List;

public interface IEmployeeService {
    int add(EmployeeModel em);
    void modify(EmployeeModel em);
    void remove(EmployeeModel em);
    EmployeeModel getEmployeeById(int id);
    List<EmployeeModel> getEmployeeByAll();
}
