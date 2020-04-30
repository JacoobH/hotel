package com.example.hotel.service;

import com.example.hotel.model.RoomTypeModel;

import java.util.List;

public interface IRoomTypeService {
    int add(RoomTypeModel rtm);
    void modify(RoomTypeModel rtm);
    void remove(RoomTypeModel rtm);
    List<RoomTypeModel> getListBySearchText(String searchText);
    RoomTypeModel getRoomTypeById(int id);
}
