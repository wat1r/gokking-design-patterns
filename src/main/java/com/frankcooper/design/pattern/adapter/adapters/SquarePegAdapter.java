package com.frankcooper.design.pattern.adapter.adapters;

/**
 * @author: wangzhou(Frank Cooper)
 * @date: 2022/3/4 16:37
 * @description:
 */

import com.frankcooper.design.pattern.adapter.round.RoundPeg;
import com.frankcooper.design.pattern.adapter.square.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
