package com.example.store.service;

import com.example.store.mapper.ProductAvailabilityMapper;
import com.example.store.model.ProductAvailability;
import com.example.store.model.ProductAvailabilityDTO;
import com.example.store.repository.StoreRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StoreServiceImpl implements StoreService {

    private final StoreRepository storeRepository;
    private ProductAvailabilityMapper productAvailabilityMapper;

    public StoreServiceImpl(StoreRepository storeRepository, ProductAvailabilityMapper productAvailabilityMapper) {
        this.storeRepository = storeRepository;
        this.productAvailabilityMapper = productAvailabilityMapper;
    }

    public void create(ProductAvailability productAvailability) {
        storeRepository.save(productAvailability);
    }

    public List<ProductAvailabilityDTO> getProductsByCity(String city) {
        List<ProductAvailability> products = storeRepository.findByCity(city);
        return products.stream()
                .map(productAvailabilityMapper::toDTO)
                .collect(Collectors.toList());
    }
}
