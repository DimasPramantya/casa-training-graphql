package com.example.graphqldemo.presentation.graphql.handler;

import com.example.graphqldemo.domain.Author;
import com.example.graphqldemo.domain.Book;
import com.example.graphqldemo.usecase.BookUseCase;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {
    private final BookUseCase bookUseCase;

    public BookController(BookUseCase bookUseCase) {
        this.bookUseCase = bookUseCase;
    }

    @QueryMapping
    public Book bookById(@Argument String id) {
        return bookUseCase.findBookById(id);
    }

    @SchemaMapping
    public Author author(Book book) {
        return book.getAuthor();
    }

    @QueryMapping
    public List<Book> books() {
        return bookUseCase.findAllBooks();
    }

    @QueryMapping
    public List<Author> authors() {
        return bookUseCase.findAllAuthors();
    }

    @QueryMapping
    public Author authorById(@Argument String id) {
        return bookUseCase.findAuthorById(String.valueOf(id));
    }
}
