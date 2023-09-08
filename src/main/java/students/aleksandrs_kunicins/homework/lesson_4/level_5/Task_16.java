package students.aleksandrs_kunicins.homework.lesson_4.level_5;

class LightColorDetector {
    public String detect(int wavelength){
        if (wavelength >= 380 && wavelength <= 449){
            return "Violet";
        }else if (wavelength >=450 && wavelength <= 494){
            return "Blue";
        }else if(wavelength >=495 && wavelength <=569){
            return "Green";
        }else if(wavelength >=570 && wavelength <= 589){
            return "Yellow";
        }else if(wavelength>=590 && wavelength <= 619){
            return "Orange";
        }else if (wavelength >=620 && wavelength <=750){
            return "Red";
        }else{
            return "Invisible light";
        }


    }
}
class LightColorDetectorTest{
    public static void main(String[] args) {
    LightColorDetector light = new LightColorDetector();
    int firstNumber = 400;
    int secondNumberNumber = 470;
    int thirdNumber = 495;
    int fourthNumber = 580;
    int fifthNumber = 600;
    int sixthNumber = 630;
    int seventhNumber = 0;

    String resultFirst = light.detect(firstNumber);
    String resultSecond = light.detect(secondNumberNumber);
    String resultThird = light.detect(thirdNumber);
    String resultFourth = light.detect(fourthNumber);
    String resultFifth = light.detect(fifthNumber);
    String resultSixth = light.detect(sixthNumber);
    String resultSeventh = light.detect(seventhNumber);

    String expectedFirst = "Violet";
    String expectedSecond = "Blue";
    String expectedThird = "Green";
    String expectedFourth = "Yellow";
    String expectedFifth = "Orange";
    String expectedSixth = "Red";
    String expectedSeventh = "Invisible light";


    if (resultFirst == expectedFirst){
        System.out.println("Passed");
    }else{
        System.out.println("Fail");
    }
    if (resultSecond == expectedSecond){
        System.out.println("Passed");
    }else{
        System.out.println("Fail");
    }
    if (resultThird == expectedThird){
        System.out.println("Passed");
    }else{
        System.out.println("Fail");
    }
    if(resultFourth == expectedFourth){
        System.out.println("Passed");
    }else{
        System.out.println("Fail");
    }if (resultFifth ==expectedFifth){
        System.out.println("Passed");
    }else{
        System.out.println("Fail");
    }if (resultSixth == expectedSixth){
        System.out.println("Passed");
    }else{
        System.out.println("Fail");
    }
    if (resultSeventh == expectedSeventh){
        System.out.println("Passed");
    }else{
        System.out.println("Fail");
    }
    }

}


