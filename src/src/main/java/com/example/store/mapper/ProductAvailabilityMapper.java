package com.example.store.mapper;

import com.example.store.model.ProductAvailability;
import com.example.store.model.ProductAvailabilityDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductAvailabilityMapper {

    ProductAvailabilityDTO toDTO(ProductAvailability model);

    ProductAvailability toModel(ProductAvailabilityDTO dto);
}
