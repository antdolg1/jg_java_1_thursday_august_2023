package students.nikolajs_antonovs.lesson_5.level_5_6;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = 10;
        int[] result = arrayUtil.createArray((arrayLength));

        if (result.length == arrayLength) {
            System.out.println("Array created!");
        } else {
            System.out.println("Array was not created!");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 3, 5};
        int expectedResult = 5;
        int realMax = arrayUtil.findMaxNumber(array);
        if (realMax == expectedResult) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test failed");
        }

    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 3, 5};
        int expectedResult = 5;
        int realMin = arrayUtil.findMinNumber(array);
        if (realMin == expectedResult) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test failed");
        }

    }
}
