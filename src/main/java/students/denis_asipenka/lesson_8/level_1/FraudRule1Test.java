package students.denis_asipenka.lesson_8.level_1;

public class FraudRule1Test {
    public static void main(String[] args) {
        FraudRule1Test test = new FraudRule1Test();
        test.test1();
    }

    void test1() {
        FraudRule1 fraudRule1 = new FraudRule1("FraudRule1");
        Trader user = new Trader("Pokemon", "Minsk");
        Transaction transaction = new Transaction(user, 1000);
        checkTestResult(fraudRule1.isFraud(transaction), "Тест на проверку является ли операция мошенническая " +
                "(проверка по имени): ");
        Trader user1 = new Trader("Olehov", "Minsk");
        Transaction transaction1 = new Transaction(user1, 1000);
        checkTestResult(fraudRule1.isFraud(transaction1), "Тест на проверку является ли операция мошенническая " +
                "(проверка по имени *FAIL*): ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}