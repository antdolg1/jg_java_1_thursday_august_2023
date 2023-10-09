package students.denis_asipenka.lesson_8.level_1;

abstract class FraudRule {
    public String getRuleName() {
        return ruleName;
    }

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;

    }

    public abstract boolean isFraud(Transaction t);
}