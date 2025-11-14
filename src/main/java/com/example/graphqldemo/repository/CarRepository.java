package com.example.graphqldemo.repository;

import com.example.graphqldemo.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, String> {
}
