package students.julija_pilenkova.homework.lesson_4.level_4;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multipl(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEvenOrOdd(int number) {
        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int numberOne, int numberTwo) {
        if (numberOne > numberTwo) {
            return numberOne;
        } else if (numberOne == numberTwo) {
            System.out.println("Equals");
        }
        return numberTwo;

    }

    public int maxOfThreeNumbers(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 > num3) {
            return num1;
        } else if (num2 >= num1 && num2 > num3) {
            return num2;
        } else if (num3 >= num1 && num3 > num2) {
            return num3;
        }
        return num1;
    }

}
















