package com.example.graphqldemo.repository;

import com.example.graphqldemo.domain.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, String> {
}
