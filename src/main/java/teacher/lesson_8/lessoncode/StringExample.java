package teacher.lesson_8.lessoncode;

import java.util.Locale;

public class StringExample {
    public static void main(String[] args) {

        char[] charArray = {'V','o','l','k','s','w','a','g','e','n'};
        String ourString = new String(charArray);
        System.out.println(ourString);

        String stringOne = "Ferrari";
        int stringLength = stringOne.length();
        System.out.println("stringLength length is: " + stringLength);

        System.out.println("String1" + "String2");
        System.out.println("String1".concat("AnotherString"));

        String ferrariUpperCase = stringOne.toUpperCase();
        String ferrariLowerCase = stringOne.toLowerCase();

        System.out.println();
        System.out.println(ferrariUpperCase);
        System.out.println(ferrariLowerCase);

        char myChar = stringOne.charAt(4);
        System.out.println(myChar);

        String newFerrari = stringOne.replace("r", "g");
        System.out.println("newFerrari value is: " + newFerrari);

        String stringWithSpaces = "  Username  ";
        String stringWithoutSpaces = stringWithSpaces.trim();
        System.out.println(stringWithSpaces);
        System.out.println(stringWithoutSpaces);

        String specialCode = "123-345-222-564";
        String[] specialCodeArray = specialCode.split("-");
        System.out.println(specialCodeArray[0]);
        System.out.println(specialCodeArray[1]);
        System.out.println(specialCodeArray[2]);
        System.out.println(specialCodeArray[3]);


        float myFloat = 3.14f;
        int myInt = 10;
        String myString = "MyText";
        System.out.printf("MyFloat value = %f, myInt value = %d and myString value = %s", myFloat, myInt, myString);
        System.out.println();
        System.out.printf("MyFloat value with two decimal places = %.2f", myFloat);

        String anotherString = "";
        System.out.println();
        System.out.println("anotherString is blank:" + anotherString.isBlank());
        System.out.println("anotherString is empty:" + anotherString.isEmpty());


        String s1 = "Google";
        String s2 = "GOOGLE";

        System.out.println("s1 is the same as s2: " + s1.equalsIgnoreCase(s2));
    }
}
