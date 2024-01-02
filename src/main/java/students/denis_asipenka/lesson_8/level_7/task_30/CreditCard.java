package students.denis_asipenka.lesson_8.level_7.task_30;

public class CreditCard {
    private long numberCard;
    private int pinCode;
    private int balance;
    private int creditLimited;
    private int loanDebt;

    public CreditCard() {
    }

    public long getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(long numberCard) {
        this.numberCard = numberCard;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCreditLimited(int creditLimited) {
        this.creditLimited = creditLimited;
    }

    public void setLoanDebt(int loanDebt) {
        this.loanDebt = loanDebt;
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

    public boolean deposit(int sum, int pin) {
        int amountToBeCredited;
        if (pin != getPinCode()) {
            System.out.println("PIN code is not correct your transaction was rejected!");
            return false;
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
        return true;
    }

    public boolean withdraw(int sum, int pin) {
        if (pin != getPinCode()) {
            System.out.println("PIN code is not correct your transaction was rejected!");
            return false;
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
        return true;
    }
}