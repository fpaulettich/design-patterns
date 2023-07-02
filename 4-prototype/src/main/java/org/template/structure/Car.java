package org.template.structure;

/**
 * Car product with its corresponding operations.
 */
public class Car extends Vehicle {

    public Car() {}

    public Car(Vehicle source) {
        super(source);
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public boolean equals(Object object2) {
        return object2 instanceof Car && super.equals(object2);
    }
}
