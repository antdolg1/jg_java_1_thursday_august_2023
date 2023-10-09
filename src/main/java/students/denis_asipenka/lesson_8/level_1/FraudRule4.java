package students.denis_asipenka.lesson_8.level_1;

public class FraudRule4 extends FraudRule {
    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCity().equalsIgnoreCase("JamAica")) {
            return true;
        } else
            return false;
    }
}