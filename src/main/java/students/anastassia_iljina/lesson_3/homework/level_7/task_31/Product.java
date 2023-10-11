package students.anastassia_iljina.lesson_3.homework.level_7.task_31;

class Product {

    String name;
    double regularPrice;
    double discount;

    public Product(double regularPrice, double discount) {
        this.name = "iPhone 15 pro max";
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    double actualPrice() {
        double actualPrice = regularPrice - (regularPrice * discount);
        return actualPrice;
    }

    void printInformation() {
        System.out.println("Name of product: " + name);
        System.out.println("Regular price: " + regularPrice);
        System.out.println("Discount: " + discount);

    }


}
