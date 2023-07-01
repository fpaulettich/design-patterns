package org.template.structure.product;

import org.template.structure.factory.AudiFactory;

/**
 * Concrete implementation of the {@link Motorbike} product by {@link AudiFactory}.
 */
public record AudiMotorbike(String ownerName) implements Motorbike {

    @Override
    public void printOwnerName() {
        System.out.println("Factory=AUDI, Type=BIKE, Owner=" + this.ownerName);
    }
}
