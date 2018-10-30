package com.mb.soft.carapi.dto;

import com.mb.soft.carapi.entity.CarType;

import java.time.LocalDate;

public class CarDto {

    private Long id;
    private String vin;
    private String yearOfProduction;
    private String brand;
    private String model;
    private String carType;


    public CarDto(Long id, String vin, String yearOfProduction, String brand, String model, String carType) {
        this.id = id;
        this.vin = vin;
        this.yearOfProduction = yearOfProduction;
        this.brand = brand;
        this.model = model;
        this.carType = carType;
    }

    public Long getId() {
        return id;
    }

    public String getVin() {
        return vin;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getCarType() {
        return carType;
    }
}
