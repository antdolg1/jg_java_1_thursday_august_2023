package students.denis_asipenka.lesson_3.level_7_task_31;

import java.util.Scanner;

public class Product {
    String name;
    double regularPrice;
    double discount;
    double discountPrice;

    public Product(String name) {
        this.name = name;
    }

    public void regularPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость товара:");
        this.regularPrice = scanner.nextDouble();
    }

    public void discount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите процент скидки:");
        this.discount = scanner.nextDouble();
    }

    public void actualPrice() {
        this.discountPrice = (regularPrice - (regularPrice / 100 * discount));
    }

    public void printInformation() {
        System.out.println("Название товара:" + name + "\n" + "Стандартная цена: " + regularPrice + "\n" + "Процент скидки: " + discount + "\n" + "Цена с учетом скидки:" + discountPrice);
    }
}

class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Арбуз");
        product.regularPrice();
        product.discount();
        product.actualPrice();
        product.printInformation();
    }
}
