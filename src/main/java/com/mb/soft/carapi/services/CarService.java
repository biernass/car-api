package com.mb.soft.carapi.services;

import com.mb.soft.carapi.dto.CarDto;
import com.mb.soft.carapi.exceptions.CarNotFoundException;

import java.util.List;

public interface CarService {

    List<CarDto> findAll();

    CarDto findCarById(Long id) throws CarNotFoundException;

    CarDto findCarByVin(String vin) throws  CarNotFoundException;

}
