package students.anastassia_iljina.lesson_3.homework.level_5.task_21;

class Dog {
    public String name;
    public int age;
    public String color;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "Black";
    }

    public void voice() {

        System.out.println(name);
        System.out.println(age);
        System.out.println(color);
    }

    public int getAge() {

        return age;
    }
}
