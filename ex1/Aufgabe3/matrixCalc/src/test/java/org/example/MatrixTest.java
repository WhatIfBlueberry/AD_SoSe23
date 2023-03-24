package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    /**
     * Determines the amount of Dimension to retain certain time requirement
     */
    @org.junit.jupiter.api.Test
    void add() {
        // this test is a more simplistic approach
        // enter time Requirement
        int timeRequirement = 1000;
        long duration = 0;
        // enter starting dimension. The closer you are to the resulting dimension the faster the program will run
        int dimension = 50;
        // Always increasing dimension by 50
        // At some point the time requirement will be overshot, then gradually lower the dimension from there on.
        while (duration < timeRequirement) {
            boolean overshotDuration = duration - timeRequirement > 100;
            if (overshotDuration) {
                dimension -= 2;
            } else {
                dimension += 50;
            }
            Matrix matrix = new Matrix(dimension, dimension);
            matrix.randomFill();
            Matrix other = new Matrix(dimension, dimension);
            other.randomFill();
            long startTime = System.currentTimeMillis();
            matrix.add(other);
            long endTime = System.currentTimeMillis();
            duration = endTime - startTime;
        }
        System.out.printf("max dimensions %d, duration: %d", dimension, duration);
    }

    /**
     * Determines the amount of Dimension to retain certain time requirement
     */
    @org.junit.jupiter.api.Test
    void mult() {
        // enter time Requirement in ms.
        int timeRequirement = 1000;
        // enter upper bound for the matrix dimension. Lower bound will result in faster calculation, but may not lead to result
        int dimension = 1000;
        int mid = dimension / 2;
        long duration = 0;
        while (true) {
            Matrix matrix = new Matrix(mid, mid);
            matrix.randomFill();
            Matrix other = new Matrix(mid, mid);
            other.randomFill();
            long startTime = System.currentTimeMillis();
            matrix.mult(other);
            long endTime = System.currentTimeMillis();
            duration = endTime - startTime;
            boolean closeEnough = Math.abs(duration - timeRequirement) < 50;
            if (closeEnough) {
                System.out.printf("max dimensions %d, duration: %d", mid, duration);
                break;
            }
            boolean dimensionLimitReached = dimension - mid < 10;
            if (dimensionLimitReached) {
                System.out.println("Reached limit of dimension space");
                break;
            }
            if (duration < timeRequirement) {
                mid = (dimension + mid) / 2;
            } else {
                mid = mid / 2;
            }
            System.out.println("Current Dimension: " + mid);
        }
    }
}