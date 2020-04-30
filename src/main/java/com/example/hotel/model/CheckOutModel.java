package com.example.hotel.model;

import org.apache.ibatis.type.Alias;

import java.sql.Date;
@Alias("CheckOut")
public class CheckOutModel {
    private Integer id;
    private EmployeeModel employee;
    private GuestModel guest;
    private RoomModel room;
    private Date time;
    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EmployeeModel getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeModel employee) {
        this.employee = employee;
    }

    public GuestModel getGuest() {
        return guest;
    }

    public void setGuest(GuestModel guest) {
        this.guest = guest;
    }

    public RoomModel getRoom() {
        return room;
    }

    public void setRoom(RoomModel room) {
        this.room = room;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "CheckOutModel{" +
                "id=" + id +
                ", employee=" + employee.getName() +
                ", guest=" + guest.getName() +
                ", room=" + room.getId() +
                ", time=" + time +
                ", note='" + note + '\'' +
                '}';
    }
}
