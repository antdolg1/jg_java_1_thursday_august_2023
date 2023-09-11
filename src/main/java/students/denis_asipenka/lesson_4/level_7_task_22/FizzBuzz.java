package students.denis_asipenka.lesson_4.level_7_task_22;

public class FizzBuzz {
    public String detect(int number) {
        // Реализуйте следующие требования:
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else return ("" +  number);
    }

    // - если переданное число делится на три возвращайте "Fizz"
    // - если переданное число делится на пять возвращайте "Buzz"
    // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
    // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)
}

