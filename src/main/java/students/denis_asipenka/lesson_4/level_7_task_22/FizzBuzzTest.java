package students.denis_asipenka.lesson_4.level_7_task_22;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.delTestFizz();
        fizzBuzzTest.delTestBuzz();
        fizzBuzzTest.delTestFizzBuzz();
        fizzBuzzTest.delTestReturnNumber();
    }
    public void delTestFizz() {
        int number = 3;  // подготавливаем тестовые данные
        String expectedResult = "Fizz";  // подготавливаем тестовые данные
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);  // вызываем продакшен код, который хотим протестировать
        if (realResult.equals(expectedResult)) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Fizz test = OK");
        } else {
            System.out.println("Fizz test = FAIL");
        }
    }
    public void delTestBuzz() {
        int number = 5;  // подготавливаем тестовые данные
        String expectedResult = "Buzz";  // подготавливаем тестовые данные
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);  // вызываем продакшен код, который хотим протестировать
        if (realResult.equals(expectedResult)) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Fizz test = OK");
        } else {
            System.out.println("Fizz test = FAIL");
        }
    }
    public void delTestFizzBuzz() {
        int number = 30;  // подготавливаем тестовые данные
        String expectedResult = "FizzBuzz";  // подготавливаем тестовые данные
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);  // вызываем продакшен код, который хотим протестировать
        if (realResult.equals(expectedResult)) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Fizz test = OK");
        } else {
            System.out.println("Fizz test = FAIL");
        }
    }
    public void delTestReturnNumber() {
        int number = 4;  // подготавливаем тестовые данные
        String expectedResult = "4";  // подготавливаем тестовые данные
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);  // вызываем продакшен код, который хотим протестировать
        if (realResult.equals(expectedResult)) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Fizz test = OK");
        } else {
            System.out.println("Fizz test = FAIL");
        }
    }
}
