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
 * Criteria class for the {@link com.takirahal.ecommerce.domain.Productimages} entity. This class is used
 * in {@link com.takirahal.ecommerce.web.rest.ProductimagesResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /productimages?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class ProductimagesCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter path;

    private LocalDateFilter createDate;

    private LongFilter productId;

    public ProductimagesCriteria() {
    }

    public ProductimagesCriteria(ProductimagesCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.path = other.path == null ? null : other.path.copy();
        this.createDate = other.createDate == null ? null : other.createDate.copy();
        this.productId = other.productId == null ? null : other.productId.copy();
    }

    @Override
    public ProductimagesCriteria copy() {
        return new ProductimagesCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getPath() {
        return path;
    }

    public void setPath(StringFilter path) {
        this.path = path;
    }

    public LocalDateFilter getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateFilter createDate) {
        this.createDate = createDate;
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
        final ProductimagesCriteria that = (ProductimagesCriteria) o;
        return
            Objects.equals(id, that.id) &&
            Objects.equals(path, that.path) &&
            Objects.equals(createDate, that.createDate) &&
            Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
        id,
        path,
        createDate,
        productId
        );
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ProductimagesCriteria{" +
                (id != null ? "id=" + id + ", " : "") +
                (path != null ? "path=" + path + ", " : "") +
                (createDate != null ? "createDate=" + createDate + ", " : "") +
                (productId != null ? "productId=" + productId + ", " : "") +
            "}";
    }

}
