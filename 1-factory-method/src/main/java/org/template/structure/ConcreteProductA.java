package org.template.structure;

/**
 * Concrete implementation of the Object returned by the factory.
 */
public record ConcreteProductA(String name) implements Product {

    @Override
    public ProductType getProductType() {
        return ProductType.TYPE_A;
    }
}
