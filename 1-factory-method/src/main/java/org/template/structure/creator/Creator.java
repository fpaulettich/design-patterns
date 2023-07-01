package org.template.structure.creator;

import org.template.structure.product.Product;

/**
 * Factory interface to be called.
 */
public interface Creator {

    Product createProduct(final ProductType type, final String color);

}
