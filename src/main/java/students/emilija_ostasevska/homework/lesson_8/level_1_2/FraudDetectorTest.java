package students.emilija_ostasevska.homework.lesson_8.level_1_2;

class FraudDetectorTest {

    public static void main(String[] args) {
        returnPositive(); 
        returnNegative(); 
    }

    public static void returnPositive() {
        Trader pokemonTrader = new Trader("Pokemon", "City");
        Transaction transaction = new Transaction(pokemonTrader, 1000);

        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        boolean expected = true;


        // должно быть ОК
        if (expected == result) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    public static void returnNegative() {
        Trader goodTrader = new Trader("Trader", "City");
        Transaction transaction = new Transaction(goodTrader, 1000);

        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        boolean expected = false;


        // должно быть ОК
        if (expected == result) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }
}