package org.template.structure;

/**
 * Motorbike product with its corresponding operations.
 */
public class Motorbike extends Vehicle  {

    public Motorbike() {
    }

    public Motorbike(Vehicle source) {
        super(source);
    }

    @Override
    public Vehicle clone() {
        return new Motorbike(this);
    }

    @Override
    public boolean equals(Object object2) {
        return object2 instanceof Motorbike && super.equals(object2);
    }

}