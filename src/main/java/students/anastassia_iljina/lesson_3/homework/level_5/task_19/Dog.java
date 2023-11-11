package students.anastassia_iljina.lesson_3.homework.level_5.task_19;

class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void voice() {
        System.out.println("Имя собаки: " + name);
        System.out.println("Возраст собаки: " + age);
    }
}
