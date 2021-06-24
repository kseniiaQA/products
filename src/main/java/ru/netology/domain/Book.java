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
   /* public void setAuthor(String author) {
        this.author = author;
    }*/

//    public int getPages() {
//        return pages;
//    }
//
//    public void setPages(int pages) {
//        this.pages = pages;
//    }
//
//    public int getPublishedYear() {
//        return publishedYear;
//    }
//
//    public void setPublishedYear(int publishedYear) {
//        this.publishedYear = publishedYear;
//    }


/*
    @Override
    public int hashCode() {
//        return Objects.hash(super.hashCode(), author, pages, publishedYear);
        return Objects.hash(super.hashCode(), author);

    }*/

  /*  @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
//                ", pages=" + pages +
//                ", publishedYear=" + publishedYear +
                '}';
    }
}*/