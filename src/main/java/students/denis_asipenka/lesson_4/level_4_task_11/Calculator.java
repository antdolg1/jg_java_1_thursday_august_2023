package students.denis_asipenka.lesson_4.level_4_task_11;


public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int del(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else return false;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return secondNumber;
        } else
            return firstNumber;
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber == secondNumber) && (secondNumber == thirdNumber)) {
            return firstNumber;
        } else if ((firstNumber == secondNumber && firstNumber != thirdNumber)) {
            if (firstNumber > thirdNumber) {
                return firstNumber;
            } else return thirdNumber;
        } else if ((secondNumber == thirdNumber) && (firstNumber != secondNumber)) {
            if (firstNumber > secondNumber) {
                return firstNumber;
            } else return secondNumber;
        } else if ((firstNumber == thirdNumber) && (secondNumber != thirdNumber)) {
            if (firstNumber > secondNumber) {
                return firstNumber;
            } else return secondNumber;
        } else {
            if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
                return firstNumber;
            } else if ((firstNumber < secondNumber) && (secondNumber > thirdNumber)) {
                return secondNumber;
            } else if ((firstNumber > secondNumber) && (firstNumber < thirdNumber)) {
                return thirdNumber;
            } else {
                return thirdNumber;
            }
        }
    }
}








