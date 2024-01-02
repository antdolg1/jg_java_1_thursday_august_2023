package students.denis_asipenka.lesson_8.level_1;

public class FraudRule2Test {

    public static void main(String[] args) {
        FraudRule2Test test = new FraudRule2Test();
        test.test1();
    }

    void test1() {
        FraudRule2 fraudRule2 = new FraudRule2("FraudRule1");
        Trader user = new Trader("Poker", "Minsk");
        Transaction transaction = new Transaction(user, 10000000);
        checkTestResult(fraudRule2.isFraud(transaction), "Тест на проверку является ли операция мошенническая " +
                "(проверка по сумме): ");
        Trader user1 = new Trader("Olehov", "Minsk");
        Transaction transaction1 = new Transaction(user1, 1000);
        checkTestResult(fraudRule2.isFraud(transaction1), "Тест на проверку является ли операция мошенническая " +
                "(проверка по сумме *FAIL*): ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}