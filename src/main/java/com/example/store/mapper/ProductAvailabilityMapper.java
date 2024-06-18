package com.example.store.mapper;

import com.example.store.model.Colors;
import com.example.store.model.ProductAvailability;
import com.example.store.model.ProductAvailabilityDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductAvailabilityMapper {

    @Mapping(source = "color", target = "color")
    ProductAvailabilityDTO toDTO(ProductAvailability model);

    @Mapping(source = "color", target = "color")
    ProductAvailability toModel(ProductAvailabilityDTO model);

    default Colors.Color stringToColor(String color) {
        return Colors.Color.valueOf(color.toUpperCase());
    }

    default String colorToString(Colors.Color color) {
        return color.name();
    }
}
