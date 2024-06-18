package com.example.store.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "shop")
public class ProductAvailability
{
    @Id
    @Column(name = "part_number_id")
    @Getter @Setter
    private String part_number;

    @Column(name = "city")
    @Setter @Getter
    private String city;

    @Column(name = "address")
    @Setter @Getter
    private String address;

    @Column(name = "size")
    @Setter @Getter
    private int size;

    @Column(name = "color")
    @Setter @Getter
    private String color;

    @Column(name = "count")
    @Setter @Getter
    private int count;

    @Column(name = "cost")
    @Setter @Getter
    private float cost;

}
