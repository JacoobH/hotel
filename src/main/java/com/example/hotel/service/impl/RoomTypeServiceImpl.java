package com.example.hotel.service.impl;

import com.example.hotel.dao.IRoomTypeDao;
import com.example.hotel.model.RoomTypeModel;
import com.example.hotel.service.IRoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("roomTypeService")
@Transactional
public class RoomTypeServiceImpl implements IRoomTypeService {

    private IRoomTypeDao rtd;

    @Autowired
    public void setAd(IRoomTypeDao rtd) {
        this.rtd = rtd;
    }

    @Override
    public int add(RoomTypeModel rtm) {
        return rtd.insert(rtm);
    }

    @Override
    public void modify(RoomTypeModel rtm) {
        rtd.update(rtm);
    }

    @Override
    public void remove(RoomTypeModel rtm) {
        rtd.delete(rtm);
    }

    @Override
    public List<RoomTypeModel> getListBySearchText(String searchText) {
        return rtd.selectListBySearchText(searchText);
    }

    @Override
    public RoomTypeModel getRoomTypeById(int id) {
        return rtd.selectRoomTypeById(id);
    }
}
