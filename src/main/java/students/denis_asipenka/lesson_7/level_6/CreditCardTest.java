package students.denis_asipenka.lesson_7.level_6;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.addBalance();
        test.incorrectPinCode();
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
        int result = 2000;
        CreditCard creditCard = new CreditCard(1234, 0001, 1000, 0, 0);
        checkTestResult(creditCard.deposit(deposit, pinCode) == result, "Entering the wrong PIN code (FAIL PIN code is not correct, verification passed)");
    }

    void addBalance() {
        int pinCode = 0001;
        int deposit = 2000;
        int result = 2000;
        CreditCard creditCard = new CreditCard(1234, 0001, 1000, 0, 0);
        checkTestResult(creditCard.deposit(deposit, pinCode) == result, "Balance increase: ");
    }

    void addBalanceOne() {
        int pinCode = 0001;
        int deposit = 2000;
        int result = 1549;
        CreditCard creditCard = new CreditCard(1234, 0001, 1000, -451, 0);
        checkTestResult(creditCard.deposit(deposit, pinCode) == result, "Adding an amount that is greater than the debt: ");
    }

    void addBalanceTwo() {
        int pinCode = 0001;
        int deposit = 151;
        int result = 0;
        CreditCard creditCard = new CreditCard(1234, 0001, 1000, -451, 0);
        checkTestResult(creditCard.deposit(deposit, pinCode) == result, "Adding an amount that is not more than the debt: ");
    }

    void cashWithdrawal() {
        int pinCode = 0001;
        int withdraw = 1000;
        int result = 1000;
        CreditCard creditCard = new CreditCard(1234, 0001, 1000, 0, 2000);
        checkTestResult(creditCard.withdraw(withdraw, pinCode) == result, "Successful withdrawal of cash from the account, without credit");
    }

    void incorrectPinCodeOne() {
        int pinCode = 0002;
        int withdraw = 1000;
        int result = 1000;
        CreditCard creditCard = new CreditCard(1234, 0001, 1000, 0, 2000);
        checkTestResult(creditCard.withdraw(withdraw, pinCode) == result, "Entering the wrong PIN code (FAIL PIN code is not correct, verification passed)");
    }

    void cashWithdrawalOne() {
        int pinCode = 0001;
        int withdraw = 2000;
        int result = 0;
        CreditCard creditCard = new CreditCard(1234, 0001, 1000, 0, 1000);
        checkTestResult(creditCard.withdraw(withdraw, pinCode) == result, "Withdrawal against loan");
    }

    void cashWithdrawalTwo() {
        int pinCode = 0001;
        int withdraw = 2001;
        int result = 0;
        CreditCard creditCard = new CreditCard(1234, 0001, 1000, 0, 1000);
        checkTestResult(creditCard.withdraw(withdraw, pinCode) == result, "Withdrawal limit exceeded (FAIL limit exceeded, check passed)");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}