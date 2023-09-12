package students.julija_pilenkova.homework.lesson_5.level_5_and_level_6;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtill arrayUtill = new ArrayUtill();
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMinNumber();
        test.shouldFindMaxNumber();


    }

    private void shouldFindMaxNumber() {
        int[] array = {22, 33, 44, 55, 66};
        int expectedResult = 66;
        ArrayUtill arrayUtill = new ArrayUtill();
        expectedResult = arrayUtill.findMaxNumber(array);
        if (expectedResult == 66) {
            System.out.println("Max number test is ok");
        } else {
            System.out.println("Max number test is fail");
        }
    }


    private void shouldFindMinNumber() {
        int[] array = {5, 3, 7, 9};
        int expectedResult = 3;
        ArrayUtill arrayUtill = new ArrayUtill();
        expectedResult = arrayUtill.findMinNumber(array);
        if (expectedResult == 3) {
            System.out.println("Min number test is ok");
        } else {
            System.out.println("Min number test is FAIL");
        }
    }

    private void shouldCreateArray() {

    }


}
