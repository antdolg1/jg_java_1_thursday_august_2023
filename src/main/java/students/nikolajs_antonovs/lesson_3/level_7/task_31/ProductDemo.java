package students.nikolajs_antonovs.lesson_3.level_7.task_31;

class ProductDemo {
    public static void main(String[] args) {

        Product product = new Product("apple");
        product.fruitRegularPrice(100);
        product.fruitDiscount(7);
        product.printInformation();
    }
}
