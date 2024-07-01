package com.example.store.model;

import jakarta.persistence.*;

@Entity
@Table(name = "shop")
public class ProductAvailability
{
    @Id
    @Column(name = "part_number_id")
    private String partNumber;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    @Column(name = "size")
    private int size;


    @Column(name = "color")
    private String color;

    @Column(name = "count")
    private int count;

    @Column(name = "cost")
    private float cost;

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color.getValue();
    }
}
