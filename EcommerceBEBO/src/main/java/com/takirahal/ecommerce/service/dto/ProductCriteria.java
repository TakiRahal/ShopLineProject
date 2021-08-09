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
import io.github.jhipster.service.filter.LocalDateFilter;

/**
 * Criteria class for the {@link com.takirahal.ecommerce.domain.Product} entity. This class is used
 * in {@link com.takirahal.ecommerce.web.rest.ProductResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /products?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class ProductCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter name;

    private DoubleFilter price;

    private LocalDateFilter createDate;

    private LongFilter userId;

    private LongFilter categoryId;

    private LongFilter productimagesId;

    private LongFilter cartId;

    public ProductCriteria() {
    }

    public ProductCriteria(ProductCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.name = other.name == null ? null : other.name.copy();
        this.price = other.price == null ? null : other.price.copy();
        this.createDate = other.createDate == null ? null : other.createDate.copy();
        this.userId = other.userId == null ? null : other.userId.copy();
        this.categoryId = other.categoryId == null ? null : other.categoryId.copy();
        this.productimagesId = other.productimagesId == null ? null : other.productimagesId.copy();
        this.cartId = other.cartId == null ? null : other.cartId.copy();
    }

    @Override
    public ProductCriteria copy() {
        return new ProductCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getName() {
        return name;
    }

    public void setName(StringFilter name) {
        this.name = name;
    }

    public DoubleFilter getPrice() {
        return price;
    }

    public void setPrice(DoubleFilter price) {
        this.price = price;
    }

    public LocalDateFilter getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateFilter createDate) {
        this.createDate = createDate;
    }

    public LongFilter getUserId() {
        return userId;
    }

    public void setUserId(LongFilter userId) {
        this.userId = userId;
    }

    public LongFilter getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(LongFilter categoryId) {
        this.categoryId = categoryId;
    }

    public LongFilter getProductimagesId() {
        return productimagesId;
    }

    public void setProductimagesId(LongFilter productimagesId) {
        this.productimagesId = productimagesId;
    }

    public LongFilter getCartId() {
        return cartId;
    }

    public void setCartId(LongFilter cartId) {
        this.cartId = cartId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final ProductCriteria that = (ProductCriteria) o;
        return
            Objects.equals(id, that.id) &&
            Objects.equals(name, that.name) &&
            Objects.equals(price, that.price) &&
            Objects.equals(createDate, that.createDate) &&
            Objects.equals(userId, that.userId) &&
            Objects.equals(categoryId, that.categoryId) &&
            Objects.equals(productimagesId, that.productimagesId) &&
            Objects.equals(cartId, that.cartId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
        id,
        name,
        price,
        createDate,
        userId,
        categoryId,
        productimagesId,
        cartId
        );
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ProductCriteria{" +
                (id != null ? "id=" + id + ", " : "") +
                (name != null ? "name=" + name + ", " : "") +
                (price != null ? "price=" + price + ", " : "") +
                (createDate != null ? "createDate=" + createDate + ", " : "") +
                (userId != null ? "userId=" + userId + ", " : "") +
                (categoryId != null ? "categoryId=" + categoryId + ", " : "") +
                (productimagesId != null ? "productimagesId=" + productimagesId + ", " : "") +
                (cartId != null ? "cartId=" + cartId + ", " : "") +
            "}";
    }

}
