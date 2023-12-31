package students.aleksandrs_kunicins.homework.lesson_3.level_4;

class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String ownerFirstName,
                String ownerLastName, //Запятая
                int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount; // Имя переменных 
    }

    String getOwnerFirstName() { //Скобочка
        return this.ownerFirstName; // Точка с запятой
    }

    String getOwnerLastName() { //Скобочки
        return this.ownerFirstName; //Точка с запятой
    }

    int getMoneyAmount() { //void -> int
        return this.moneyAmount;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName(); 
        int moneyAmount = bankAccount.getMoneyAmount(); // task_7 -> int
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }

}
