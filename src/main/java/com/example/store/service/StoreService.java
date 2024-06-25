package com.example.store.service;

import com.example.store.mapper.ProductAvailabilityMapper;
import com.example.store.mapper.ProductCheckAvailabilityMapper;
import com.example.store.model.ProductAvailability;
import com.example.store.model.ProductAvailabilityDTO;
import com.example.store.model.ProductCheckAvailabilityDTO;
import com.example.store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface StoreService {

    ProductCheckAvailabilityDTO create(ProductCheckAvailabilityDTO dto);

    List<ProductAvailabilityDTO> getProductsByCity(String city);
}
