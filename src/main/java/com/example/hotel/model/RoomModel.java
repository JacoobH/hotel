package com.example.hotel.model;

import org.apache.ibatis.type.Alias;

@Alias("Room")
public class RoomModel {
    private Integer id;
    private RoomTypeModel type;
    private String status;
    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RoomTypeModel getType() {
        return type;
    }

    public void setType(RoomTypeModel type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "RoomModel{" +
                "id=" + id +
                ", type=" + type.getName() +
                ", status='" + status + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
