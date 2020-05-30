package com.example.book.springbootbookexample.services;

import com.example.book.springbootbookexample.models.Book;
import graphql.GraphQL;

public interface BookService {

    GraphQL getGraphQL();

    Book addBook(Book book);
}
