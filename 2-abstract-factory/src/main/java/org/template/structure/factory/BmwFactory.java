package org.template.structure.factory;

import org.template.structure.product.BmwCar;
import org.template.structure.product.BmwMotorbike;
import org.template.structure.product.Car;
import org.template.structure.product.Motorbike;

/**
 * BMW factory that knows how to create its own motorbikes and cars.
 */
public class BmwFactory implements Factory {

    @Override
    public Motorbike createMotorbike(String ownerName) {
        return new BmwMotorbike(ownerName);
    }

    @Override
    public Car createCar(String ownerName) {
        return new BmwCar(ownerName);
    }
}
