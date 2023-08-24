package students.aleksandrs_kunicins.homework.lesson_2.level_7;

public class Task_30 {

	public static void main(String[] args) {

		int numberOne = 10;
        float convertedNumberOne = (float) numberOne;
		double numberTwo = 20.0;
        float convertedNumberTwo = (float) numberOne;

		System.out.println("Number 1 = " + numberOne);
		System.out.println("Number 2 = " + numberTwo);

		float sum = convertedNumberOne + convertedNumberTwo;

		System.out.println("Sum = " + sum);
	}

}
// Если мы переведём все переменные под один тип данных, то тогда ошибок можно будет избежать