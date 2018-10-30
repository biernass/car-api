package com.mb.soft.carapi.repositories;

import com.mb.soft.carapi.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

    public Optional<Car> findCarByVin(String vin);
}
