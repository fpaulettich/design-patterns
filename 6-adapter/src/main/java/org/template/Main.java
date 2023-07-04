package org.template;

import org.template.structure.adapter.SquareBallAdapter;
import org.template.structure.ball.RoundBall;
import org.template.structure.ball.SquareBall;
import org.template.structure.hole.RoundHole;

/**
 * Example of Adapter pattern design.
 * Credits to <a href="https://refactoring.guru/design-patterns/adapter/java/example">Refactor Guru</a> for the example.
 */
public class Main {

    public static void main(String[] args) {
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundBall roundBall = new RoundBall(5);
        if (hole.fits(roundBall)) {
            System.out.println("Round ball r5 fits round hole r5.");
        }

        SquareBall smallSqBall = new SquareBall(2);
        SquareBall largeSqBall = new SquareBall(20);
        // hole.fits(smallSqBall); // Won't compile.

        // Adapter solves the problem.
        SquareBallAdapter smallSqBallAdapter = new SquareBallAdapter(smallSqBall);
        SquareBallAdapter largeSqBallAdapter = new SquareBallAdapter(largeSqBall);
        if (hole.fits(smallSqBallAdapter)) {
            System.out.println("Square ball w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqBallAdapter)) {
            System.out.println("Square ball w20 does not fit into round hole r5.");
        }
    }
}