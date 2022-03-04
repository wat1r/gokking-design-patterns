package com.frankcooper.design.pattern.builders.director;

/**
 * @author: wangzhou(Frank Cooper)
 * @date: 2022/3/3 19:33
 * @description:
 */

import com.frankcooper.design.pattern.builders.Builder;
import com.frankcooper.design.pattern.builders.cars.CarType;
import com.frankcooper.design.pattern.builders.components.Engine;
import com.frankcooper.design.pattern.builders.components.GPSNavigator;
import com.frankcooper.design.pattern.builders.components.Transmission;
import com.frankcooper.design.pattern.builders.components.TripComputer;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}