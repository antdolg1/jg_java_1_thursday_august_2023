package students.aleksandrs_kunicins.homework.lesson_5.level_6_middle;
import java.util.Arrays;
class ArrayUtil1 {

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
        ArrayUtil1 au1 = new ArrayUtil1();
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
