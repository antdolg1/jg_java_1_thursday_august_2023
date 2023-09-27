package students.julija_pilenkova.homework.lesson_6.level_1;

class NumberUtils {
    public boolean isEven(int number) {
        return (number % 2 == 0);
    }
}

class NumberUtilsDemo {
    public static void main(String[] args) {
        NumberUtilsDemo test = new NumberUtilsDemo();
        test.testIsEven(4);
    }

    void testIsEven(int number) {
        NumberUtils test = new NumberUtils();
        boolean result = test.isEven(number);
        if (result) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}
