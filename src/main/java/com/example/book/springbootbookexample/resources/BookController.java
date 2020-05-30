package com.example.book.springbootbookexample.resources;

import com.example.book.springbootbookexample.models.Book;
import com.example.book.springbootbookexample.services.BookService;
import graphql.ExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping
    @RequestMapping(value = "/all")
    public ResponseEntity getAllBooks(@RequestBody String query){
        ExecutionResult response = bookService.getGraphQL().execute(query);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addBook (@RequestBody Book book){
        System.out.println(book);
        return new ResponseEntity(bookService.addBook(book), HttpStatus.OK);
    }
}
