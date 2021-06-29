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

  

   
   @Override
   public boolean matches(String search) {
       return super.matches(search) || manufacturer.contains(search);
   }

    @Override
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

    @Override
    public String toString() {
        return "Smartphone{" +
                "manufacturer='" + manufacturer + '\'' +

                '}';
    }
}
