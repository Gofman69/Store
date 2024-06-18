package com.example.store.service;

import com.example.store.model.ProductAvailability;

public interface StoreService {

    void create(ProductAvailability productAvailability);

    ProductAvailability read(String city);
}
