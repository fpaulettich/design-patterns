package org.template.structure.director;

import org.template.structure.builder.VehicleBuilder;

/**
 * This class utilizes the builder object received as parameter to construct the object.
 */
public class Director {

    public void buildVehicle(VehicleBuilder vehicleBuilder) {
        vehicleBuilder.addWheels();
        vehicleBuilder.addSeats();
        vehicleBuilder.addBreaks();
    }
}
