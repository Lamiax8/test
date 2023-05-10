package com.example.test;

public class apart {
    private int id;
    private String name;

    private int price;


    private String location;

    private int rooms;

    public apart() {
    }

    public apart(int id, String name, int price, String location, int rooms) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.location = location;
        this.rooms = rooms;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Apartment ID: " + id + ", Name:" + name + ", Price=" + price +",Location: "+location +", Rooms: "+rooms ;
    }
}
