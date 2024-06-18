package com.example.store.model;

import lombok.Data;

@Data
public class ProductCheckAvailabilityDTO {

    private String partNumber;
    private String city;
    private String address;
    private short size;
    private Colors.Color color;
    private int count;
    private String cost;
}
