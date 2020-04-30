package com.example.hotel.dao;

import com.example.hotel.model.EmployeeModel;
import com.example.hotel.model.RoomModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface IEmployeeDao {
    int insert(EmployeeModel em);
    void update(EmployeeModel em);
    void delete(EmployeeModel em);
    EmployeeModel selectEmployeeById(int id);
    List<EmployeeModel> selectEmployeeByAll();
}
