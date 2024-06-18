package com.example.store.model;

import lombok.Data;

@Data
public class ProductAvailabilityDTO {

    private long partnumber;
    private String city;
    private int size;
    private Colors.Color color;
    private int count;
    private String soreAddress;
    private String cost;
}