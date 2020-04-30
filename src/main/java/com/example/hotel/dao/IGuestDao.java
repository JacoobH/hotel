package com.example.hotel.dao;

import com.example.hotel.model.EmployeeModel;
import com.example.hotel.model.GuestModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface IGuestDao {
    int insert(GuestModel gm);
    void update(GuestModel gm);
    void delete(GuestModel gm);
    GuestModel selectGuestById(int id);
    List<GuestModel> selectGuestByAll();
}
