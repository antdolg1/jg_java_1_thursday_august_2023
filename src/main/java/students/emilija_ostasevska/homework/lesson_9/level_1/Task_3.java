package students.emilija_ostasevska.homework.lesson_9.level_1;

class DefaultConstructorV3 {

    private String fullName;
    private int age;
    private boolean male;
    private Boolean female;

    public DefaultConstructorV3() {
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return male;
    }

    public Boolean getFemale() {
        return female;
    }
}

class DefaultConstructorV3Demo {

    public static void main(String[] args) {
        // Создаем объект класса DefaultConstructorV3 с использованием дефолтного конструктора
        DefaultConstructorV3 instance = new DefaultConstructorV3();

        // Выводим значения свойств объекта
        System.out.println("FullName: " + instance.getFullName());  // null
        System.out.println("Age: " + instance.getAge());            // 0
        System.out.println("Male: " + instance.isMale());            // false
        System.out.println("Female: " + instance.getFemale());        // null
    }
}
