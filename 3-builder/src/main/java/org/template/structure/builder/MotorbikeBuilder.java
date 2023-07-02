package org.template.structure.builder;

import org.template.structure.product.Motorbike;

/**
 * Motorbike builder that know how to add the part to a {@link Motorbike} object.
 */
public class MotorbikeBuilder implements VehicleBuilder {

    private int wheels;
    private int seats;
    private int breaks;

    @Override
    public void addWheels() {
        this.wheels = 2;
    }

    @Override
    public void addSeats() {
        this.seats = 2;
    }

    @Override
    public void addBreaks() {
        this.breaks = 2;
    }

    public Motorbike build() {
        return new Motorbike(this.wheels, this.seats, this.breaks);
    }
}
