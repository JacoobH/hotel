package com.example.hotel.service.impl;

import com.example.hotel.dao.IRoomDao;
import com.example.hotel.model.RoomModel;
import com.example.hotel.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("roomService")
@Transactional
public class RoomServiceImpl implements IRoomService {
    private IRoomDao rd;


    @Autowired
    public void setRd(IRoomDao rd) {
        this.rd = rd;
    }

    @Override
    public int add(RoomModel rm) {
        return rd.insert(rm);
    }

    @Override
    public void modify(RoomModel rm) {
        rd.update(rm);
    }

    @Override
    public void remove(RoomModel rm) {
        rd.delete(rm);
    }

    @Override
    public List<RoomModel> getListByType(int tid) {
        return rd.selectListByType(tid);
    }

    @Override
    public RoomModel getRoomById(int id) {
        return rd.selectRoomById(id);
    }

    @Override
    public List<RoomModel> getRoomByAll() {
        return rd.selectListByAll();
    }
}
