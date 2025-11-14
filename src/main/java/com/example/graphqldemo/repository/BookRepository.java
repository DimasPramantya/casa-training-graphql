package com.example.graphqldemo.repository;

import com.example.graphqldemo.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
