package com.frankcooper.design.pattern.builders;

/**
 * @author: wangzhou(Frank Cooper)
 * @date: 2022/3/3 19:32
 * @description:
 */

import com.frankcooper.design.pattern.builders.cars.CarType;
import com.frankcooper.design.pattern.builders.cars.Manual;
import com.frankcooper.design.pattern.builders.components.Engine;
import com.frankcooper.design.pattern.builders.components.GPSNavigator;
import com.frankcooper.design.pattern.builders.components.Transmission;
import com.frankcooper.design.pattern.builders.components.TripComputer;

/**
 * Unlike other creational patterns, Builder can construct unrelated products,
 * which don't have the common interface.
 * <p>
 * In this case we build a user manual for a car, using the same steps as we
 * built a car. This allows to produce manuals for specific car models,
 * configured with different features.
 */
public class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
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

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}