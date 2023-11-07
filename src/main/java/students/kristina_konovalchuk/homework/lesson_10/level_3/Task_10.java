package students.kristina_konovalchuk.homework.lesson_10.level_3;

import java.util.Optional;

public class Task_10 {
    public interface ProductDatabase {
        void save(Task_7.Product product);

        Optional<Task_7.Product> findByTitle(String productTitle);
    }

    public class InMemoryDatabase implements ProductDatabase {
        private Task_7.Product[] products;
        private int size;

        public InMemoryDatabase() {
            products = new Task_7.Product[10];
            size = 0;
        }

        public void save(Task_7.Product product) {
            if (size == products.length) {
                Task_7.Product[] newProducts = new Task_7.Product[products.length * 2];
                System.arraycopy( products, 0, newProducts, 0, products.length );
                products = newProducts;
            }
            products[size] = product;
            size++;
        }

        public Optional<Task_7.Product> findByTitle(String productTitle) {
            for (int i = 0; i < size; i++) {
                if (products[i].getTitle( ).equals( productTitle )) {
                    return Optional.of( products[i] );
                }
            }
            return Optional.empty( );
        }
    }
}
