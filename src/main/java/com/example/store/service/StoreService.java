package com.example.store.service;

import com.example.store.model.ProductAvailability;
import com.example.store.model.ProductAvailabilityDTO;
import org.springframework.http.HttpStatus;

import java.util.List;


public interface StoreService {

    HttpStatus create(ProductAvailability productAvailability); // Изменил тип даннхы на HttpStatus, тем самым возвращаю статус "ОК"

    List<ProductAvailabilityDTO> getProductsByCity(String city);
}
