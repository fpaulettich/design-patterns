package org.template.structure;

/**
 * Factory interface to be called.
 */
public interface Creator {

    Product createProduct(final ProductType type, final String productName);

}
