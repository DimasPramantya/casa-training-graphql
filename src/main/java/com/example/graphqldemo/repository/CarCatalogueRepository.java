package com.example.graphqldemo.repository;

import com.example.graphqldemo.domain.CarCatalogue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarCatalogueRepository extends JpaRepository<CarCatalogue, String> {
}
