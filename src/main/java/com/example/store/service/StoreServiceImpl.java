package com.example.store.service;

import com.example.store.mapper.ProductAvailabilityMapper;
import com.example.store.mapper.ProductCheckAvailabilityMapper;
import com.example.store.model.ProductAvailability;
import com.example.store.model.ProductAvailabilityDTO;
import com.example.store.model.ProductCheckAvailabilityDTO;
import com.example.store.repository.StoreRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class StoreServiceImpl implements StoreService {

    private final StoreRepository storeRepository;
    private ProductAvailabilityMapper productAvailabilityMapper;
    private ProductCheckAvailabilityMapper productCheckAvailabilityMapper;

    public StoreServiceImpl(StoreRepository storeRepository, ProductAvailabilityMapper productAvailabilityMapper, ProductCheckAvailabilityMapper productCheckAvailabilityMapper) {
        this.storeRepository = storeRepository;
        this.productAvailabilityMapper = productAvailabilityMapper;
        this.productCheckAvailabilityMapper = productCheckAvailabilityMapper;
    }


    public ProductCheckAvailabilityDTO create(ProductCheckAvailabilityDTO productCheckAvailabilityDTO) {
        ProductAvailability product = productCheckAvailabilityMapper.toModel(productCheckAvailabilityDTO);
        ProductAvailability savedProduct = storeRepository.save(product);
        return productCheckAvailabilityMapper.toDTO(savedProduct);
    }


    public List<ProductAvailabilityDTO> getProductsByCity(String city) {
        List<ProductAvailability> products = storeRepository.findByCity(city);
        return products.stream()
                .map(productAvailabilityMapper::toDTO)
                .collect(Collectors.toList());
    }


//    @Override
//    public void create(ProductAvailability productAvailability){
//        storeRepository.save(productAvailability);
//    }

//    @Override
//    public List<ProductAvailability> read(String city){
//        return storeRepository.findByCity(city);
//    }
}
