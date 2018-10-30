package com.mb.soft.carapi.controllers;

import com.mb.soft.carapi.dto.CarDto;
import com.mb.soft.carapi.entity.Car;
import com.mb.soft.carapi.exceptions.CarNotFoundException;
import com.mb.soft.carapi.services.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    private Logger logger = LoggerFactory.getLogger(CarController.class);

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/cars")
    public List<CarDto> findCars() {
        return carService.findAll();
    }

    @RequestMapping("/car/{id}")
    public CarDto findCarById(@PathVariable long id) {
        try {
            return carService.findCarById(id);
        } catch (CarNotFoundException ex) {
            logger.info("Car with id: " + id + " not found");
        }
        return null;
    }

    @RequestMapping("/car/vin={vin}")
    public CarDto findCarByVin(@PathVariable String vin) {
        try {
            return carService.findCarByVin(vin);
        } catch (CarNotFoundException ex) {
            logger.info("Car with VIN: " + vin + " not found");
        }
        return null;
    }
}
