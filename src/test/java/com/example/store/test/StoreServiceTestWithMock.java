package com.example.store.test;

import com.example.store.mapper.ProductAvailabilityMapper;
import com.example.store.model.Color;
import com.example.store.model.ProductAvailability;
import com.example.store.model.ProductAvailabilityDTO;
import com.example.store.repository.StoreRepository;
import com.example.store.service.StoreServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StoreServiceTestWithMock {

    @Mock
    private StoreRepository storeRepository;

    @Mock
    private ProductAvailabilityMapper productAvailabilityMapper;

    @InjectMocks
    private StoreServiceImpl storeService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateProduct() {
        ProductAvailability product = new ProductAvailability();
        product.setAddress("Tut");
        product.setCity("Vrn");
        product.setCost(123.45f);
        product.setCount(5);
        product.setSize(46);
        product.setColor(Color.RED);
        product.setPartNumber("1231412");

        when(storeRepository.save(any(ProductAvailability.class))).thenReturn(product);

        storeService.create(product);

        verify(storeRepository, times(1)).save(product);
    }

    @Test
    void testGetProductsByCity() {
        ProductAvailability product = new ProductAvailability();
        product.setAddress("Tut");
        product.setCity("Vrn");
        product.setCost(123.45f);
        product.setCount(5);
        product.setSize(46);
        product.setColor(Color.RED);
        product.setPartNumber("1231412");

        ProductAvailabilityDTO productDTO = new ProductAvailabilityDTO();
        productDTO.setAddress("Tut");
        productDTO.setCity("Vrn");
        productDTO.setCost((float) 123.45);
        productDTO.setCount(5);
        productDTO.setSize(46);
        productDTO.setColor(Color.RED);
        productDTO.setPartNumber("1231412");

        when(storeRepository.findByCity("Vrn")).thenReturn(Collections.singletonList(product));
        when(productAvailabilityMapper.toDTO(product)).thenReturn(productDTO);

        List<ProductAvailabilityDTO> products = storeService.getProductsByCity("Vrn");

        assertNotNull(products);
        assertFalse(products.isEmpty());
        assertEquals(1, products.size());
        assertEquals("Vrn", products.get(0).getCity());
    }
}
