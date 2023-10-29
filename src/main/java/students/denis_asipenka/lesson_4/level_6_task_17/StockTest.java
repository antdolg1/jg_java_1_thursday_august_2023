package students.denis_asipenka.lesson_4.level_6_task_17;


public class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.testMax();
    }

    public void testMax() {
        int firstNumber = 8;
        int expectedResult = 1000;
        Stock stock = new Stock("GOOG", firstNumber);
        stock.updatePrice(999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        int realResult = stock.updatePrice(8);
        if (realResult == expectedResult) {
            System.out.println("Max test = OK");
            stock.getPriceInformation();
        } else {
            System.out.println("Max test = FAIL");
        }
    }
}
