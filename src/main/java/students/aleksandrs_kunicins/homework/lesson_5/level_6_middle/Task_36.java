package students.aleksandrs_kunicins.homework.lesson_5.level_6_middle;
import java.util.Arrays;
class ArrayUtil4 {

    public int findMaxNumber(int[] array) {
        Arrays.sort(array);
        int lastNumber = array.length -1;
        return array[lastNumber]; 
    }

}
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {

    }

    public void shouldFindMaxNumber() {
        ArrayUtil4 au1 = new ArrayUtil4();
        int [] array = {14,90,30};
        int exected = 90;
        int real = au1.findMaxNumber(array);
        if (real==exected){
            System.out.println("Max number test : Passed");
        }else{
            System.out.println("Max number test : Failed");
        }
        
    }
}
