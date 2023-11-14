package students.aleksandrs_kunicins.homework.lesson_9.level_2_intern;

class Car {

    private int releaseYear;

    public Car(int releaseYear) {
        this.releaseYear = releaseYear;
    }

}

class Porsche911 extends Car {

    private int topSpeed;

    // создайте конструктор
    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }
}

class Porsche911Demo {

    public static void main(String[] args) {
        // продемонстрируйте создание инстанции класса Porsche911
        Porsche911 myPorsche = new Porsche911(2023, 200);
    }

}