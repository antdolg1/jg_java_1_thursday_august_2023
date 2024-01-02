package students.aleksandrs_kunicins.homework.lesson_6.level_7_senior;

// Разберитесь, что делает класс указанный ниже.
// Создайте класс FizzBuzzTest и напишите автоматические тесты
// на все сценарии. Упростите FizzBuzz класс!
// Убедитесь, что после упрощения все автоматические тесты проходят.

// Подсказка: а нужно ли свойство класса initialNumber?
// Или метод detect можно реализовать без него?

class FizzBuzz {

    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0))
            return "FizzBuzz";
        else if (number % 3 == 0)
            return "Fizz";
        else if (number % 5 == 0)
            return "Buzz";
        else
            return "" + number;
    }

}

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.sholdWriteFizbuzz();
        test.shouldWriteFizz();
        test.shouldWriteBuzz();
    }

    public void sholdWriteFizbuzz() {
        FizzBuzz fb = new FizzBuzz();
        int number = 15;
        String expected_result = "FizzBuzz";
        if (expected_result == fb.detect(number)) {
            System.out.println("Fizzbuzz test : OK!");
        } else {
            System.out.println("FizzBuzz test: EROOR!");
        }

    }

    public void shouldWriteFizz() {
        FizzBuzz fb = new FizzBuzz();
        int number = 9;
        String result = "Fizz";
        if (result == fb.detect(number)) {
            System.out.println("Fizz test : OK!");
        } else {
            System.out.println("Fizz test : ERROR!");
        }
    }

    public void shouldWriteBuzz() {
        FizzBuzz fb = new FizzBuzz();
        int number = 10;
        String result = "Buzz";
        if (result == fb.detect(number)) {
            System.out.println("Buzz test : OK!");
        } else {
            System.out.println("Buzz test : ERROR!");
        }
    }
}