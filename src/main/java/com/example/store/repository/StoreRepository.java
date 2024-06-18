package com.example.store.repository;

import com.example.store.model.ProductAvailability;
import org.springframework.data.repository.CrudRepository;

public interface StoreRepository extends CrudRepository<ProductAvailability, Integer> {
}
