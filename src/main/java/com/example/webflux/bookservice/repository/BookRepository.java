package com.example.webflux.bookservice.repository;

import com.example.webflux.bookservice.model.Book;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ReactiveMongoRepository<Book, String> {
}
