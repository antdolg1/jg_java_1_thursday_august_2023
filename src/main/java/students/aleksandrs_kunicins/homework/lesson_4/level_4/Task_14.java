package students.aleksandrs_kunicins.homework.lesson_4.level_4;

 class CalculatorTest3 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int firstNumber = 10;
        int secondNumber = 20;

        int thirdNumber = 30;
        int fourthNumber = 30;

        int fifthNuber = 12;
        int sisthNumber = 11;

        String firstTest = secondNumber + " is greater than " + firstNumber; 
        String secondTest = thirdNumber + " is equal with " + thirdNumber; 
        String thirdTest = fifthNuber + "is greater than" + sisthNumber; 

        String result1 = calc.maxOfNumbers(firstNumber, secondNumber);
        String result2 = calc.maxOfNumbers(thirdNumber, fourthNumber);
        String result3 = calc.maxOfNumbers(fifthNuber, sisthNumber);

        if (result1 ==firstTest){
            System.out.println("Passed");
        }else{
            System.out.println("Fail");
        }
        if (result2 == secondTest){
            System.out.println("Passed");
        }else{
            System.out.println("Fail");
        }
        if (result3 == thirdTest){
            System.out.println("Passed");
        }else{
            System.out.println("Fail");
        }
    }
}
