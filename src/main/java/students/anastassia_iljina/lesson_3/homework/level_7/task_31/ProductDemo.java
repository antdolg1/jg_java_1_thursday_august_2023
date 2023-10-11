package students.anastassia_iljina.lesson_3.homework.level_7.task_31;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product(1739.00, 0.20);
        double discountedPrice = product.actualPrice();
        product.printInformation();
        System.out.println("Цена со скидкой: " + discountedPrice);
    }
}
