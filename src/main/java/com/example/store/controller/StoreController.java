package com.example.store.controller;

import com.example.store.model.ProductAvailability;
import com.example.store.model.ProductAvailabilityDTO;
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

    @Autowired
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @PostMapping(value = "/sweater")
    public HttpStatus createProduct(@RequestBody ProductAvailability productAvailability) { // Изменил тип даннхы на HttpStatus, тем самым возвращаю статус "ОК"
        storeService.create(productAvailability);
        return HttpStatus.OK;
    }

    @GetMapping(value = "/availability")
    public ResponseEntity<List<ProductAvailabilityDTO>> getProductsByCity(@RequestParam String city) {
        List<ProductAvailabilityDTO> products = storeService.getProductsByCity(city);
        return ResponseEntity.ok(products);
    }
}