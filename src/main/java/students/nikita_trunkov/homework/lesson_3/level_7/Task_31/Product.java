package students.nikita_trunkov.homework.lesson_3.level_7.Task_31;

 class Product {
  String name;
  double regularPrice;
  double discount;

  Product (String carName, double regularPrice, double discount) {
   this.name = carName;
   this.regularPrice = regularPrice;
   this.discount = discount;
  }
  void printInformation () {
   System.out.println ("\nProduct name: " + name + "\nRegular price: " + regularPrice + "\nDiscount: " + discount);
  }
   double actualPrice (double regularPrice, double discount) {
   this.regularPrice = regularPrice;
   this.discount = discount;
   double discountValue = regularPrice / 100 * 7;
   return (regularPrice - discountValue);
  }

}

 class ProductDemo {
  public static void main (String [] args) {
  Product product = new Product ("BMW", 35000, 10);
  product.printInformation();
  double currentPrice = product.actualPrice (35000, 10);
  System.out.println ("Car price with discount is: " + currentPrice);
 }
}