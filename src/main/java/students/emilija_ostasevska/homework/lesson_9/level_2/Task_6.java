package students.emilija_ostasevska.homework.lesson_9.level_2;

class Car {
    private int releaseYear;

    public Car(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}

class Porsche911 extends Car {
    private int topSpeed;

    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear); // вызов конструктора родительского класса
        this.topSpeed = topSpeed;
    }
}

class Porsche911Demo {
    public static void main(String[] args) {
        Porsche911 porsche = new Porsche911(2023, 200);
        
        // Теперь у нас есть инстанция класса Porsche911 с указанным годом выпуска и максимальной скоростью
    }
}

