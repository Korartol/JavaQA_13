import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {
// создаем продукты
    Product product1 = new Book(1, "book", 100, "title1", "author1");
    Product product2 = new Book(2,"book", 200, "title2", "author2");
    Product product3 = new Book(3, "book", 300, "title3", "author3");
    Product product4 = new Book(4, "book", 400, "title4", "author4");
    Product product5 = new Smartphone(5, "smartphone", 500, "pro max", "apple");

    @Test
    public void testAddSave() {
        ProductRepository repo = new ProductRepository();

       // добавляем продукты
        repo.save(product1);
        repo.save(product2);
        repo.save(product3);
        repo.save(product4);
        repo.save(product5);

        Product[] expected = {product1, product2, product3, product4, product5};
        Product[] actual = repo.getProduct();

        // сравниваем ожидание с реальностью
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveById() {
        ProductRepository repo = new ProductRepository();

        // добавляем продукты
        repo.save(product1);
        repo.save(product2);
        repo.save(product3);
        repo.save(product4);
        repo.save(product5);
        repo.removeById(product2.getId());  // удаляем элемент с id 2

        Product[] expected = {product1, product3, product4, product5};
        Product[] actual = repo.getProduct();

        // сравниваем ожидание с реальностью
        Assertions.assertArrayEquals(expected, actual);
    }
}
