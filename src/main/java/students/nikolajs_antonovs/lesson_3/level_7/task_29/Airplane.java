package students.nikolajs_antonovs.lesson_3.level_7.task_29;

public class Airplane {
    String brand;
    String type;
    int speed;

    Airplane(String airplaneBrand, String airplaneType, int airplaneSpeed) {
        this.brand = airplaneBrand;
        this.type = airplaneType;
        this.speed = airplaneSpeed;
    }

    void airplaneFlying() {
        System.out.println("I'm airplane and i'm flying!");
    }

    void sayYourBrand() {
        System.out.println("Airplane brand is " + brand);
    }

    void sayYourType() {
        System.out.println("Airplane type is " + type);
    }

    void sayYourSpeed() {
        System.out.println("Airplane max speed is " + speed);
    }

}
