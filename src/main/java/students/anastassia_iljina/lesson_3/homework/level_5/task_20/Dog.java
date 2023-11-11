package students.anastassia_iljina.lesson_3.homework.level_5.task_20;

class Dog {
    public String name;
    public int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void voice() {

        System.out.println(name);
    }

    public int getAge() {

        return age;
    }

    void happyBirthday() {
        System.out.println("Happy Birthday!");
        age++;
    }
}
