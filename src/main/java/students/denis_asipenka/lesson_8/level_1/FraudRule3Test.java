package students.denis_asipenka.lesson_8.level_1;

public class FraudRule3Test {
    public static void main(String[] args) {
        FraudRule3Test test = new FraudRule3Test();
        test.test1();
    }

    void test1() {
        FraudRule3 fraudRule3 = new FraudRule3("FraudRule3");
        Trader user = new Trader("Poker", "syDney");
        Transaction transaction = new Transaction(user, 100);
        checkTestResult(fraudRule3.isFraud(transaction), "Тест на проверку является ли операция мошенническая " +
                "(проверка по городу): ");
        Trader user1 = new Trader("Olehov", "Minsk");
        Transaction transaction1 = new Transaction(user1, 1000);
        checkTestResult(fraudRule3.isFraud(transaction1), "Тест на проверку является ли операция мошенническая " +
                "(проверка по городу *FAIL*): ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}