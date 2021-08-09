package com.takirahal.ecommerce.service.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A DTO for the {@link com.takirahal.ecommerce.domain.Cart} entity.
 */
public class CartDTO implements Serializable {
    
    private Long id;

    private Double totalPrice;


    private Long userId;

    private String userLogin;
    private Set<ProductDTO> products = new HashSet<>();
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public Set<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductDTO> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CartDTO)) {
            return false;
        }

        return id != null && id.equals(((CartDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CartDTO{" +
            "id=" + getId() +
            ", totalPrice=" + getTotalPrice() +
            ", userId=" + getUserId() +
            ", userLogin='" + getUserLogin() + "'" +
            ", products='" + getProducts() + "'" +
            "}";
    }
}
