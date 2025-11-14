package com.example.graphqldemo.repository;

import com.example.graphqldemo.domain.CarType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<CarType, String> {
}
