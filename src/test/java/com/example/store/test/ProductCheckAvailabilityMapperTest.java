package com.example.store.test;

import com.example.store.mapper.ProductCheckAvailabilityMapper;
import com.example.store.model.Colors;
import com.example.store.model.ProductAvailability;
import com.example.store.model.ProductCheckAvailabilityDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductCheckAvailabilityMapperTest {

    @Autowired
    private ProductCheckAvailabilityMapper mapperUnderTest;

    @Test
    void ModelToDTO()
    {
        ProductAvailability model = new ProductAvailability();

        model.setAddress("Tut");
        model.setCity("Vrn");
        model.setCost(123);
        model.setCount(5);
        model.setSize(46);
        model.setColor("Red");
        model.setPart_number("1231412");

        ProductCheckAvailabilityDTO dto = mapperUnderTest.toDTO(model);

        Assertions.assertNotNull(dto);
        Assertions.assertEquals(model.getAddress(), dto.getAddress());
        Assertions.assertEquals(model.getCity(), dto.getCity());
        Assertions.assertEquals(model.getCost(), dto.getCost());
        Assertions.assertEquals(model.getCount(), dto.getCount());
        Assertions.assertEquals(model.getSize(), dto.getSize());
        Assertions.assertEquals(model.getColor(), dto.getColor());
        Assertions.assertEquals(model.getPart_number(), dto.getPartNumber());
    }

    @Test
    void DTOToModel()
    {
        ProductCheckAvailabilityDTO dto = new ProductCheckAvailabilityDTO();
        dto.setAddress("Tut");
        dto.setCity("Vrn");
        dto.setCost("123531");
        dto.setCount(1);
        dto.setSize((short)38);
        dto.setColor(Colors.Color.RED);
        dto.setPartNumber("1231412");

        ProductAvailability model = mapperUnderTest.toModel(dto);

        Assertions.assertNotNull(mapperUnderTest.toModel(dto));
        Assertions.assertEquals(dto.getAddress(), model.getAddress());
        Assertions.assertEquals(dto.getCity(), model.getCity());
        Assertions.assertEquals(dto.getCost(), model.getCost());
        Assertions.assertEquals(dto.getCount(), model.getCount());
        Assertions.assertEquals(dto.getSize(), model.getSize());
        Assertions.assertEquals(dto.getColor(), model.getColor());
        Assertions.assertEquals(dto.getPartNumber(), model.getPart_number());
    }

}
