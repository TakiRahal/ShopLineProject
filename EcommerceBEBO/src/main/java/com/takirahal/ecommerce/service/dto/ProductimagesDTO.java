package com.takirahal.ecommerce.service.dto;

import java.time.LocalDate;
import java.io.Serializable;

/**
 * A DTO for the {@link com.takirahal.ecommerce.domain.Productimages} entity.
 */
public class ProductimagesDTO implements Serializable {

    private Long id;

    private String path;

    private LocalDate createDate;

    private Long productId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProductimagesDTO)) {
            return false;
        }

        return id != null && id.equals(((ProductimagesDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ProductimagesDTO{" +
            "id=" + getId() +
            ", path='" + getPath() + "'" +
            ", createDate='" + getCreateDate() + "'" +
            ", productId=" + getProductId() +
            "}";
    }
}
