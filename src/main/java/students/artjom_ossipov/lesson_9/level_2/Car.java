package students.artjom_ossipov.lesson_9.level_2;

class Car {
    private int releaseYear;
    public Car(int releaseYear) {
        this.releaseYear = releaseYear;
    }

}

class Porsche911 extends Car {
    private int topSpeed;
    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }
}

class Porsche911Demo {
    public static void main(String[] args) {
        Porsche911 myPorsche = new Porsche911(2023, 200);
    }

}
