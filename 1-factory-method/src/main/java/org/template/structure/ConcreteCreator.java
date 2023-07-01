package org.template.structure;

/**
 * Class that implements the factory interface and will dictate which implementation of Product should be
 * returned.
 */
public class ConcreteCreator implements Creator {

    @Override
    public Product createProduct(ProductType type, String productName) {
        if (ProductType.TYPE_A.equals(type)) {
            return new ConcreteProductA(productName);
        }
        if (ProductType.TYPE_B.equals(type)) {
            return new ConcreteProductB(productName);
        }
        return null;
    }
}
