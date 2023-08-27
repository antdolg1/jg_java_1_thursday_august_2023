package teacher.lesson_3.lessoncode;

import java.util.Scanner;

public class BankCardApp {
    public static void main(String[] args) {

        BankCard bankCard1 = new BankCard("John Doe", 12345, 000);

        System.out.println("Card info - name: " + bankCard1.holderName + ", card number: " + bankCard1.cardNumber + ", balance: " + bankCard1.balance);

        bankCard1.depositMoney(1000);

        System.out.println("Card info - name: " + bankCard1.holderName + ", card number: " + bankCard1.cardNumber + ", balance: " + bankCard1.balance);

        bankCard1.withdrawMoney(400);

        System.out.println("Card info - name: " + bankCard1.holderName + ", card number: " + bankCard1.cardNumber + ", balance: " + bankCard1.balance);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter amount of money to deposit: ");

        bankCard1.depositMoney(scanner.nextInt());

        System.out.println("Card info - name: " + bankCard1.holderName + ", card number: " + bankCard1.cardNumber + ", balance: " + bankCard1.balance);


    }
}
