package org.template.structure.builder;

import org.template.structure.product.Car;

/**
 * Car builder that knows how to the parts to a {@link Car object}.
 */
public class CarBuilder implements VehicleBuilder {

    private int wheels;
    private int seats;
    private int breaks;

    @Override
    public void addWheels() {
        this.wheels = 4;
    }

    @Override
    public void addSeats() {
        this.seats = 5;
    }

    @Override
    public void addBreaks() {
        this.breaks = 4;
    }

    public Car build() {
        return new Car(this.wheels, this.seats, this.breaks);
    }
}
