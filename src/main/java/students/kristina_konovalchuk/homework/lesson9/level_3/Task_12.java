package students.kristina_konovalchuk.homework.lesson9.level_3;

public class Task_12 {
    abstract class Flower {
        private String color;

        public Flower(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public abstract void bloom();
    }

    abstract class Rose extends Flower {
        public Rose(String color) {
            super( color );
        }

        public void bloom() {
            System.out.println( "The rose is blooming " );
        }
    }

    abstract class Lily extends Flower {
        public Lily(String color) {
            super( color );
        }

        public void bloom() {
            System.out.println( "The lily is blooming" );
        }

    }
}
