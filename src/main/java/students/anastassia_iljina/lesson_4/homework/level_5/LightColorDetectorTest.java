package students.anastassia_iljina.lesson_4.homework.level_5;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetColorTest();
        lightColorDetectorTest.blueColorTest();
        lightColorDetectorTest.greenColorTest();
        lightColorDetectorTest.yellowColorTest();
        lightColorDetectorTest.orangeColorTest();
        lightColorDetectorTest.redColorTest();
        lightColorDetectorTest.ColorTest();

    }

    public void violetColorTest() {
        int wavelenght = 399;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (expectedResult.equals(realResult)) {
            System.out.println(expectedResult);
        } else {
            System.out.println("FAIL");
        }

    }

    public void blueColorTest() {
        int wavelenght = 450;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (expectedResult.equals(realResult)) {
            System.out.println(expectedResult);
        } else {
            System.out.println("FAIL");
        }
    }

    public void greenColorTest() {
        int wavelenght = 496;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (expectedResult.equals(realResult)) {
            System.out.println(expectedResult);
        } else {
            System.out.println("FAIL");
        }
    }

    public void yellowColorTest() {
        int wavelenght = 589;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (expectedResult.equals(realResult)) {
            System.out.println(expectedResult);
        } else {
            System.out.println("FAIL");
        }
    }

    public void orangeColorTest() {
        int wavelenght = 607;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (expectedResult.equals(realResult)) {
            System.out.println(expectedResult);
        } else {
            System.out.println("FAIL");
        }
    }

    public void redColorTest() {
        int wavelenght = 655;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (expectedResult.equals(realResult)) {
            System.out.println(expectedResult);
        } else {
            System.out.println("FAIL");
        }
    }

    public void ColorTest() {
        int wavelenght = 803;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (expectedResult.equals(realResult)) {
            System.out.println(expectedResult);
        } else {
            System.out.println("FAIL");
        }
    }
}
