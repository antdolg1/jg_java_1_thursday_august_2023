package students.aleksandrs_kunicins.homework.lesson_5.level_6_middle;

// В классе ArrayUtilTest напишите автоматический тест
// для метода int findMinNumber(int[] array)
// из предыдущего задания.

class ArrayUtilTest2 {

    public static void main(String[] args) {
        ArrayUtilTest2 test = new ArrayUtilTest2();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
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

    public void shouldFindMinNumber() {
        ArrayUtil2 au2 = new ArrayUtil2();
        int[] array = {54,123,32};
        int exected = 32;
        int real = au2.findMinNumber(array);
        if (real == exected){
            System.out.println("Min number test : Passed");
        }else{
            System.out.println("Min number test : Failed");
        }
    }
}
