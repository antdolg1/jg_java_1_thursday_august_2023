package students.denis_asipenka.lesson_8.level_1;

public class FraudRule4Test {
    public static void main(String[] args) {
        FraudRule4Test test = new FraudRule4Test();
        test.test1();
    }

    void test1() {
        FraudRule4 fraudRule4 = new FraudRule4("FraudRule4");
        Trader user = new Trader("Poker", "Jamaica");
        Transaction transaction = new Transaction(user, 100);
        checkTestResult(fraudRule4.isFraud(transaction), "Тест на проверку является ли операция мошенническая " +
                "(проверка по городу): ");
        Trader user1 = new Trader("Olehov", "Minsk");
        Transaction transaction1 = new Transaction(user1, 1000);
        checkTestResult(fraudRule4.isFraud(transaction1), "Тест на проверку является ли операция мошенническая " +
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