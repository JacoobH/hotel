package com.example.hotel.controller;

import com.example.hotel.model.RoomTypeModel;
import com.example.hotel.service.IRoomTypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roomType")
@CrossOrigin
public class RoomTypeController {
    private IRoomTypeService rts;

    @Autowired
    public void setRts(IRoomTypeService rts) {
        this.rts = rts;
    }

    @RequestMapping("/add")
    public RoomTypeModel add(@RequestBody RoomTypeModel rtm){
        rts.add(rtm);
        System.out.println(rtm);
        return rtm;
    }

    @RequestMapping("/modify")
    public void modify(@RequestBody RoomTypeModel rtm){
        rts.modify(rtm);
    }

    @RequestMapping("/remove")
    public void remove(@RequestBody RoomTypeModel rtm){
        rts.remove(rtm);
    }

    @RequestMapping("/getListBySearchText")
    public PageInfo<RoomTypeModel> getListBySearchText(int pageNo, int pageSize, String searchText){
        PageHelper.startPage(pageNo, pageSize,true);
        return new PageInfo<>(rts.getListBySearchText(searchText));
    }

    @RequestMapping("/getRoomTypeById")
    public RoomTypeModel getRoomTypeById(int id){
        return rts.getRoomTypeById(id);
    }
}
