package com.mb.soft.carapi.controllers;

import com.mb.soft.carapi.dto.CarDto;
import com.mb.soft.carapi.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/cars")
    public List<CarDto> findCars(){
        return carService.findAll();
    }
}
