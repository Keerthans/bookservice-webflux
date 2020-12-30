package com.example.webflux.bookservice.controller;

import com.example.webflux.bookservice.model.Book;
import com.example.webflux.bookservice.service.BookService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value = "/book/{id}")
    public Mono<Book> getById(@PathVariable String id) {
        return bookService.findById(id);
    }

    @GetMapping(value = "/books")
    public Flux<Book> getAllBooks() {
        return bookService.findAll();
    }

    @PostMapping(value = "/book")
    public Mono<Book> createBook(@RequestBody Book book) {
        return bookService.save(book);
    }
}
