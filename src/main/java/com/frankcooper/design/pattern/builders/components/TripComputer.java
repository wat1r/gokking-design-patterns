package com.frankcooper.design.pattern.builders.components;

/**
 * @author: wangzhou(Frank Cooper)
 * @date: 2022/3/3 19:31
 * @description:
 */

import com.frankcooper.design.pattern.builders.cars.Car;

/**
 * Just another feature of a car.
 */
public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
