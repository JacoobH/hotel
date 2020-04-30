package com.example.hotel.service.impl;

import com.example.hotel.dao.ICheckOutDao;
import com.example.hotel.model.CheckOutModel;
import com.example.hotel.service.ICheckOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.List;
@Service("checkOurService")
@Transactional
public class CheckOutServiceImpl implements ICheckOutService {
    private ICheckOutDao cd;

    @Autowired
    public void setCd(ICheckOutDao cd) {
        this.cd = cd;
    }

    @Override
    public int add(CheckOutModel cm) {
        return cd.insert(cm);
    }

    @Override
    public void modify(CheckOutModel cm) {
        cd.update(cm);
    }

    @Override
    public void remove(CheckOutModel cm) {
        cd.delete(cm);
    }

    @Override
    public List<CheckOutModel> getCheckOutByAll() {
        return cd.selectCheckOutByAll();
    }

    @Override
    public CheckOutModel getCheckOutById(int id) {
        return cd.selectCheckOutById(id);
    }
}
