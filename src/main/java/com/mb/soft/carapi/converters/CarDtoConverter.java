package com.mb.soft.carapi.converters;

import com.mb.soft.carapi.dto.CarDto;
import com.mb.soft.carapi.entity.Car;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CarDtoConverter implements Function<Car, CarDto> {

    @Override
    public CarDto apply(Car car) {
        return new CarDto(car.getId(), car.getVin(), car.getYearOfProduction(), car.getBrand(), car.getModel(),
                car.getCarType().name());
    }
}
