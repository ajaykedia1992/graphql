package com.example.book.springbootbookexample.services.impl.datafetcher;

import com.example.book.springbootbookexample.models.Book;
import com.example.book.springbootbookexample.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BookDataFetcher implements DataFetcher<Book> {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book get(DataFetchingEnvironment dataFetchingEnvironment) {
        Long isn = Long.parseLong(dataFetchingEnvironment.getArgument("id"));
        return bookRepository.findById(isn).orElse(null);
    }
}
