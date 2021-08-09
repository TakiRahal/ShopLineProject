package com.takirahal.ecommerce.service.dto;

import java.io.Serializable;
import java.util.Objects;
import io.github.jhipster.service.Criteria;
import io.github.jhipster.service.filter.BooleanFilter;
import io.github.jhipster.service.filter.DoubleFilter;
import io.github.jhipster.service.filter.Filter;
import io.github.jhipster.service.filter.FloatFilter;
import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.LongFilter;
import io.github.jhipster.service.filter.StringFilter;

/**
 * Criteria class for the {@link com.takirahal.ecommerce.domain.Cart} entity. This class is used
 * in {@link com.takirahal.ecommerce.web.rest.CartResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /carts?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class CartCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private DoubleFilter totalPrice;

    private LongFilter userId;

    private LongFilter productId;

    public CartCriteria() {
    }

    public CartCriteria(CartCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.totalPrice = other.totalPrice == null ? null : other.totalPrice.copy();
        this.userId = other.userId == null ? null : other.userId.copy();
        this.productId = other.productId == null ? null : other.productId.copy();
    }

    @Override
    public CartCriteria copy() {
        return new CartCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public DoubleFilter getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(DoubleFilter totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LongFilter getUserId() {
        return userId;
    }

    public void setUserId(LongFilter userId) {
        this.userId = userId;
    }

    public LongFilter getProductId() {
        return productId;
    }

    public void setProductId(LongFilter productId) {
        this.productId = productId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final CartCriteria that = (CartCriteria) o;
        return
            Objects.equals(id, that.id) &&
            Objects.equals(totalPrice, that.totalPrice) &&
            Objects.equals(userId, that.userId) &&
            Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
        id,
        totalPrice,
        userId,
        productId
        );
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CartCriteria{" +
                (id != null ? "id=" + id + ", " : "") +
                (totalPrice != null ? "totalPrice=" + totalPrice + ", " : "") +
                (userId != null ? "userId=" + userId + ", " : "") +
                (productId != null ? "productId=" + productId + ", " : "") +
            "}";
    }

}
