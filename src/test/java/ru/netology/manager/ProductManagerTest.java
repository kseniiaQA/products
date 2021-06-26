package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    ProductRepository productRepository = new ProductRepository();
    ProductManager productManager = new ProductManager(productRepository);

    Book book1 = new Book(0, "Война и мир", 132, "Лев Толстой");
    Book book2 = new Book(1, "Приключения Нильса", 99, "Сельма Лагерлеф");
    Smartphone smartphone1 = new Smartphone(2, "ВоСониПлюс", 31500, "Сони");
    Smartphone smartphone2 = new Smartphone(3, "ТруПлэжа", 7200, "Самсунг");


    @Test
    void searchByMany() {
        productManager.add(book1);
        productManager.add(book2);
        productManager.add(smartphone1);
        productManager.add(smartphone2);


        assertArrayEquals(new Product[]{book1,smartphone1},productManager.searchBy("Во"));
    }

    @Test
    void searchByOneTrue() {
        productManager.add(book1);

        assertArrayEquals(new Product[]{book1},productManager.searchBy("Во"));
    }

    @Test
    void searchByOneFalse() {
        productManager.add(book2);

        assertArrayEquals(new Product[]{},productManager.searchBy("Во"));
    }

    @Test
    void searchByZero() {
        assertArrayEquals(new Product[]{},productManager.searchBy("В"));
    }
}

