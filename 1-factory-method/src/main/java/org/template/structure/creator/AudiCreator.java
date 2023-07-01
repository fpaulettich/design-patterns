package org.template.structure.creator;

import org.template.structure.product.Car;
import org.template.structure.product.Motorbike;
import org.template.structure.product.Product;

/**
 * Class that implements the factory interface and will dictate which implementation of Product should be
 * returned.
 */
public class AudiCreator implements Creator {

    @Override
    public Product createProduct(ProductType type, String color) {
        if (ProductType.CAR.equals(type)) {
            return new Car(color);
        }
        if (ProductType.MOTORBIKE.equals(type)) {
            return new Motorbike(color);
        }
        return null;
    }
}
