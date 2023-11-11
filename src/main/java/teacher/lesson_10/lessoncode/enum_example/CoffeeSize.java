package teacher.lesson_10.lessoncode.enum_example;

public enum CoffeeSize {
    SMALL(8),
    MEDIUM(12),
    LARGE(16);

    private final int ounces;

    CoffeeSize(int ounces) {
        this.ounces = ounces;
    }

    public int getOunces() {
        return ounces;
    }
}
