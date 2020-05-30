package com.example.book.springbootbookexample.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "book")
public class Book implements Serializable {

    @Id
    private Long isn;

    private String title;

    private String publisher;

    private String authors;

    private String publisherDate;

}
