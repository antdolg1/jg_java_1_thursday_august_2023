package students.denis_asipenka.lesson_8.level_1;

public class FraudRule5Test {
    public static void main(String[] args) {
        FraudRule5Test test = new FraudRule5Test();
        test.test1();
    }

    void test1() {
        FraudRule5 fraudRule5 = new FraudRule5("FraudRule5");
        Trader user = new Trader("Poker", "Germany");
        Transaction transaction = new Transaction(user, 1001);
        checkTestResult(fraudRule5.isFraud(transaction), "Тест на проверку является ли операция мошенническая " +
                "(проверка по городу и сумме): ");
        Trader user1 = new Trader("Olehov", "Minsk");
        Transaction transaction1 = new Transaction(user1, 1000);
        checkTestResult(fraudRule5.isFraud(transaction1), "Тест на проверку является ли операция мошенническая " +
                "(проверка по городу и сумме *FAIL*): ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}