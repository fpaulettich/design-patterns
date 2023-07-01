package org.template.structure.product;

import org.template.structure.factory.BmwFactory;

/**
 * Concrete implementation of the {@link Car} product by {@link BmwFactory}.
 */
public record BmwCar(String ownerName) implements Car {

    @Override
    public void printOwnerName() {
        System.out.println("Factory=BMW, Type=CAR, Owner=" + this.ownerName);
    }
}
