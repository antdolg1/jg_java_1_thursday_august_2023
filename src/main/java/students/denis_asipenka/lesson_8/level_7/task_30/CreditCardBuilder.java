package students.denis_asipenka.lesson_8.level_7.task_30;

public class CreditCardBuilder {
    private long numberCard;
    private int pinCode;
    private int balance;
    private int creditLimited;
    private int loanDebt;

    public CreditCard build() {
        CreditCard creditCard = new CreditCard();
        creditCard.setNumberCard(this.numberCard);
        creditCard.setPinCode(this.pinCode);
        creditCard.setBalance(this.balance);
        creditCard.setCreditLimited(this.creditLimited);
        creditCard.setLoanDebt(this.loanDebt);
        return creditCard;
    }

    public CreditCardBuilder(long numberCard, int pinCode) {
        this.numberCard = numberCard;
        this.pinCode = pinCode;
    }

    public CreditCardBuilder balance(int balance) {
        this.balance = balance;
        return this;
    }

    public CreditCardBuilder creditLimited(int creditLimited) {
        this.creditLimited = creditLimited;
        return this;
    }

    public CreditCardBuilder loanDebt(int loanDebt) {
        this.loanDebt = loanDebt;
        return this;
    }
}