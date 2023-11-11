package students.nikolajs_antonovs.lesson_4.level_6;

 class StockTest {
    public static void main(String[] args) {

        Stock google = new Stock("ABC", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
        System.out.println("-----");

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);
        google.updatePrice(11);
        google.updatePrice(20);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }
}
