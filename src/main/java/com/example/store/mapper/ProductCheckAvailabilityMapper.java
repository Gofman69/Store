package com.example.store.mapper;

import com.example.store.model.ProductAvailability;
import com.example.store.model.ProductCheckAvailabilityDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductCheckAvailabilityMapper {

    ProductCheckAvailabilityDTO toDTO(ProductAvailability model);

    ProductAvailability toModel(ProductCheckAvailabilityDTO dto);
}
