package students.anastassia_iljina.lesson_4.homework.level_5;

public class StockTest {
    public static void main(String[] args) {
        Stock tesla = new Stock("TSLA", 10);
        String priceInformation = tesla.getInformation();
        System.out.println(priceInformation);

        tesla.updatePrice(12);
        tesla.updatePrice(5);
        tesla.updatePrice(7);
        priceInformation = tesla.getInformation();
        System.out.println(priceInformation);

        tesla.updatePrice(7);
        tesla.updatePrice(99);
        tesla.updatePrice(77);
        priceInformation = tesla.getInformation();
        System.out.println(priceInformation);
    }
}
