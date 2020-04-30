package com.example.hotel.service;

import com.example.hotel.model.CheckOutModel;

import java.util.List;

public interface ICheckOutService {
    int add(CheckOutModel cm);
    void modify(CheckOutModel cm);
    void remove(CheckOutModel cm);
    List<CheckOutModel> getCheckOutByAll();
    CheckOutModel getCheckOutById(int id);
}
