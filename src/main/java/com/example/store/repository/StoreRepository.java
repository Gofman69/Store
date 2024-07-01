package com.example.store.repository;

import com.example.store.model.ProductAvailability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StoreRepository extends JpaRepository<ProductAvailability, String> {

    List<ProductAvailability> findByCity(String city);
}

