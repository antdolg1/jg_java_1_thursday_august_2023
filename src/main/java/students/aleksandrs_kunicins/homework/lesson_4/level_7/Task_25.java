package students.aleksandrs_kunicins.homework.lesson_4.level_7;


class LightColorDetector {

        public String detect(int wavelength) {

            if (wavelength >= 380 && wavelength <= 449) {
                return "Violet";
            } else if (wavelength >= 450 && wavelength <= 494) {
                return "Blue";
            } else if (wavelength >= 495 && wavelength <= 569) {
                return "Green";
            } else if (wavelength >= 570 && wavelength <= 589) {
                return "Yellow";
            } else if (wavelength >= 590 && wavelength <= 619) {
                return "Orange";
            } else if (wavelength >= 620 && wavelength <= 750) {
                return "Red";
            } else {
                return "Invisible Light";
            }
        }
}
class LightColorDetectorTest {

     LightColorDetector lightColorDetector = new LightColorDetector();

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        lightColorDetectorTest.testColor("Violet", 405);
        lightColorDetectorTest.testColor("Blue", 475);
        lightColorDetectorTest.testColor("Green", 505);
        lightColorDetectorTest.testColor("Yellow", 585);
        lightColorDetectorTest.testColor("Orange", 619);
        lightColorDetectorTest.testColor("Red", 620);
        lightColorDetectorTest.testColor("Invisible Light", 760);
    }

    public void testColor(String expected, int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        if (result.equals(expected)) {
            System.out.println("LightColorDetector test - " + expected + " = OK");
        } else {
            System.out.println("LightColorDetector test - " + expected + " = FAIL");
        }
    }
}

