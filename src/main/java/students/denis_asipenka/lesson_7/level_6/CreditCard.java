package students.denis_asipenka.lesson_7.level_6;

public class CreditCard {
    public long numberCard;
    public int pinCode;
    public int balance;
    public int creditLimited;
    public int loanDebt;

    public CreditCard(long numberCard, int pinCode, int creditLimited, int loanDebt, int balance) {
        this.numberCard = numberCard;
        this.pinCode = pinCode;
        this.balance = balance;
        this.creditLimited = creditLimited;
        this.loanDebt = loanDebt;
    }

    public CreditCard() {
    }

    public int deposit(int sum, int pin) {
        int amountToBeCredited;
        if (pin != pinCode) {
        } else {
            amountToBeCredited = sum;
            if (loanDebt < 0) {
                int temp = loanDebt * -1;
                if (temp < amountToBeCredited) {
                    balance += amountToBeCredited - temp;
                    loanDebt += temp;
                } else {
                    loanDebt += amountToBeCredited;
                }
            } else {
                balance += amountToBeCredited;
            }
        }
        return balance;
    }

    public int withdraw(int sum, int pin) {
        if (pin != pinCode) {
        } else {
            int withdrawalAmount = sum;
            if (withdrawalAmount <= balance) {
                balance -= withdrawalAmount;
            } else {
                int temp = withdrawalAmount - balance; //в темп сколько нам нужно взять из кредитного "счета"
                if (temp <= creditLimited) {
                    balance -= withdrawalAmount - temp;
                    creditLimited -= temp;
                    loanDebt -= temp;
                }
            }
        }
        return balance;
    }
}