package students.nikolajs_antonovs.lesson_3.level_7.task_31;

class Product {

    String fruit;
    double regularPrice;
    double discount;


    Product(String fruit) {
        this.fruit = fruit;
    }
    void fruitRegularPrice(double regularPrice){
        this.regularPrice = regularPrice;
    }

    void fruitDiscount(double discount){
        this.discount = discount;
    }

    double actualPrice(){
        return regularPrice - (regularPrice * discount/100);
    }

    void printInformation() {
        System.out.println("Fruit: " + fruit + "\n" +
                "Price is: " + regularPrice + "\n" +
                "Discaunt is: " + discount + "\n" +
                "Actual price is " + actualPrice());

    }
}








