package ru.netology.domain;

import java.util.Objects;

public class Smartphone extends Product {
    private String manufacturer;
//    private int pages;
//    private int publishedYear;

    public Smartphone() {
        super();
    }

    public Smartphone(int id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
//        this.pages = pages;
//        this.publishedYear = publishedYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

  /*  public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Smartphone book = (Smartphone) o;
//        return pages == book.pages &&
//                publishedYear == book.publishedYear &&
        return Objects.equals(manufacturer, book.manufacturer);
    }

    @Override
    public int hashCode() {
//        return Objects.hash(super.hashCode(), author, pages, publishedYear);
        return Objects.hash(super.hashCode(), manufacturer);

    }
*/
    @Override
    public String toString() {
        return "Smartphone{" +
                "manufacturer='" + manufacturer + '\'' +
//                ", pages=" + pages +
//                ", publishedYear=" + publishedYear +
                '}';
    }
}