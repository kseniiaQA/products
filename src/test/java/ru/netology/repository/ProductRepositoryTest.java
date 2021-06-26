package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();
    private Book coreJava = new Book();
    private Product first;
    private Product second;
    private Product third;

    @Test
    public void shouldSaveOneItem() {
        repository.save(coreJava);

        Product[] expected = new Product[]{coreJava};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }


    @Test
    public void test() {
        ProductRepository repo = new ProductRepository();

        repo.save(first);
        repo.save(second);
        repo.save(third);


        Assertions.assertThrows(NotFoundException.class, () -> repo.removeById(-3));

    }
}

