package students.aleksandrs_kunicins.homework.lesson_3.level_7;

class Product{
    String name;
    double regularPrice;
    double discount ;

    double actualPrice(double regularPrice,double discount){
        this.regularPrice = regularPrice;
        this.discount = discount;
        return (regularPrice - discount);
    }
    void printInformation(){
        System.out.println("Product name : " + name);
        System.out.println("Price : " + regularPrice);
        System.out.println("Discount : "+ discount);
    }
    Product(String name, double regularPrice,double discount){
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }
}

class ProductDemo{
    public static void main(String[] args) {
        Product product = new Product("Java Guru Course",150,0);
        double currPrice = product.actualPrice(150, 0);
        System.out.println("Actual Price is : " + currPrice);
        product.printInformation();
    }
}
