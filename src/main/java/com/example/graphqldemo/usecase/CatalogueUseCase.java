package com.example.graphqldemo.usecase;

import com.example.graphqldemo.domain.CarCatalogue;
import com.example.graphqldemo.repository.CarCatalogueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogueUseCase {
    private final CarCatalogueRepository carCatalogueRepository;

    public CatalogueUseCase(CarCatalogueRepository carCatalogueRepository) {
        this.carCatalogueRepository = carCatalogueRepository;
    }

    public List<CarCatalogue> getCarCatalogue(){
        return carCatalogueRepository.findAll();
    }

    public CarCatalogue getCarCatalogueById(String id){
        return carCatalogueRepository.findById(id).orElse(null);
    }
}
