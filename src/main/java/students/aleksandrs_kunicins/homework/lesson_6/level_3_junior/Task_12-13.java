package students.aleksandrs_kunicins.homework.lesson_6.level_3_junior;

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
}
class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldReturnTrue();
        test.shouldReturnFalse();
        test.shouldReturnCountOfReapets();
        test.shouldReturnZero();
        test.shouldReturnThree();
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
}