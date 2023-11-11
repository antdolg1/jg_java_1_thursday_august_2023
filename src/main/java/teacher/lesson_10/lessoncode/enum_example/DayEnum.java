package teacher.lesson_10.lessoncode.enum_example;

public enum DayEnum {
    MONDAY("Понедельник", 1),
    TUESDAY("Вторник", 2),
    WEDNESDAY("Среда", 3),
    THURSDAY("Четверг", 4),
    FRIDAY("Пятница", 5),
    SATURDAY("Суббота", 6),
    SUNDAY("Воскресенье", 7);

    private final String nameRus;
    private final int order;

    DayEnum(String nameRus, int order) {
        this.nameRus = nameRus;
        this.order = order;
    }

    public String getNameRus() {
        return nameRus;
    }

    public int getOrder() {
        return order;
    }
}
