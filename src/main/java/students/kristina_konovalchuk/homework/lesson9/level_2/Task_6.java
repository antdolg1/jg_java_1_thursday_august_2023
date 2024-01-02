package students.kristina_konovalchuk.homework.lesson9.level_2;

public class Task_6 {
    class Car {
        private int releaseYear;

        public Car(int releaseYear) {
            this.releaseYear = releaseYear;
        }
    }

    class Porsche911 extends Car {
        private int topSpeed;

        public Porsche911(int topSpeed, int releaseYear) {
            super( releaseYear );
            this.topSpeed = topSpeed;
        }
    }

    class Porsche911Demo {
        public void main(String[] args) {
            Porsche911 porsche911 = new Porsche911( 220, 2023 );
        }
    }
}
