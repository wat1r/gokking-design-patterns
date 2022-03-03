package com.frankcooper.design.pattern.builders;

import com.frankcooper.design.pattern.builders.cars.CarType;
import com.frankcooper.design.pattern.builders.components.Engine;
import com.frankcooper.design.pattern.builders.components.GPSNavigator;
import com.frankcooper.design.pattern.builders.components.Transmission;
import com.frankcooper.design.pattern.builders.components.TripComputer;

/**
 * @author: wangzhou(Frank Cooper)
 * @date: 2022/3/3 19:25
 * @description:
 */
public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
