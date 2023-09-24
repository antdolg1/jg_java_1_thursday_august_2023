package students.aleksandrs_kunicins.homework.lesson_6.level_4_junior;

import java.util.Random;

class TwoDimensionalArray {


    public void massive(){
    Random rand = new Random();
    int randomNumber,sumOfNumber = 0;
    int[][] twoDimensionalArray = new int[2][2];
    for (int i = 0;i<2;i++){
        randomNumber = rand.nextInt();
        twoDimensionalArray[i][i] = randomNumber;
        sumOfNumber += randomNumber;
    }
    System.out.println(sumOfNumber);
    }


}
class TwoDimensionalArrayDemo{
    public static void main(String[] args) {
        TwoDimensionalArray twoDimAr = new TwoDimensionalArray();
        twoDimAr.massive();
    }

    
}