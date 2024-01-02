package students.anastassia_iljina.lesson_3.homework;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
        String ownerFirstName = bankAccount.ownerFirstName;
        String ownerLastName = bankAccount.ownerLastName;
        int moneyAmount = bankAccount.moneyAmount;
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }
}
