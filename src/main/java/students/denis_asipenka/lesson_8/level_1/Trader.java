package students.denis_asipenka.lesson_8.level_1;

public class Trader {
    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    private String fullName;
    private String city;
}

class Transaction {

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }

    private Trader trader;
    private int amount;
}

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
        return null;
    }

    public class FraudDetectionResult {

        public void setFraud(boolean fraud) {
            this.fraud = fraud;
        }

        public void setRuleName(String ruleName) {
            this.ruleName = ruleName;
        }

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

        private String ruleName;
    }
}