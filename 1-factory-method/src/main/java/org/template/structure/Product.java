package org.template.structure;

/**
 * Type of the objects that will be created by the Factory.
 */
public interface Product {

    /**
     * Returns name of the product.
     *
     * @return {@link String}
     */
    String name();

    /**
     * Returns type of the product.
     *
     * @return {@link ProductType}
     */
    ProductType getProductType();

}
