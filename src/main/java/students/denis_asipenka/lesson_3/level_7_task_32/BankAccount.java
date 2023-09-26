package students.denis_asipenka.lesson_3.level_7_task_32;

class BankAccount {

    String owner;
    int money;

    BankAccount(String moneyAmount,int money) {
        this.owner = moneyAmount;
        this.money=money;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
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
