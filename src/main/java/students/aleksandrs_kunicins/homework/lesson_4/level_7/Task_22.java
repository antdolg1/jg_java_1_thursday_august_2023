package students.aleksandrs_kunicins.homework.lesson_4.level_7;

class FizzBuzz {
    public String detect(int number){
        if (number%3==0 && number%5==0){
            return "FizzBuzz";
        }else if(number%5==0){
            return "Buzz";
        }else if (number%3==0 ){
            return "Fizz";
        }else{
            String rez = "" + number;
            return rez;
        }
    }
}

class FizBuzzTest{

    public static void main(String[] args) {
        int testNum1 =9;
        int testNum2 = 10;
        int testNum3 = 15;
        int testNum4 = 19; 

        String expectedFirst = "Fizz";
        String expectedSecond = "Buzz";
        String expectedThird = "FizzBuzz";
        String expectedFourth = "" + testNum4;


        FizzBuzz fb = new FizzBuzz();

        String firstAnsw = fb.detect(testNum1);
        String secondAnsw = fb.detect(testNum2);
        String thirdAnsw = fb.detect(testNum3);
        String fourthAnsw = fb.detect(testNum4);

        if (expectedFirst == firstAnsw){
        System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        if (expectedSecond == secondAnsw){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        if (expectedThird == thirdAnsw){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        if (expectedFourth.equals(fourthAnsw)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}