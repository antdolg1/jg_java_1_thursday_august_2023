package students.aleksandrs_kunicins.homework.lesson_9.level_1_intern;

public class DefaultConstructorV3 {

    private String fullName = "Alex";
    private int age = 9;
    private boolean male = true;
    private Boolean female = false;

    // создайте get() методы для каждого свойства
    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public boolean getMale() {
        return male;
    }

    public boolean getFemale() {
        return female;
    }

}

class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 dc = new DefaultConstructorV3();
        System.out.println("Full name " + dc.getFullName());
        System.out.println("Full age " + dc.getAge());
        System.out.println("Male " + dc.getMale());
        System.out.println("Female " + dc.getFemale());
    }
}