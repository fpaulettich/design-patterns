package org.template.structure.product;

import org.template.structure.creator.ProductType;

/**
 * Concrete implementation of the Object returned by the factory.
 */
public record Car(String color) implements Product {

    @Override
    public ProductType getProductType() {
        return ProductType.CAR;
    }
}
