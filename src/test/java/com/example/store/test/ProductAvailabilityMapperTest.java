package com.example.store.test;

import com.example.store.mapper.ProductAvailabilityMapper;
import com.example.store.model.Color;
import com.example.store.model.ProductAvailability;
import com.example.store.model.ProductAvailabilityDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductAvailabilityMapperTest {

    @Autowired
    private ProductAvailabilityMapper mapperUnderTest;

    @Test
    void ModelToDTO()
    {
        ProductAvailability model = new ProductAvailability();

        model.setAddress("Tut");
        model.setCity("Vrn");
        model.setCost((float) 123.45);
        model.setCount(5);
        model.setSize(46);
        model.setColor(Color.valueOf("RED"));
        model.setPartNumber("1231412");

        ProductAvailabilityDTO dto = mapperUnderTest.toDTO(model);

        Assertions.assertNotNull(dto);
        Assertions.assertEquals(model.getAddress(), dto.getAddress());
        Assertions.assertEquals(model.getCity(), dto.getCity());
        Assertions.assertEquals(model.getCost(), dto.getCost());
        Assertions.assertEquals(model.getCount(), dto.getCount());
        Assertions.assertEquals(model.getSize(), dto.getSize());
        Assertions.assertEquals(model.getColor(), dto.getColor());
        Assertions.assertEquals(model.getPartNumber(), dto.getPartNumber());

    }

    @Test
    void DTOToModel()
    {
        ProductAvailabilityDTO dto = new ProductAvailabilityDTO();
        dto.setAddress("Tut");
        dto.setCity("Vrn");
        dto.setCost((float) 123.45);
        dto.setCount(1);
        dto.setSize((short)38);
        dto.setColor(Color.valueOf("RED"));
        dto.setPartNumber("1231412");

        ProductAvailability model = mapperUnderTest.toModel(dto);

        Assertions.assertNotNull(mapperUnderTest.toModel(dto));
        Assertions.assertEquals(dto.getAddress(), model.getAddress());
        Assertions.assertEquals(dto.getCity(), model.getCity());
        Assertions.assertEquals(dto.getCost(), model.getCost());
        Assertions.assertEquals(dto.getCount(), model.getCount());
        Assertions.assertEquals(dto.getSize(), model.getSize());
        Assertions.assertEquals(dto.getColor(), model.getColor());
        Assertions.assertEquals(dto.getPartNumber(), model.getPartNumber());
    }
}
