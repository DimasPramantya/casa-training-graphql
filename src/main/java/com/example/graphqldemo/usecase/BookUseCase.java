package com.example.graphqldemo.usecase;

import com.example.graphqldemo.domain.Author;
import com.example.graphqldemo.domain.Book;
import com.example.graphqldemo.repository.AuthorRepository;
import com.example.graphqldemo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookUseCase {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookUseCase(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    public Book findBookById(String id) {
        return bookRepository.findById(id).orElse(null);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Author findAuthorById(String id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }
}
