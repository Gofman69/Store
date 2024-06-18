package com.example.store.controller;

import com.example.store.model.ProductAvailability;
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
    public ResponseEntity<?> create(@RequestBody ProductAvailability productAvailability) {
        storeService.create(productAvailability);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/availability/{city}")
    public ResponseEntity<List<ProductAvailability>> read(@PathVariable(name = "city") String city) {
        final List<ProductAvailability> productAvailability = storeService.read(city);

        return productAvailability != null
                ? new ResponseEntity<>(productAvailability, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
//"acc/availability" find
//"acc/sweater" set