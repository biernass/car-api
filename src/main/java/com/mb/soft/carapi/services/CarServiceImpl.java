package com.mb.soft.carapi.services;

import com.mb.soft.carapi.converters.CarDtoConverter;
import com.mb.soft.carapi.dto.CarDto;
import com.mb.soft.carapi.entity.Car;
import com.mb.soft.carapi.exceptions.CarNotFoundException;
import com.mb.soft.carapi.repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CarServiceImpl implements CarService {

    private CarRepository carRepository;
    private CarDtoConverter carDtoConverter;

    @Override
    public List<CarDto> findAll() {
        Iterable<Car> carIterable = carRepository.findAll();
        return StreamSupport.stream(carIterable.spliterator(), true)
                .map(carDtoConverter)
                .collect(Collectors.toList());
    }

    @Override
    public CarDto findById(Long id) throws CarNotFoundException {
        Optional<Car> optionalCar = carRepository.findById(id);
        if (optionalCar.isPresent()) {
            Car car = optionalCar.get();
            return carDtoConverter.apply(car);
        } else {
            throw new CarNotFoundException("Car not found in database Car with id: " + id);
        }
    }

    @Override
    public CarDto findCarByVin(String vin) throws CarNotFoundException {
        Optional<Car> optionalCar = carRepository.findCarByVin(vin);
        if (optionalCar.isPresent()) {
            Car car = optionalCar.get();
            return carDtoConverter.apply(car);
        } else {
            throw new CarNotFoundException("Car not found in database Car with VIN: " + vin);
        }
    }
}
