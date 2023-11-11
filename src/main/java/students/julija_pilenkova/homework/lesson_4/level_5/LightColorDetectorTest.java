package students.julija_pilenkova.homework.lesson_4.level_5;

class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetector lightColorDetector = new LightColorDetector();
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest(410);
        lightColorDetectorTest.blueTest(470);
        lightColorDetectorTest.greenTest(520);
        lightColorDetectorTest.orangeTest(610);
        lightColorDetectorTest.yellowTest(580);
        lightColorDetectorTest.redTest(700);
        lightColorDetectorTest.invisibleLightTest(222);

    }

    private void violetTest(int wavelegth) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelegth);
        if (result.equals("Violet")) {
            System.out.println("Violet Test is OK");
        } else {
            System.out.println("Violet test FAIL");
        }
    }

    void blueTest(int wavelegth) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelegth);
        if (result.equals("Blue")) {
            System.out.println("Blue test is OK");
        } else {
            System.out.println("Blue test FAIL");
        }

    }


    void greenTest(int wavelegth) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelegth);
        if (result.equals("Green")) {
            System.out.println("Green test is OK");
        } else {
            System.out.println("Green test FAIL");
        }
    }

    void yellowTest(int wavelegth) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelegth);
        if (result.equals("Yellow")) {
            System.out.println("Yellow test is OK");
        } else {
            System.out.println("Yellow test FAIL");
        }
    }

    void orangeTest(int wavelegth) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelegth);
        if (result.equals("Orange")) {
            System.out.println("Orange test is OK");
        } else {
            System.out.println("Orange test FAIL");
        }
    }

    void redTest(int wavelegth) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelegth);
        if (result.equals("Red")) {
            System.out.println("Red test is OK");
        } else {
            System.out.println("Red test FAIL");
        }
    }

    void invisibleLightTest(int wavelegth) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelegth);
        if (result.equals("Invisible light")) {
            System.out.println("Invisible light test is OK");
        } else {
            System.out.println("Invisible lught test FAIL");
        }
    }
}