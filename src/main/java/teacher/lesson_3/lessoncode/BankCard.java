package teacher.lesson_3.lessoncode;

public class BankCard {

    public String holderName;
    public int cardNumber;
    public int cvcCode;
    public int balance;
    public String bankName;

    public BankCard(String holderName, int cardNumber, int cvcCode) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.cvcCode = cvcCode;
        this.balance = 0;
        this.bankName = "Swedbank";
    }

    public BankCard() {
    }

    public int depositMoney(int moneyToAdd) {
        balance = balance + moneyToAdd;
        //balance += moneyToAdd; is the same as balance = balance + moneyToAdd;
        return balance;
    }

    public int withdrawMoney(int moneyToWithdraw) {
        balance = balance - moneyToWithdraw;
        //balance -= moneyToWithdraw; is the same as balance = balance - moneyToWithdraw;
        return balance;
    }
}
