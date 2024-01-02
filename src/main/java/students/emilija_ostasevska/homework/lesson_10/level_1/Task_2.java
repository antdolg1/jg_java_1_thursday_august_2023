package students.emilija_ostasevska.homework.lesson_10.level_1;

import java.util.OptionalInt;
import java.util.Arrays;
import java.util.Random;

interface ArrayUtil {
    int[] createArray(int arrayLength);
    void fillArrayWithRandomNumbers(int[] array);
    void printArrayToConsole(int[] array);
    int findMaxNumber(int[] array);
    int findMinNumber(int[] array);
}

class ArrayUtilImpl implements ArrayUtil {

    @Override
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    @Override
    public void fillArrayWithRandomNumbers(int[] array) {
        for (int count = 0; count < array.length; count++) {
            int rndValue = new Random().nextInt(11);
            array[count] = rndValue;
        }
    }

    @Override
    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    @Override
    public int findMaxNumber(int[] array) {
        int maxValue = -1;
        OptionalInt max = Arrays.stream(array).max();
        if(max.isPresent()) {
            maxValue = max.getAsInt();
        }
        return maxValue;
    }

    @Override
    public int findMinNumber(int[] array) {
        int minValue = -1;
        OptionalInt min = Arrays.stream(array).min();
        if(min.isPresent()) {
          minValue = min.getAsInt();
        }
        return minValue;
    }
}

// Пример использования интерфейса и класса
class Demo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtilImpl();
        
        int[] array = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        
        int max = arrayUtil.findMaxNumber(array);
        int min = arrayUtil.findMinNumber(array);
        
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }
}
