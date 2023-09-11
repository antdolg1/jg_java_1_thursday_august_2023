package students.denis_asipenka.lesson_4.level_7_task_23;


public class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.leapyear();
        leapYearTest.nonLeapYear();

    }

    public void leapyear() {
        int number = 1936;  // подготавливаем тестовые данные
        boolean expectedResult = true;  // подготавливаем тестовые данные
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(number);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Leapyear test = OK");
        } else {
            System.out.println("Leapyear test = FAIL");
        }
    }

    public void nonLeapYear() {
        int number = 1903;  // подготавливаем тестовые данные
        boolean expectedResult = false;  // подготавливаем тестовые данные
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(number);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Leapyear test = OK");
        } else {
            System.out.println("Leapyear test = FAIL");
        }
    }
}

