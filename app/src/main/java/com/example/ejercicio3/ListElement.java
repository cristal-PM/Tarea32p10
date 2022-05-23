package com.example.ejercicio3;

public class ListElement {
    public String color;
    public String name;
    public String city;
    public String status;

    public ListElement() {
    }

    public ListElement(String color,String name,String city,String status) {
        this.color = color;
        this.name=name;
        this.city=city;
        this.status=status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
