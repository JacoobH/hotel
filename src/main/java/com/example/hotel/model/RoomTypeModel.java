package com.example.hotel.model;

import org.apache.ibatis.type.Alias;

@Alias("RoomType")
public class RoomTypeModel {
    private Integer id;
    private String name;
    private Integer rent;
    private Integer totalAmount;
    private Integer remainAmount;
    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRent() {
        return rent;
    }

    public void setRent(Integer rent) {
        this.rent = rent;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getRemainAmount() {
        return remainAmount;
    }

    public void setRemainAmount(Integer remainAmount) {
        this.remainAmount = remainAmount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "RoomTypeModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rent=" + rent +
                ", totalAmount=" + totalAmount +
                ", remainAmount=" + remainAmount +
                ", note='" + note + '\'' +
                '}';
    }
}
