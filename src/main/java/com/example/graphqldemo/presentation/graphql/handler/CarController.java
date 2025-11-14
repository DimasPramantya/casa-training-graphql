package com.example.graphqldemo.presentation.graphql.handler;

import com.example.graphqldemo.domain.Brand;
import com.example.graphqldemo.domain.Car;
import com.example.graphqldemo.domain.CarCatalogue;
import com.example.graphqldemo.domain.CarType;
import com.example.graphqldemo.usecase.CarUseCase;
import com.example.graphqldemo.usecase.CatalogueUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Slf4j
@Controller
public class CarController {
    private final CarUseCase carUseCase;
    private final CatalogueUseCase catalogueUseCase;

    public CarController(CarUseCase carUseCase, CatalogueUseCase catalogueUseCase) {
        this.carUseCase = carUseCase;
        this.catalogueUseCase = catalogueUseCase;
    }

    @QueryMapping
    public List<Car> getCars() {
        return carUseCase.getCarList();
    }

    @QueryMapping
    public Car getCarsById(@Argument String id) {
        return carUseCase.getCarById(id);
    }

    @QueryMapping
    public List<CarCatalogue> getCatalogue() {
        return catalogueUseCase.getCarCatalogue();
    }

    @QueryMapping
    public CarCatalogue getCatalogueById(@Argument String id) {
        return catalogueUseCase.getCarCatalogueById(id);
    }

    @SchemaMapping(typeName = "Car", field = "carType")
    public CarType getCarType(Car car) {
        log.info("Get car type {}", car.getCarType());
        return car.getCarType();
    }
    @SchemaMapping(typeName = "Car", field = "brand")
    public Brand getCarBrand(Car car) {
        return car.getBrand();
    }
    @SchemaMapping(typeName = "Catalogue", field = "car")
    public Car getCatalogueCar(CarCatalogue catalogue) {
        return catalogue.getCar();
    }
}
