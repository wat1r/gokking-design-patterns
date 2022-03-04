package com.frankcooper.design.pattern.adapter.round;

/**
 * @author: wangzhou(Frank Cooper)
 * @date: 2022/3/4 16:37
 * @description:
 */
/**
 * RoundPegs are compatible with RoundHoles.
 */
public class RoundPeg {
    private double radius;

    public RoundPeg() {}

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
