package students.denis_asipenka.lesson_8.level_1;

public class FraudDetectorTest {
    public static void main(String[] args) {
        FraudRule[] array = new FraudRule[5];
        array[0] = new FraudRule1("FraudRule1");
        array[1] = new FraudRule2("FraudRule2");
        array[2] = new FraudRule3("FraudRule3");
        array[3] = new FraudRule4("FraudRule4");
        array[4] = new FraudRule5("FraudRule5");
        System.out.println("Результатом теста должен быть \"ОК\", если нет пометки \"FAIL\".");
        System.out.println("________________________________________________________");
        System.out.println();
        FraudDetectorTest test = new FraudDetectorTest();
        test.checkNameTrader(array);
        test.checkSum(array);
        test.checkCity(array);
        test.checkCityOne(array);
        test.checkCitySum(array);

    }

    void checkNameTrader(FraudRule[] array) {
        FraudDetector fraudDetector = new FraudDetector(array);
        Trader user = new Trader("Pokemon", "Minsk");
        Transaction transaction = new Transaction(user, 1000);
        FraudDetector.FraudDetectionResult result = fraudDetector.isFraud(transaction);
        if (result != null) {
            if (result.getRuleName().equalsIgnoreCase("FraudRule1")) {
                checkTestResult(true, "Тест на проверку является ли операция мошенническая " +
                        "(проверка по имени): ");
            }
        } else {
            checkTestResult(false, "Тест на проверку является ли операция мошенническая " +
                    "(проверка по имени): ");
        }
        Trader user1 = new Trader("Ivanov", "Minsk");
        Transaction transaction1 = new Transaction(user1, 1000);
        FraudDetector.FraudDetectionResult result1 = fraudDetector.isFraud(transaction1);
        if (result1 != null) {
            if (result1.getRuleName().equalsIgnoreCase("FraudRule1")) {
                checkTestResult(true, "Тест на проверку является ли операция мошенническая " +
                        "(проверка по имени *FAIL*): ");
            }
        } else {
            checkTestResult(false, "Тест на проверку является ли операция мошенническая " +
                    "(проверка по имени *FAIL*): ");
        }
    }

    void checkSum(FraudRule[] array) {
        FraudDetector fraudDetector = new FraudDetector(array);
        Trader user = new Trader("Poker", "Minsk");
        Transaction transaction = new Transaction(user, 10000000);
        FraudDetector.FraudDetectionResult result = fraudDetector.isFraud(transaction);
        if (result != null) {
            if (result.getRuleName().equalsIgnoreCase("FraudRule2")) {
                checkTestResult(true, "Тест на проверку является ли операция мошенническая " +
                        "(проверка по сумме): ");
            }
        } else {
            checkTestResult(false, "Тест на проверку является ли операция мошенническая " +
                    "(проверка по сумме): ");
        }
        Trader user1 = new Trader("Olehov", "Minsk");
        Transaction transaction1 = new Transaction(user1, 1000);
        FraudDetector.FraudDetectionResult result1 = fraudDetector.isFraud(transaction1);
        if (result1 != null) {
            if (result1.getRuleName().equalsIgnoreCase("FraudRule2")) {
                checkTestResult(true, "Тест на проверку является ли операция мошенническая " +
                        "(проверка по сумме *FAIL*): ");
            }
        } else {
            checkTestResult(false, "Тест на проверку является ли операция мошенническая " +
                    "(проверка по сумме *FAIL*): ");
        }
    }

    void checkCity(FraudRule[] array) {
        FraudDetector fraudDetector = new FraudDetector(array);
        Trader user = new Trader("Poker", "Sydney");
        Transaction transaction = new Transaction(user, 100);
        FraudDetector.FraudDetectionResult result = fraudDetector.isFraud(transaction);
        if (result != null) {
            if (result.getRuleName().equalsIgnoreCase("FraudRule3")) {
                checkTestResult(true, "Тест на проверку является ли операция мошенническая " +
                        "(проверка по городу): ");
            }
        } else {
            checkTestResult(false, "Тест на проверку является ли операция мошенническая " +
                    "(проверка по городу): ");
        }

        Trader user1 = new Trader("Olehov", "Minsk");
        Transaction transaction1 = new Transaction(user1, 1000);
        FraudDetector.FraudDetectionResult result1 = fraudDetector.isFraud(transaction1);
        if (result1 != null) {
            if (result1.getRuleName().equalsIgnoreCase("FraudRule3")) {
                checkTestResult(true, "Тест на проверку является ли операция мошенническая " +
                        "(проверка по городу *FAIL*): ");
            }
        } else {
            checkTestResult(false, "Тест на проверку является ли операция мошенническая " +
                    "(проверка по городу *FAIL*): ");
        }
    }

    void checkCityOne(FraudRule[] array) {
        FraudDetector fraudDetector = new FraudDetector(array);
        Trader user = new Trader("Poker", "JamAica");
        Transaction transaction = new Transaction(user, 100);
        FraudDetector.FraudDetectionResult result = fraudDetector.isFraud(transaction);
        if (result != null) {
            if (result.getRuleName().equalsIgnoreCase("FraudRule4")) {
                checkTestResult(true, "Тест на проверку является ли операция мошенническая " +
                        "(проверка по городу): ");
            }
        } else {
            checkTestResult(false, "Тест на проверку является ли операция мошенническая " +
                    "(проверка по городу): ");
        }

        Trader user1 = new Trader("Olehov", "Minsk");
        Transaction transaction1 = new Transaction(user1, 1000);
        FraudDetector.FraudDetectionResult result1 = fraudDetector.isFraud(transaction1);
        if (result1 != null) {
            if (result1.getRuleName().equalsIgnoreCase("FraudRule4")) {
                checkTestResult(true, "Тест на проверку является ли операция мошенническая " +
                        "(проверка по городу *FAIL*): ");
            }
        } else {
            checkTestResult(false, "Тест на проверку является ли операция мошенническая " +
                    "(проверка по городу *FAIL*): ");
        }
    }

    void checkCitySum(FraudRule[] array) {
        FraudDetector fraudDetector = new FraudDetector(array);
        Trader user = new Trader("Poker", "Germany");
        Transaction transaction = new Transaction(user, 1001);
        FraudDetector.FraudDetectionResult result = fraudDetector.isFraud(transaction);
        if (result != null) {
            if (result.getRuleName().equalsIgnoreCase("FraudRule5")) {
                checkTestResult(true, "Тест на проверку является ли операция мошенническая " +
                        "(проверка по городу и сумме): ");
            }
        } else {
            checkTestResult(false, "Тест на проверку является ли операция мошенническая " +
                    "(проверка по городу и сумме): ");
        }
        Trader user1 = new Trader("Olehov", "Minsk");
        Transaction transaction1 = new Transaction(user1, 1000);
        FraudDetector.FraudDetectionResult result1 = fraudDetector.isFraud(transaction1);
        if (result1 != null) {
            if (result1.getRuleName().equalsIgnoreCase("FraudRule5")) {
                checkTestResult(true, "Тест на проверку является ли операция мошенническая " +
                        "(проверка по городу и сумме *FAIL*)");
            }
        } else {
            checkTestResult(false, "Тест на проверку является ли операция мошенническая " +
                    "(проверка по городу и сумме *FAIL*)");
        }
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}