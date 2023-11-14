package students.denis_asipenka.lesson_8.level_7.task_30;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.incorrectPinCode();
        test.addBalance();
        test.addBalanceOne();
        test.addBalanceTwo();
        test.incorrectPinCodeOne();
        test.cashWithdrawal();
        test.cashWithdrawalOne();
        test.cashWithdrawalTwo();
    }

    void incorrectPinCode() {
        int pinCode = 0002;
        int deposit = 2000;
        CreditCard creditCard = new CreditCardBuilder(1234, 0001).balance(1000).creditLimited(0).loanDebt(0).build();
        checkTestResult(creditCard.deposit(deposit, pinCode), "Entering the wrong PIN code (FAIL PIN code is not correct, verification passed)");
    }

    void addBalance() {
        int pinCode = 0001;
        int deposit = 2000;
        int result = 2000;
        CreditCard creditCard = new CreditCardBuilder(1234, 0001).balance(0).creditLimited(1000).loanDebt(0).build();
        creditCard.deposit(deposit, pinCode);
        checkTestResult(creditCard.getBalance() == result, "Balance increase: ");
    }

    void addBalanceOne() {
        int pinCode = 0001;
        int deposit = 2000;
        int result = 1549;
        CreditCard creditCard = new CreditCardBuilder(1234, 0001).balance(0).creditLimited(1000).loanDebt(-451).build();
        creditCard.deposit(deposit, pinCode);
        checkTestResult(creditCard.getBalance() == result, "Adding an amount that is greater than the debt: ");
    }

    void addBalanceTwo() {
        int pinCode = 0001;
        int deposit = 151;
        int result = 0;
        CreditCard creditCard = new CreditCardBuilder(1234, 0001).balance(0).creditLimited(1000).loanDebt(-451).build();
        creditCard.deposit(deposit, pinCode);
        checkTestResult(creditCard.getBalance() == result, "Adding an amount that is not more than the debt: ");
    }

    void cashWithdrawal() {
        int pinCode = 0001;
        int withdraw = 1000;
        int result = 1000;
        CreditCard creditCard = new CreditCardBuilder(1234, 0001).balance(2000).creditLimited(1000).loanDebt(0).build();
        creditCard.withdraw(withdraw, pinCode);
        checkTestResult(creditCard.getBalance() == result, "Successful withdrawal of cash from the account, without credit");
    }

    void incorrectPinCodeOne() {
        int pinCode = 0002;
        int withdraw = 1000;
        int result = 1000;
        CreditCard creditCard = new CreditCardBuilder(1234, 0001).balance(2000).creditLimited(1000).loanDebt(0).build();
        creditCard.withdraw(withdraw, pinCode);
        checkTestResult(creditCard.getBalance() == result, "Entering the wrong PIN code (FAIL PIN code is not correct, verification passed)");
    }

    void cashWithdrawalOne() {
        int pinCode = 0001;
        int withdraw = 2000;
        int result = 0;
        CreditCard creditCard = new CreditCardBuilder(1234, 0001).balance(1000).creditLimited(1000).loanDebt(0).build();
        creditCard.withdraw(withdraw, pinCode);
        checkTestResult(creditCard.getBalance() == result, "Withdrawal against loan");
    }

    void cashWithdrawalTwo() {
        int pinCode = 0001;
        int withdraw = 2001;
        int result = 0;
        CreditCard creditCard = new CreditCardBuilder(1234, 0001).balance(1000).creditLimited(1000).loanDebt(0).build();
        creditCard.withdraw(withdraw, pinCode);
        checkTestResult(creditCard.getBalance() == result, "Withdrawal limit exceeded (FAIL limit exceeded, check passed)");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}