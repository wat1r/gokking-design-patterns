package com.frankcooper.design.pattern.builders.impl;

import com.frankcooper.design.pattern.builders.Builder;
import com.frankcooper.design.pattern.builders.cars.Car;
import com.frankcooper.design.pattern.builders.cars.CarType;
import com.frankcooper.design.pattern.builders.components.Engine;
import com.frankcooper.design.pattern.builders.components.GPSNavigator;
import com.frankcooper.design.pattern.builders.components.Transmission;
import com.frankcooper.design.pattern.builders.components.TripComputer;

/**
 * @author: wangzhou(Frank Cooper)
 * @date: 2022/3/3 19:26
 * @description:
 */

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}