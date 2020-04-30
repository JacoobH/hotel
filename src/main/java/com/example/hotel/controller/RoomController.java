package com.example.hotel.controller;

import com.example.hotel.model.RoomModel;
import com.example.hotel.service.IRoomService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
@CrossOrigin
public class RoomController {
    private IRoomService rs;

    @Autowired
    public void setRs(IRoomService rs) {
        this.rs = rs;
    }

    @RequestMapping("/add")
    public RoomModel add( @RequestBody RoomModel rm){
        rs.add(rm);
        return rm;
    }

    @RequestMapping("/remove")
    public void remove( @RequestBody RoomModel rm){
        rs.remove(rm);
    }

    @RequestMapping("/modify")
    public void modify( @RequestBody RoomModel rm){
        rs.modify(rm);
    }

    @RequestMapping("/getListByType")
    public PageInfo<RoomModel> getListByArticle(int pageNo, int pageSize, int tid){
        PageHelper.startPage(pageNo, pageSize,true);
        return new PageInfo<>(rs.getListByType(tid));
    }

    @RequestMapping("/getRoomById")
    public RoomModel getRoomById(int id){
        return rs.getRoomById(id);
    }

    @RequestMapping("/getRoomByAll")
    public PageInfo<RoomModel> getRoomByAll(int pageNo, int pageSize){
        PageHelper.startPage(pageNo, pageSize,true);
        return new PageInfo<>(rs.getRoomByAll());
    }
}
