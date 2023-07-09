package org.template.structure.factory;

import org.template.structure.product.Car;
import org.template.structure.product.Motorbike;

/**
 * Factory interface to be called.
 */
public interface Factory {

    Motorbike createMotorbike(final String ownerName);

    Car createCar(final String ownerName);
}
