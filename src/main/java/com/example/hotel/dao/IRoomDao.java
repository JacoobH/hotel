package com.example.hotel.dao;

import com.example.hotel.model.RoomModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface IRoomDao {
    int insert(RoomModel rm);
    void update(RoomModel rm);
    void delete(RoomModel rm);
    List<RoomModel> selectListByType(@Param("tid") int tid);
    RoomModel selectRoomById(int id);
    List<RoomModel> selectListByAll();
}
