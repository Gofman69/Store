package com.example.store.controller;



import com.example.store.model.Color;
import com.example.store.model.ProductAvailability;
import com.example.store.model.ProductAvailabilityDTO;
import com.example.store.model.ProductCheckAvailabilityDTO;
import com.example.store.repository.StoreRepository;
import com.example.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/acc")
public class StoreController {

    private final StoreService storeService;

    private final StoreRepository storeRepository;

    @Autowired
    public StoreController(StoreService storeService, StoreRepository storeRepository) {
        this.storeService = storeService;
        this.storeRepository = storeRepository;
    }

    @GetMapping(value = "/test")
    public String test(){
        ProductAvailability productAvailability = new ProductAvailability();
        productAvailability.setSize(12);
        productAvailability.setCost(12);
        productAvailability.setCity("Dom");
        productAvailability.setCount(1);
        productAvailability.setAddress("Tut");
        productAvailability.setColor(Color.RED);
        productAvailability.setPartNumber("12351");
        storeRepository.save(productAvailability);
        return null;
    }

    @PostMapping(value = "/sweater")
    public ResponseEntity<ProductCheckAvailabilityDTO> createProduct(@RequestBody ProductCheckAvailabilityDTO productDTO) {
        ProductCheckAvailabilityDTO createdProduct = storeService.create(productDTO);
        return ResponseEntity.ok(createdProduct);
    }

    @GetMapping(value = "/availability")
    public ResponseEntity<List<ProductAvailabilityDTO>> getProductsByCity(@RequestParam String city) {
        List<ProductAvailabilityDTO> products = storeService.getProductsByCity(city);
        return ResponseEntity.ok(products);
    }
}