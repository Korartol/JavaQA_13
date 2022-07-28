public class ProductRepository {
    private Product[] products = new Product[0];

//    public Product[] getProducts() {
//        return products;
//    }

     // метод добавления
    public void save(Product product) {
        Product[] tmp = new Product[products.length + 1];  // создаем временный массив на 1 больше прежнего

        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

//    public Product[] findAll() {
//        Product[] all = getProducts();
//        Product[] list = new Product[all.length];
//        for (int i = 0; i < list.length; i++) {
//            list[i] = all[i];
//        }
//        return list;
//    }
    // метод удаления
    public void removeById(int id) {
        Product[] tmp = new Product[products.length - 1];  // создаем временный массив на 1 меньше прежнего
        int copyToIndex = 0; // заводим переменную которая будет записывать индекс элемента в массиве
        for (Product product : products) {
            if (product.getId() != id) {  // если id продукта не равен id которое хотим удалить, то копирум в tmp
                tmp[copyToIndex] = product;
                copyToIndex++;
            }
        }
        products = tmp;  // обновляем products
    }

    // метод вывода всего массива
    public Product[] getProduct() {
        return products;  // возвращаем массив
    }
}
