package students.denis_asipenka.lesson_5.level_5;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int lenghtArrays = 2;
        int result = 2;
        displayingResult(arrayUtil.createArray(lenghtArrays).length == result, "length arrays");
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] mass = new int[]{2, 9};
        int result = 9;
        displayingResult(arrayUtil.findMaxNumber(mass) == result, "max numbers");
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] mass = new int[]{2, 9};
        int result = 2;
//        int lengthArrays=5;
//        int[] mass=arrayUtil.createArray(lengthArrays);
//        arrayUtil.fillArrayWithRandomNumbers(mass);
//        arrayUtil.printArrayToConsole(mass);
        if (arrayUtil.findMinNumber(mass) == result) {
            System.out.println("Test min numbers - OK");
        } else System.out.println("Test min numbers - FAIL");
    }

    public void displayingResult(boolean result, String name) {
        if (result) {
            System.out.println("Test " + name + " - OK");
        } else System.out.println("Test " + name + " - FAIL");
    }

}
