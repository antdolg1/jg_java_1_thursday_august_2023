package students.denis_asipenka.lesson_8.level_1;

class FraudDetector {
    private FraudRule[] array;

    public FraudDetector(FraudRule[] array) {
        this.array = array;
    }

    FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule a : array) {
            if (a.isFraud(t)) {
                System.out.println();
                System.out.println("Мошенническая транзакция обнаружена: \nИмя: " + t.getTrader().getFullName() + "\nГород: "
                        + t.getTrader().getCity() + "\nСумма: " + t.getAmount() + "\nСценарий проверки: " + a.getRuleName());
                System.out.println();
                return new FraudDetectionResult(true, a.getRuleName());
            }
        }
        return new FraudDetectionResult(false,"Мошенничество не обнаружено.");
    }

    public class FraudDetectionResult {
        private String ruleName;
        private boolean fraud;

        public FraudDetectionResult(boolean fraud, String ruleName) {
            this.fraud = fraud;
            this.ruleName = ruleName;
        }

        public boolean isFraud() {
            return fraud;
        }

        public String getRuleName() {
            return ruleName;
        }

    }
}