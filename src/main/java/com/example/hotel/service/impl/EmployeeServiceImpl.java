package com.example.hotel.service.impl;

import com.example.hotel.dao.IEmployeeDao;
import com.example.hotel.model.EmployeeModel;
import com.example.hotel.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {
    private IEmployeeDao ed;

    @Autowired
    public void setEd(IEmployeeDao ed) {
        this.ed = ed;
    }

    @Override
    public int add(EmployeeModel em) {
        return ed.insert(em);
    }

    @Override
    public void modify(EmployeeModel em) {
        ed.update(em);
    }

    @Override
    public void remove(EmployeeModel em) {
        ed.delete(em);
    }

    @Override
    public EmployeeModel getEmployeeById(int id) {
        return ed.selectEmployeeById(id);
    }

    @Override
    public List<EmployeeModel> getEmployeeByAll() {
        return ed.selectEmployeeByAll();
    }
}
