package students.nikolajs_antonovs.lesson_4.level_5;

class LightColorDetectorTest {
    public static void main(String[] args) {

        LightColorDetectorTest test = new LightColorDetectorTest();
        test.violetTest();
        test.blueTest();
        test.greenTest();
        test.yellowTest();
        test.orangeTest();
        test.redTest();
        test.invisibleTest();
    }

    void violetTest() {
        LightColorDetector detector = new LightColorDetector();
        String expectedColor = "Violet";
        String realColor = detector.detect(444);
        String result = (realColor == expectedColor) ? "Violet color test OK" : "Violet color test FAILED";
        System.out.println(result);
    }

    void blueTest() {
        LightColorDetector detector = new LightColorDetector();
        String expectedColor = "Blue";
        String realColor = detector.detect(454);
        String result = (realColor == expectedColor) ? "Blue color test OK" : "Blue color test FAILED";
        System.out.println(result);
    }

    void greenTest() {
        LightColorDetector detector = new LightColorDetector();
        String expectedColor = "Green";
        String realColor = detector.detect(555);
        String result = (realColor == expectedColor) ? "Green color test OK" : "Green color test FAILED";
        System.out.println(result);
    }

    void yellowTest() {
        LightColorDetector detector = new LightColorDetector();
        String expectedColor = "Yellow";
        String realColor = detector.detect(580);
        String result = (realColor == expectedColor) ? "Yellow color test OK" : "Yellow color test FAILED";
        System.out.println(result);
    }

    void orangeTest() {
        LightColorDetector detector = new LightColorDetector();
        String expectedColor = "Orange";
        String realColor = detector.detect(606);
        String result = (realColor == expectedColor) ? "Orange color test OK" : "Orange color test FAILED";
        System.out.println(result);
    }

    void redTest() {
        LightColorDetector detector = new LightColorDetector();
        String expectedColor = "Red";
        String realColor = detector.detect(666);
        String result = (realColor == expectedColor) ? "Red color test OK" : "Red color test FAILED";
        System.out.println(result);
    }

    void invisibleTest() {
        LightColorDetector detector = new LightColorDetector();
        String expectedColor = "Invisible Light";
        String realColor = detector.detect(1);
        String result = (realColor == expectedColor) ? "Invisible Light test OK" : "Invisible Light test FAILED";
        System.out.println(result);
    }
}



