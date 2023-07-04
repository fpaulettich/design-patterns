package org.template.structure.hole;

import org.template.structure.ball.RoundBall;

/**
 * RoundHoles are compatible with RoundBalls.
 */
public record RoundHole(double radius) {

    public boolean fits(RoundBall ball) {
        return this.radius() >= ball.getRadius();
    }
}
