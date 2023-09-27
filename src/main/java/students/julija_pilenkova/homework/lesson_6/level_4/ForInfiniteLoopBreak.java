package students.julija_pilenkova.homework.lesson_6.level_4;

public class ForInfiniteLoopBreak {
    public static void main(String[] args) {

        for (int i = 1; ; i++) {
            System.out.println(i);
            if(i == 23) {
                break;
            }
        }
    }
}

