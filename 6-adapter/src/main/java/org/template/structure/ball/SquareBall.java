package org.template.structure.ball;

/**
 * SquareBall are not compatible with RoundHoles (they were implemented by
 * previous development team). But we have to integrate them into our program.
 */
public record SquareBall(double width) {

    public double getSquare() {
        return Math.pow(this.width, 2);
    }
}
