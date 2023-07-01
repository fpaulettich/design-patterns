package org.template.structure.factory;

import org.template.structure.product.Motorbike;
import org.template.structure.product.Car;
import org.template.structure.product.AudiMotorbike;
import org.template.structure.product.AudiCar;

/**
 * AUDI factory that knows how to create its own motorbikes and cars.
 */
public class AudiFactory implements Factory {

    @Override
    public Motorbike createMotorbike(String ownerName) {
        return new AudiMotorbike(ownerName);
    }

    @Override
    public Car createCar(String ownerName) {
        return new AudiCar(ownerName);
    }
}
