package com.example.store.mapper;

import com.example.store.model.Colors;
import com.example.store.model.ProductAvailability;
import com.example.store.model.ProductCheckAvailabilityDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductCheckAvailabilityMapper {

    @Mapping(source = "color", target = "color")
    ProductCheckAvailabilityDTO toDTO(ProductAvailability model);

    @Mapping(source = "color", target = "color")
    ProductAvailability toModel(ProductCheckAvailabilityDTO dto);

    default Colors.Color stringToColor(String color) {
        return Colors.Color.valueOf(color.toUpperCase());
    }

    default String colorToString(Colors.Color color) {
        return color.name();
    }
}

