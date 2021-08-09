package com.takirahal.ecommerce.service.mapper;


import com.takirahal.ecommerce.domain.*;
import com.takirahal.ecommerce.service.dto.CartDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Cart} and its DTO {@link CartDTO}.
 */
@Mapper(componentModel = "spring", uses = {UserMapper.class, ProductMapper.class})
public interface CartMapper extends EntityMapper<CartDTO, Cart> {

    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "user.login", target = "userLogin")
    CartDTO toDto(Cart cart);

    @Mapping(source = "userId", target = "user")
    @Mapping(target = "removeProduct", ignore = true)
    Cart toEntity(CartDTO cartDTO);

    default Cart fromId(Long id) {
        if (id == null) {
            return null;
        }
        Cart cart = new Cart();
        cart.setId(id);
        return cart;
    }
}
