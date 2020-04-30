package com.example.hotel.dao;

import com.example.hotel.model.CheckOutModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface ICheckOutDao {
    int insert(CheckOutModel cm);
    void update(CheckOutModel cm);
    void delete(CheckOutModel cm);
    List<CheckOutModel> selectCheckOutByAll();
    CheckOutModel selectCheckOutById(int id);
}
