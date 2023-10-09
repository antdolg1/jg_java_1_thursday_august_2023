package students.denis_asipenka.lesson_8.level_1;

public class FraudRule1 extends FraudRule {
    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().equalsIgnoreCase("Pokemon")) {
            return true;
        } else
            return false;
    }
}