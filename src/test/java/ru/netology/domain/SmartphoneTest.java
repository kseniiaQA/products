package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    private Object product;

    @Test
    public void shouldHaveAllFieldsAndMethodFromSuperClass() {
        Smartphone smartphone = new Smartphone();
//    book.
    }

    @Test
    public void shouldCastFromBaseClass() {
        Product product= new Smartphone();
        if (product instanceof Smartphone) {
            Smartphone smartphone = (Smartphone) product;
//      book.
        }
    }
//
//    @Test
//    public void shouldNotCastToDifferentClass() {
//        Product product = new Book();
//        Smartphone smartphone = (Smartphone) product;
//    }

    @Test
    public void shouldUseOverridedMethod() {
        Product product = new Smartphone();
        // Вопрос к аудитории: чей метод вызовется?
        product.toString();
    }
}