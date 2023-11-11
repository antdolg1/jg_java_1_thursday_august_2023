package students.nikolajs_antonovs.lesson_3.level_7.task_29;

public class AirplaneDemo {

    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing", "passenger", 1000);
        airplane.sayYourBrand();
        airplane.sayYourType();
        airplane.sayYourSpeed();
        airplane.airplaneFlying();

    }
}
