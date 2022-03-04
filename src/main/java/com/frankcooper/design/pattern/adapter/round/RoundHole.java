package com.frankcooper.design.pattern.adapter.round;

/**
 * @author: wangzhou(Frank Cooper)
 * @date: 2022/3/4 16:36
 * @description:
 */

/**
 * RoundHoles are compatible with RoundPegs.
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}