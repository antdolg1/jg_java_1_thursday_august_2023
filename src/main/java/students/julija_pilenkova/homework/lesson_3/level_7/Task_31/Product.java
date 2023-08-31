package students.julija_pilenkova.homework.lesson_3.level_7.Task_31;

class Product {

    String name;
    double regularPrice;
    double discount;

    double actualPrice(double regularPrice, double discount) {
        this.regularPrice = regularPrice;
        this.discount = discount;
        double discountValue = regularPrice / 100 * 15;
        return (regularPrice - discountValue);

    }

        Product (String phoneName, double price, double discount){
        this.name = phoneName;
        this.regularPrice = price;
        this.discount = discount;
    }

    void printInformation(){
        System.out.println("Product Name: " + name +  "\nRegular price: " + regularPrice + "\nDiscount: " + discount );
    }



}


class ProductDemo {
    public static void main(String[] args) {

        Product myProduct = new Product("Iphone ", 1200 , 15 );
        myProduct.printInformation();
        double currentPrice = myProduct.actualPrice(1200, 15);
        System.out.println("Price with discount is: " + currentPrice);





    }








}