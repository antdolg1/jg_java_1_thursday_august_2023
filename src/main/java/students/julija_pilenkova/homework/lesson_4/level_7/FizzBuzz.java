package students.julija_pilenkova.homework.lesson_4.level_7;

class FizzBuzz {

    String detect(int number) {
        if (devidedBy3(number) && devidedBy5(number)) {
            return "FizzBuzz";
        }
        if (devidedBy5(number)) {
            return "Buzz";
        }
        if (devidedBy3(number)) {
            return "Fizz";
        }
        return "" + number;

    }


    boolean devidedBy3(int number) {
        return number % 3 == 0;
    }

    boolean devidedBy5(int number) {
        return number % 5 == 0;
    }

}
