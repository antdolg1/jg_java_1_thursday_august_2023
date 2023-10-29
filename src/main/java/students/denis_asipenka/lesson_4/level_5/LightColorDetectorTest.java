package students.denis_asipenka.lesson_4.level_5;


public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleLightTest();
    }

    public void violetTest() {
        int firstNumber = 380;  // подготавливаем тестовые данные
        String expectedResult = "Violet";  // подготавливаем тестовые данные
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(firstNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");
        }
    }

    public void blueTest() {
        int firstNumber = 451;  // подготавливаем тестовые данные
        String expectedResult = "Blue";  // подготавливаем тестовые данные
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(firstNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");
        }
    }

    public void greenTest() {
        int firstNumber = 496;  // подготавливаем тестовые данные
        String expectedResult = "Green";  // подготавливаем тестовые данные
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(firstNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");
        }
    }

    public void yellowTest() {
        int firstNumber = 571;  // подготавливаем тестовые данные
        String expectedResult = "Yellow";  // подготавливаем тестовые данные
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(firstNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }

    public void orangeTest() {
        int firstNumber = 619;  // подготавливаем тестовые данные
        String expectedResult = "Orange";  // подготавливаем тестовые данные
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(firstNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }

    public void redTest() {
        int firstNumber = 745;  // подготавливаем тестовые данные
        String expectedResult = "Red";  // подготавливаем тестовые данные
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(firstNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");
        }
    }

    public void invisibleLightTest() {
        int firstNumber = -556;  // подготавливаем тестовые данные
        String expectedResult = "Invisible Light";  // подготавливаем тестовые данные
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(firstNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Invisible Light test = OK");
        } else {
            System.out.println("Invisible Light test = FAIL");
        }
    }
}
