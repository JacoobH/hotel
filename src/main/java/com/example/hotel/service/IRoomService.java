package com.example.hotel.service;

import com.example.hotel.model.RoomModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IRoomService {
    int add(RoomModel rm);
    void modify(RoomModel rm);
    void remove(RoomModel rm);
    List<RoomModel> getListByType(int tid);
    RoomModel getRoomById(int id);
    List<RoomModel> getRoomByAll();
}
