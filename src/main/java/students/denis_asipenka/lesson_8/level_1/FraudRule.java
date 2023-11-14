package students.denis_asipenka.lesson_8.level_1;

abstract class FraudRule {
    private String ruleName;

    public String getRuleName() {
        return ruleName;
    }

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);
}