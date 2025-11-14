package com.example.graphqldemo.repository;

import com.example.graphqldemo.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, String> {
}
