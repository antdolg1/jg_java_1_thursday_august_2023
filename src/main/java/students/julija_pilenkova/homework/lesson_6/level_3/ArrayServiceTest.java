package students.julija_pilenkova.homework.lesson_6.level_3;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.findNumberInArrayTest();
    }

    private void findNumberInArrayTest() {
        ArrayService test = new ArrayService();
        int [] array = {10};
        boolean expectedResult = test.contains(array,10);
        checkResults(expectedResult, "Find number in array test - ");
    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + "OK");
        } else {
            System.out.println(testName + "FAIL");
        }
    }
}
