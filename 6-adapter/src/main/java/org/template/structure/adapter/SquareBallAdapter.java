package org.template.structure.adapter;

import org.template.structure.ball.RoundBall;
import org.template.structure.ball.SquareBall;

/**
 * Adapter allows fitting square balls into round holes.
 */
public class SquareBallAdapter extends RoundBall {

    private final SquareBall squareBall;

    public SquareBallAdapter(SquareBall squareBall) {
        this.squareBall = squareBall;
    }

    @Override
    public double getRadius() {
        // Calculate a minimum circle radius, which can fit this peg.
        return Math.sqrt(Math.pow((this.squareBall.width() / 2), 2) * 2);
    }

}
