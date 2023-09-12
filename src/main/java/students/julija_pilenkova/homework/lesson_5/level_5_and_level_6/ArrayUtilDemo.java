package students.julija_pilenkova.homework.lesson_5.level_5_and_level_6;

public class ArrayUtilDemo {

    public static void main(String[] args) {

        ArrayUtill arrayUtill = new ArrayUtill();
        int arrayLength = arrayUtill.arrayFromUser(5);
        int[] array = arrayUtill.array(arrayLength);
        arrayUtill.fillArraysWithRandomNumbers(array);
        arrayUtill.printArrayToConsole(array);
        int maxNumber = arrayUtill.findMaxNumber(array);
        System.out.println("Max number: " + maxNumber);
        int minNumber = arrayUtill.findMinNumber(array);
        System.out.println("Min number: " + minNumber);

    }
}
