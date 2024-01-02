package students.denis_asipenka.lesson_10.level_3.task_8;

import java.util.Optional;

public interface ProductDatabase {
    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

    class Product {

        private String title;

        public Product(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;

        }
    }
}