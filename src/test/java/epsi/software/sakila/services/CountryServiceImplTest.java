package epsi.software.sakila.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CountryServiceImplTest {


    @Autowired
    CountryService service;

    @Test
    void create() {
    }

    @Test
    void read() {
    }

    @Test
    void readAll() {
        service.readAll().forEach(System.out::println);

    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}