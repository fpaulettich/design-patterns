package org.template.structure.product;

import org.template.structure.factory.AudiFactory;

/**
 * Concrete implementation of the {@link Car} product by {@link AudiFactory}.
 */
public record AudiCar(String ownerName) implements Car {

    @Override
    public void printOwnerName() {
        System.out.println("Factory=AUDI, Type=CAR, Owner=" + this.ownerName);
    }
}
