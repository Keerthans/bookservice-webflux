package com.example.webflux.bookservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String id;
    private String title;
    private String author;
}
