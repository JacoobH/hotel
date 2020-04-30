package com.example.hotel.dao;

import com.example.hotel.model.RoomTypeModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface IRoomTypeDao {
    int insert(RoomTypeModel rtm);
    void update(RoomTypeModel rtm);
    void delete(RoomTypeModel rtm);
    List<RoomTypeModel> selectListBySearchText(@Param("searchText") String searchText);
    RoomTypeModel selectRoomTypeById(int id);
}
