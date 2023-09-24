package students.aleksandrs_kunicins.homework.lesson_6.level_3_junior;

import java.util.Arrays;

class ArrayService{
    boolean isInArray(int[] arr,int number){
        boolean contain = false;
        for(int i:arr){
            if (i == number){
                contain = true;   
        }
    }return contain;
}

    int findRepeats(int[] array,int numberToFindReapets){
        int repeats = 0;
        for (int i :array){
            if (i == numberToFindReapets){
                repeats ++;
            }
        }
        return repeats;
    }

    int[] replaceFirstNumber(int[]array,int numberToReplace){
        array[0]=numberToReplace;
        return array;
    }

    int[] reverseArray(int [] arrayToReverse){ 
        int countOfElements = arrayToReverse.length;
        int [] reverseArray = new int[countOfElements];
        for (int i = 0; i<arrayToReverse.length;i++){
             countOfElements --;
             reverseArray[i] = arrayToReverse[countOfElements];

        }
        return reverseArray;
    }

    int[] sortArray(int[] arrayToSort){
        Arrays.sort(arrayToSort); 
        return arrayToSort;
    }

}
    
class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldReturnTrue();
        test.shouldReturnFalse();
        test.shouldReturnCountOfReapets();
        test.shouldReturnZero();
        test.shouldReturnThree();
        test.shouldReplaceFirstNumber();
        test.shouldReturnReversedArray();
        test.shouldSortArray();
    }

    public void shouldReturnTrue(){
        ArrayService service = new ArrayService();
        int[] array = {1,2,3,4,5,6};
        int numberForCheack = 5;
        boolean expectedResult = true; 

        boolean answer = service.isInArray(array, numberForCheack);
        if (answer == expectedResult){
            System.out.println("Test with true = OK!");
        }else{
            System.out.println("Test for true = FAIL!");
        }
    }

    public void shouldReturnFalse(){
        ArrayService service = new ArrayService();
        int[] array = {1,2,3,4,5,6};
        int numberForCheack = 10;
        boolean expectedResult = false; 

        boolean answer = service.isInArray(array, numberForCheack);
        if (answer == expectedResult){
            System.out.println("Test with false = OK!");
        }else{
            System.out.println("Test for false = FAIL!");
        }
    }
    public void shouldReturnCountOfReapets(){
        ArrayService service = new ArrayService();
        int [] array = {1,2,3,2,2,3,4,5,6};
        int numberToFindReapets = 2;
        int expectedCountOfNumbers = 3;

        int realNumber = service.findRepeats(array, numberToFindReapets);
        if (realNumber ==expectedCountOfNumbers){
            System.out.println("Test 1 repeat : OK!");
        }else{
            System.out.println("Test 1 repeat : FAIL!");
        }
    }

    public void shouldReturnZero(){
        ArrayService service = new ArrayService();
        int [] array = {1,2,3,2,2,3,4,5,6};
        int numberToFindReapets = 9;
        int expectedCountOfNumbers = 0;

        int realNumber = service.findRepeats(array, numberToFindReapets);
        if (realNumber ==expectedCountOfNumbers){
            System.out.println("Test 2 repeat : OK!");
        }else{
            System.out.println("Test 2 repeat : FAIL!");
        }
    }
     public void shouldReturnThree(){
        ArrayService service = new ArrayService();
        int [] array = {1,2,3,2,2,3,4,5,6};
        int numberToFindReapets = 3;
        int expectedCountOfNumbers = 2;

        int realNumber = service.findRepeats(array, numberToFindReapets);
        if (realNumber ==expectedCountOfNumbers){
            System.out.println("Test 3 repeat : OK!");
        }else{
            System.out.println("Test 3 repeat : FAIL!");
        }
    }
    public void shouldReplaceFirstNumber(){
        ArrayService service = new ArrayService();
        int [] arrayBefore = {1,2,3,4,5,6,7,8};
        int numberToCHange = 5;
        int [] arrayExpected = {numberToCHange,2,3,4,5,6,7,8};
        int [] realArray = service.replaceFirstNumber(arrayBefore, numberToCHange);
        int realResult = 0;
        int expectedResult = 0;
        for (int i:realArray){
            realResult += i;
        }
        for (int a:arrayExpected){
            expectedResult += a;
        }
        if (expectedResult == realResult){
            System.out.println("Replace number test = OK!");
        }else{
            System.out.println("Replace number test = FAIL!");

        }

    }
    public void shouldReturnReversedArray(){
        ArrayService service = new ArrayService();
        int [] array = {1,2,3,4,5};
        int[] newArray = service.reverseArray(array);
        int[] expectedArray = {5,4,3,2,1};
        if (Arrays.equals(newArray,expectedArray)){
            System.out.println("Array test : OK!");
        }else{
            System.out.println("Array test : FAILED!");
        }
    }
    public void shouldSortArray(){
        ArrayService service = new ArrayService();
        int [] massive = {23,541,2,4,87,4,15,32};
        service.sortArray(massive);
        int [] expectedArray = {2,4,4,15,23,32,87,541};

        if (Arrays.equals(expectedArray,massive)){
            System.out.println("Arrays sort test : OK!");
        }else{
            System.out.println("Arrays sort test : FAILED!");
        }
    }
}