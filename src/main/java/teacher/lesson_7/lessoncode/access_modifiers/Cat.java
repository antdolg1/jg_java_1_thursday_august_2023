package teacher.lesson_7.lessoncode.access_modifiers;

public class Cat {

    private int age;
    private String nickname;

    public Cat(int age, String nickname) {
        this.age = age;
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Cat's age cannot be negative");
        } else if (age > 20) {
            System.out.println("Cat's usually don't live longer than 20 years, please check your input data!");
        } else {
            this.age = age;
        }
    }

    public void setNickname(String newNickname) {
        this.nickname = newNickname;
    }
}
