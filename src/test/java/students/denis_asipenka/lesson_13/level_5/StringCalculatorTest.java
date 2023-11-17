package students.denis_asipenka.lesson_13.level_5;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void weExpect10() {
        int actualResult = stringCalculator.add("5,5");
        assertEquals(10, actualResult);
    }

    @Test
    public void weExpect3() {
        int actualResult = stringCalculator.add("0,3");
        assertEquals(3, actualResult);
    }

    @Test
    public void weExpectZero() {
        int actualResult = stringCalculator.add("0,0");
        assertEquals(0, actualResult);
    }

    @Test
    public void weExpect8() {
        int actualResult = stringCalculator.add(",8");
        assertEquals(8, actualResult);
    }

    @Test
    public void weExpectBigInteger() {
        int actualResult = stringCalculator.add("123456789,1");
        assertEquals(123456790, actualResult);
    }

    @Test
    public void weExpect0() {
        int actualResult = stringCalculator.add(",,,,,,,,,,,");
        assertEquals(0, actualResult);
    }

    @Test
    public void weExpect9() {
        int actualResult = stringCalculator.add("9,");
        assertEquals(9, actualResult);
    }

    @Test
    public void weExpect13() {
        int actualResult = stringCalculator.add(",1,1,1,1,1,1,,1,1,1,1,1,2,");
        assertEquals(13, actualResult);
    }

    @Test
    public void weExpect28() {
        int actualResult = stringCalculator.add("1\n23,4");
        assertEquals(28, actualResult);
    }

    @Test
    public void weExpect226() {
        int actualResult = stringCalculator.add("\n223,3");
        assertEquals(226, actualResult);
    }

    @Test
    public void weExpect5() {
        int actualResult = stringCalculator.add("123,4\n");
        assertEquals(127, actualResult);
    }

    @Test
    public void weExpectOne() {
        int actualResult = stringCalculator.add("1\n");
        assertEquals(1, actualResult);
    }

    @Test
    public void weAreWaitingForTheIndexFromWhichWeStartCountingNumbers() {
        int actualResult = stringCalculator.searchIndex("//[;]\n1;2");
        assertEquals(6, actualResult);
    }

    @Test
    public void newSeparatorExpected() {
        List<Character> expectedList = new ArrayList<>();
        List<Character> actualResult;
        expectedList.add(';');
        actualResult = stringCalculator.checkingIfThereIsADelimiter("//[;]\n1;2");
        Assert.assertEquals(expectedList, actualResult);
    }

    @Test
    public void newTwoSeparatorExpected() {
        List<Character> expectedList = new ArrayList<>();
        List<Character> actualResult;
        expectedList.add(';');
        expectedList.add('&');
        actualResult = stringCalculator.checkingIfThereIsADelimiter("//[;][&]\n1;2");
        Assert.assertEquals(expectedList, actualResult);
    }

    @Test
    public void newThreeSeparatorExpected() {
        List<Character> expectedList = new ArrayList<>();
        List<Character> actualResult;
        expectedList.add(';');
        expectedList.add('&');
        expectedList.add(',');
        actualResult = stringCalculator.checkingIfThereIsADelimiter("//[;][&][,]\n1;2");
        Assert.assertEquals(expectedList, actualResult);
    }

    @Test
    public void newThreeSeparatorExpectedV1() {
        List<Character> expectedList = new ArrayList<>();
        List<Character> actualResult;
        expectedList.add(',');
        expectedList.add('&');
        expectedList.add('*');
        actualResult = stringCalculator.checkingIfThereIsADelimiter("//[,][&][*]\n1;2");
        Assert.assertEquals(expectedList, actualResult);
    }

    @Test
    public void newSeparatorExpectedLateralLine() {
        List<Character> expectedList = new ArrayList<>();
        List<Character> actualResult;
        expectedList.add('/');
        actualResult = stringCalculator.checkingIfThereIsADelimiter("//[/]\n1;2");
        Assert.assertEquals(expectedList, actualResult);
    }

    @Test
    public void expectNewDivideVerticalBar() {
        List<Character> expectedList = new ArrayList<>();
        List<Character> actualResult;
        expectedList.add('|');
        actualResult = stringCalculator.checkingIfThereIsADelimiter("//[|]\n1;2");
        Assert.assertEquals(expectedList, actualResult);
    }

    @Test
    public void weExpectThree() {
        int actualResult = stringCalculator.add("//[;]\n8;2");
        assertEquals(10, actualResult);
    }

    @Test
    public void weExpect290() {
        int actualResult = stringCalculator.add("//[;]\n1;288;1");
        assertEquals(290, actualResult);
    }

    @Test
    public void weExpect9186() {
        int actualResult = stringCalculator.add("//[;]\n1;288;1;8888;0;;8");
        assertEquals(9186, actualResult);
    }

    @Test
    public void weExpect3DifferentSeparatorsAndASumOf333() {
        int actualResult = stringCalculator.add("//[;][,][&]\n100;100,100&30&0;;3");
        assertEquals(333, actualResult);
    }

    @Test
    public void weExpect2DifferentSeparatorsAndASumOf6() {
        int actualResult = stringCalculator.add("//[;][&]\n1;2&3");
        assertEquals(6, actualResult);
    }
}