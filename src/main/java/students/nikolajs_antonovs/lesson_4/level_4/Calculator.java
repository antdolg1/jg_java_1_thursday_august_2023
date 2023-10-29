package students.nikolajs_antonovs.lesson_4.level_4;

class Calculator {

    int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return firstNumber = secondNumber;
        }
    }

    int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if (firstNumber <= secondNumber && secondNumber >=thirdNumber){
            return secondNumber;
        } else{
            return thirdNumber;
        }
    }


}
