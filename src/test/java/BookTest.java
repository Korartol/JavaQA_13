import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookTest {
    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);
    // создаем продукты
    Product product1 = new Book(1, "bookk", 100, "title1", "author1");
    Product product2 = new Book(2, "bookk", 200, "title2", "author2");
    Product product3 = new Book(3, "book1", 300, "title3", "author3");
    Product product4 = new Book(4, "book2", 400, "title4", "author4");
    Product product5 = new Smartphone(5, "smartphone", 500, "pro max", "apple");
    Product product6 = new Book(6, "book3", 100, "title1", "author1");
    Product product7 = new Book(7, "book4", 200, "title2", "author2");
    Product product8 = new Book(8, "book5", 300, "title3", "author3");
    Product product9 = new Smartphone(9, "smartphone", 400, "mi12", "xiaomi");
    Product product10 = new Smartphone(10, "smartphone", 500, "pro max", "apple");

    @BeforeEach
    public void setup() {
        repo.save(product1);
        repo.save(product2);
        repo.save(product3);
        repo.save(product4);
        repo.save(product5);
        repo.save(product6);
        repo.save(product7);
        repo.save(product8);
        repo.save(product9);
        repo.save(product10);
    }

    @Test
    public void testBookAuthor() {

        Product[] expected = {product1, product2};
        Product[] actual = manager.searchBy("bookk");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testBookAuthorMore() {

        Product[] expected = {product1, product6};
        Product[] actual = manager.searchBy("author1");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testBookName() {

        Product[] expected = {product1, product2};
        Product[] actual = manager.searchBy("bookk");

        Assertions.assertArrayEquals(expected, actual);
    }

}
