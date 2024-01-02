package students.denis_asipenka.lesson_10.level_3.task_8;

import java.util.Arrays;
import java.util.Optional;

public class InMemoryDatabase implements ProductDatabase {
    Product[] arrayProduct = new Product[0];

    @Override
    public void save(Product product) {
        Product[] newArrayProduct = new Product[arrayProduct.length + 1];
        newArrayProduct = Arrays.copyOf(arrayProduct, newArrayProduct.length);
        newArrayProduct[newArrayProduct.length - 1] = product;
        arrayProduct = newArrayProduct;
    }

    @Override
    public Optional findByTitle(String productTitle) {
        for (int i = 0; i < arrayProduct.length; i++) {
            if (arrayProduct[i].getTitle().equals(productTitle)) {
                Optional<Product> result = Optional.of(arrayProduct[i]);
                return result;
            }
        }
        return null;
    }
}