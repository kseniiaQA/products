package ru.netology.domain;

import java.util.Objects;

public class Book extends Product {
    private String author;
//    private int pages;
//    private int publishedYear;

    public Book() {
        super();
    }

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
//        this.pages = pages;
//        this.publishedYear = publishedYear;
    }

    public String getAuthor() {
        return author;
    }
}
 
