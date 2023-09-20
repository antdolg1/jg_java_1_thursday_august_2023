package students.julija_pilenkova.homework.lesson_6.level_4;

public class ForLoopContinue {
    public static void main(String[] args) {

        for ( int i = 1; i > 0 ; i++) {
            if(i % 2 == 0) {
                continue;
            } System.out.println(i);
        }

    }
}
