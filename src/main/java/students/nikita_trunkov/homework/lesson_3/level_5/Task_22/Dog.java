package students.nikita_trunkov.homework.lesson_3.level_5.Task_22;

 class Dog {
    String name;
    String color;
    int age;

    Dog (String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void voice () {
        System.out.println(name + color + age);
    }
    public String newColor;
    public void changeColor () {
        System.out.println (name + newColor + age);
    }
}