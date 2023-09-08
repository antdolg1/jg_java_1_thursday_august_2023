package students.aleksandrs_kunicins.homework.lesson_4.level_4;
class Calculator{
    public int sum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public int diff(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
        public int mult(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
        public int div(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
    public boolean  isEven(int number){
        if (number%2==0){
            return true;
        }else{
            return false;
        }
    }
    public String  maxOfNumbers(int firstNumber,int secondNumber){
        if (firstNumber>secondNumber){
            return firstNumber + " is greater than "+ secondNumber;
        }else if (secondNumber>firstNumber){
            return secondNumber + " is greater than "+ firstNumber;
        }else{
            return firstNumber + " is equal with "+ secondNumber;
        }

    }
    public int maxOfThree(int firstNumber,int secondNumber,int thirdNumber){
        if (firstNumber > secondNumber && firstNumber >thirdNumber){
            return firstNumber;  
        }else if (secondNumber>firstNumber && secondNumber>thirdNumber){
            return secondNumber;
        }else if (secondNumber == firstNumber && secondNumber == thirdNumber && thirdNumber == firstNumber){
            return firstNumber;
        }else if(thirdNumber>firstNumber && thirdNumber>secondNumber){
            return thirdNumber;
        }
        else{
            return 0;
        }
    }

}
