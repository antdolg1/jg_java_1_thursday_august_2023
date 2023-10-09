package students.denis_asipenka.lesson_8.level_1;

public class FraudRule5 extends FraudRule {
    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCity().equalsIgnoreCase("Germany") && (t.getAmount() > 1000)) {
            return true;
        } else
            return false;
    }
}