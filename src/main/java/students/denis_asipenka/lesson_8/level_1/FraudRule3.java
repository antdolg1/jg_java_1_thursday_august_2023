package students.denis_asipenka.lesson_8.level_1;

public class FraudRule3 extends FraudRule {
    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCity().equalsIgnoreCase("Sydney")) {
            return true;
        } else {
            return false;
        }
    }
}