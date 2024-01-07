package students.anastassia_iljina.lesson_5.homework.level_5_6;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }
    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] result = arrayUtil.createArray(4);
        if (result != null && result.length == 4) {
            System.out.println("OK");
        } else {
            System.out.println("FALSE");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] array = {4, 9, 35, 1, 89};
        int maxNumber = arrayUtil.findMaxNumber(array);
        if (maxNumber == 89) {
            System.out.println("OK");
        } else {
            System.out.println("FALSE");
        }

    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] array = {3, 98, 34, -7, 99, -53};
        int minNumber = arrayUtil.findMinNumber(array);
        if (minNumber == -53) {
            System.out.println("OK");
        } else {
            System.out.println("FALSE");
        }
    }
}
