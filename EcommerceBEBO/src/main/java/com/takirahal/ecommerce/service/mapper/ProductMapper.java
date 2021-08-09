package com.takirahal.ecommerce.service.mapper;


import com.takirahal.ecommerce.domain.*;
import com.takirahal.ecommerce.service.dto.ProductDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Product} and its DTO {@link ProductDTO}.
 */
@Mapper(componentModel = "spring", uses = {UserMapper.class, CategoryMapper.class})
public interface ProductMapper extends EntityMapper<ProductDTO, Product> {

    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "user.login", target = "userLogin")
    @Mapping(source = "category.id", target = "categoryId")
    ProductDTO toDto(Product product);

    @Mapping(source = "userId", target = "user")
    @Mapping(source = "categoryId", target = "category")
    @Mapping(target = "productimages", ignore = true)
    @Mapping(target = "removeProductimages", ignore = true)
    @Mapping(target = "carts", ignore = true)
    @Mapping(target = "removeCart", ignore = true)
    Product toEntity(ProductDTO productDTO);

    default Product fromId(Long id) {
        if (id == null) {
            return null;
        }
        Product product = new Product();
        product.setId(id);
        return product;
    }
}
