package students.denis_asipenka.lesson_7.level_6;

import java.util.Arrays;

public class ArrayCopy {
    public int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        return Arrays.copyOfRange(in, numberFrom, numberTo + 1);
    }
}