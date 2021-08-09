package com.takirahal.ecommerce.service.mapper;


import com.takirahal.ecommerce.domain.*;
import com.takirahal.ecommerce.service.dto.ProductimagesDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Productimages} and its DTO {@link ProductimagesDTO}.
 */
@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface ProductimagesMapper extends EntityMapper<ProductimagesDTO, Productimages> {

    @Mapping(source = "product.id", target = "productId")
    ProductimagesDTO toDto(Productimages productimages);

    @Mapping(source = "productId", target = "product")
    Productimages toEntity(ProductimagesDTO productimagesDTO);

    default Productimages fromId(Long id) {
        if (id == null) {
            return null;
        }
        Productimages productimages = new Productimages();
        productimages.setId(id);
        return productimages;
    }
}
