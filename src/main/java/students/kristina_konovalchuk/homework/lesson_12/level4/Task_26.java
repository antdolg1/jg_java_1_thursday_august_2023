package students.kristina_konovalchuk.homework.lesson_12.level4;

public class Task_26 {
    public class StackOverflowErrorDemo {
        public static void main(String[] args) {
            recursiveMethod( );
        }

        public static void recursiveMethod() {
            recursiveMethod( );
        }
    }
}
