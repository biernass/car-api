package com.mb.soft.carapi.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Car {

    @Id
    private Long id;
    private String vin;
    private String yearOfProduction;
    private String brand;
    private String model;

    @Enumerated(EnumType.STRING)
    private CarType carType;

    public Car(Long id, String vin, String yearOfProduction, String brand, String model, CarType carType) {
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

    public CarType getCarType() {
        return carType;
    }
}
