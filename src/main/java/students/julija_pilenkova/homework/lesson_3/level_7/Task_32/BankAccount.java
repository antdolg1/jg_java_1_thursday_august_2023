package students.julija_pilenkova.homework.lesson_3.level_7.Task_32;

public class BankAccount {

    String owner;
    int money;

    BankAccount(String ownerFirstName, int moneyAmount) {
        this.owner = ownerFirstName;
        this.money = moneyAmount;
    }

    String getOwner() {return owner; }

    int getMoney() {
        return money;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("John", 100000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }


}
