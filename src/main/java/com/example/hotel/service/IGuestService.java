package com.example.hotel.service;

import com.example.hotel.model.GuestModel;

import java.util.List;

public interface IGuestService {
    int add(GuestModel gm);
    void modify(GuestModel gm);
    void remove(GuestModel gm);
    GuestModel getGuestById(int id);
    List<GuestModel> getGuestByAll();
}
