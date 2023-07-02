package org.template.structure;

import java.util.Objects;

public abstract class Vehicle {

    public String engine;
    public int wheels;
    public int seats;
    public int breaks;

    public Vehicle() {}

    public Vehicle(Vehicle source) {
        if (source != null) {
            this.engine = source.engine;
            this.wheels = source.wheels;
            this.seats = source.seats;
            this.breaks = source.breaks;
        }
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getBreaks() {
        return breaks;
    }

    public void setBreaks(int breaks) {
        this.breaks = breaks;
    }

    public abstract Vehicle clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Vehicle vehicle2)) {
            return false;
        }
        return Objects.equals(vehicle2.engine, this.engine)
                && vehicle2.wheels == this.wheels
                && vehicle2.breaks == this.breaks
                && vehicle2.seats == this.seats;
    }
}
