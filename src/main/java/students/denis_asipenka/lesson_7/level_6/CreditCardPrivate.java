package students.denis_asipenka.lesson_7.level_6;

import java.util.Scanner;

public class CreditCardPrivate {
    public long numberCard;
    public int pinCode;
    public int balance;
    public int creditLimited;
    public int loanDebt;
    public CreditCardPrivate(long numberCard, int pinCode, int creditLimited) {
        this.numberCard = numberCard;
        this.pinCode = pinCode;
        this.balance = 0;
        this.creditLimited = creditLimited;
        this.loanDebt = 0;
    }
Scanner scanner = new Scanner(System.in);
    public CreditCardPrivate() {
    }
    public void deposit() {
        System.out.println("Enter the PIN code from the card: ");
        int checkPinCode = scanner.nextInt();
        int amountToBeCredited;
        if (checkPinCode != pinCode) {
            System.out.println("PIN code is not correct your transaction was rejected!");
        } else {
            System.out.println("Enter the amount to be credited to your account: ");
            amountToBeCredited = scanner.nextInt();
            if (loanDebt < 0) {
                int temp = loanDebt * -1; // получаем без минуса
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
    }
    public int withdraw(){
        System.out.println("Enter the PIN code from the card: ");
        int checkPinCode = scanner.nextInt();
        int withdrawalAmount;
        if (checkPinCode != pinCode) {
            System.out.println("PIN code is not correct your transaction was rejected!");
        } else {
            System.out.println("Enter the amount to be withdrawn from your account: ");
            withdrawalAmount = scanner.nextInt();
            if (withdrawalAmount<=balance){
                balance-=withdrawalAmount;
            } else {
                int temp = withdrawalAmount-balance; //в темп сколько нам нужно взять из кредитного "счета"
               if (temp<creditLimited){
                   balance-=withdrawalAmount-temp;
                   creditLimited-=temp;
                   loanDebt-=temp;
               } else {
                   System.out.println("Operation canceled \"insufficient funds\"");
               }
            }
        }
            return balance;
    }
}