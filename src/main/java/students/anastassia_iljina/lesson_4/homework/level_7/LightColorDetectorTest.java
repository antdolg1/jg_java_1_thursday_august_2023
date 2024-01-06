package students.anastassia_iljina.lesson_4.homework.level_7;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest test = new LightColorDetectorTest();
        test.testColorResult("Violet", 405);
        test.testColorResult("Blue", 475);
        test.testColorResult("Green", 557);
        test.testColorResult("Yellow", 572);
        test.testColorResult("Orange", 600);
        test.testColorResult("Red", 745);
        test.testColorResult("Invisible Light", 788);

    }

    LightColorDetector lightColorDetector = new LightColorDetector();

    public void testColorResult(String expectedColor, int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        if (result.equals(expectedColor)) {
            System.out.println("LightColorDetector test = " + expectedColor);
        } else {
            System.out.println("LightColorDetector test = " + expectedColor);
        }

    }
}
