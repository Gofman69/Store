package com.example.store.service;

import com.example.store.model.ProductAvailability;
import com.example.store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    private final StoreRepository storeRepository;

    public StoreServiceImpl(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Override
    public void create(ProductAvailability productAvailability){
        storeRepository.save(productAvailability);
    }

//    @Override
//    public List<ProductAvailability> read(String city){
//        return storeRepository.findAllById(city<ProductAvailability> city);
//    }
}
