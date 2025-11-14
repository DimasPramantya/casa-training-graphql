package com.example.graphqldemo.usecase;

import com.example.graphqldemo.domain.Car;
import com.example.graphqldemo.domain.CarCatalogue;
import com.example.graphqldemo.repository.CarCatalogueRepository;
import com.example.graphqldemo.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarUseCase {
    private final CarRepository carRepository;
    private final CarCatalogueRepository carCatalogueRepository;

    public CarUseCase(CarRepository carRepository, CarCatalogueRepository carCatalogueRepository) {
        this.carRepository = carRepository;
        this.carCatalogueRepository = carCatalogueRepository;
    }

    public List<Car> getCarList(){
        return carRepository.findAll();
    }

    public Car getCarById(String id){
        return carRepository.findById(id).orElse(null);
    }
}
