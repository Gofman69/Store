package com.example.store.service;

import com.example.store.model.ProductAvailability;
import com.example.store.model.ProductAvailabilityDTO;
import java.util.List;

public interface StoreService {

    void create(ProductAvailability productAvailability);

    List<ProductAvailabilityDTO> getProductsByCity(String city);
}
