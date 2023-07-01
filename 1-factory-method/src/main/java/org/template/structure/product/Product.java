package org.template.structure.product;

import org.template.structure.creator.ProductType;

/**
 * Type of the objects that will be created by the Factory.
 */
public interface Product {

    /**
     * Returns color of the product.
     *
     * @return {@link String}
     */
    String color();

    /**
     * Returns type of the product.
     *
     * @return {@link ProductType}
     */
    ProductType getProductType();

}
