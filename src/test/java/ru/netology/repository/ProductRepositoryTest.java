package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.TShirt;
import ru.netology.exception.NotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    ProductRepository repository = new ProductRepository();
    private Book first = new Book(1, "Исчезнувшая", 459, "Гиллиан Флинн", 512, 2014);
    private Book second = new Book(2, "Ангелы и Демоны", 680, "Дэн Браун", 639, 2013);
    private TShirt third = new TShirt(3, "футболка 'Happy 2021 Year!'", 2020, "красный", 40);

    @BeforeEach
    public void setUp() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
    }

    @Test
    public void shouldThrowNotFoundException() {
        repository.removeById(2);

        assertNull(repository.findById(2));
    }

    @Test
    public void shouldRemoveNonExistingProductById() {
        assertThrows(NotFoundException.class, () -> repository.removeById(5));
    }
}