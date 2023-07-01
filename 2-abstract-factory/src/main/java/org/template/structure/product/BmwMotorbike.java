package org.template.structure.product;

/**
 * Concrete implementation of the {@link Motorbike} product by {@link BmwMotorbike}.
 */
public record BmwMotorbike(String ownerName) implements Motorbike {

    @Override
    public void printOwnerName() {
        System.out.println("Factory=BMW, Type=BIKE, Owner=" + this.ownerName);
    }
}
