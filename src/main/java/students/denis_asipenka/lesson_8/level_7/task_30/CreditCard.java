package students.denis_asipenka.lesson_8.level_7.task_30;

public class CreditCard {

    private final long numberCard;
    private final int pinCode;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCreditLimited(int creditLimited) {
        this.creditLimited = creditLimited;
    }

    public void setLoanDebt(int loanDebt) {
        this.loanDebt = loanDebt;
    }

    private int balance;
    private int creditLimited;
    private int loanDebt;

    private CreditCard(CreditCardBuilder builder) {
        this.numberCard = builder.numberCard;
        this.pinCode = builder.pinCode;
        this.balance = builder.balance;
        this.creditLimited = builder.creditLimited;
        this.loanDebt = builder.loanDebt;
    }

    public int getPinCode() {
        return pinCode;
    }

    public int getBalance() {
        return balance;
    }

    public int getCreditLimited() {
        return creditLimited;
    }

    public int getLoanDebt() {
        return loanDebt;
    }


    public int deposit(int sum, int pin) {
        int amountToBeCredited;
        if (pin != getPinCode()) {
        } else {
            amountToBeCredited = sum;
            if (getLoanDebt() < 0) {
                int temp = getLoanDebt() * -1;
                if (temp < amountToBeCredited) {
                    setBalance(getBalance() + (amountToBeCredited - temp));
                    setLoanDebt(getLoanDebt() + temp);
                } else {
                    setLoanDebt(getLoanDebt() + amountToBeCredited);
                }
            } else {
                setBalance(getBalance() + amountToBeCredited);
            }
        }
        return getBalance();
    }

    public int withdraw(int sum, int pin) {
        if (pin != getPinCode()) {
        } else {
            int withdrawalAmount = sum;
            if (withdrawalAmount <= getBalance()) {
                setBalance(getBalance() - withdrawalAmount);
            } else {
                int temp = withdrawalAmount - getBalance(); //в темп сколько нам нужно взять из кредитного "счета"
                if (temp <= getCreditLimited()) {
                    setBalance(getBalance() - (withdrawalAmount - temp));
                    setCreditLimited(getCreditLimited() - temp);
                    setLoanDebt(getLoanDebt() - temp);
                }
            }
        }
        return getBalance();
    }

    public static class CreditCardBuilder {
        private final long numberCard;
        private final int pinCode;
        private int balance;
        private int creditLimited;
        private int loanDebt;


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

        public CreditCard builder() {
            CreditCard creditCard = new CreditCard(this);
            validateCreditCardObject(creditCard);
            return creditCard;
        }

        private void validateCreditCardObject(CreditCard creditCard) {

        }
    }
}