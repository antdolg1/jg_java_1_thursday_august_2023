package students.kristina_konovalchuk.homework.lesson_10.level_3;

public class Task_7{
    interface ProductDatabase {

        void save(Product product);

        Product findByTitle(String productTitle);

    }


    class Product {

        private String title;

        public Product(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }

    }
}//Интерфейс не является функциональным , он содержать только один абстрактный метод.//
