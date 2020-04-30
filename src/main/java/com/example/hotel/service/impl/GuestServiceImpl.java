package com.example.hotel.service.impl;

import com.example.hotel.dao.IGuestDao;
import com.example.hotel.model.GuestModel;
import com.example.hotel.service.IGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("guestService")
@Transactional
public class GuestServiceImpl implements IGuestService {
    private IGuestDao gd;

    @Autowired
    public void setGd(IGuestDao gd) {
        this.gd = gd;
    }


    @Override
    public int add(GuestModel gm) {
        return gd.insert(gm);
    }

    @Override
    public void modify(GuestModel gm) {
        gd.update(gm);
    }

    @Override
    public void remove(GuestModel gm) {
        gd.delete(gm);
    }

    @Override
    public GuestModel getGuestById(int id) {
        return gd.selectGuestById(id);
    }

    @Override
    public List<GuestModel> getGuestByAll() {
        return gd.selectGuestByAll();
    }
}
