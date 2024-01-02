package students.nikita_trunkov.homework.lesson_3.level_5.Task_20;

 class Dog {
    String name;
    int age;
    Dog (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayName(){
        System.out.println (name);
    }
    public void sayAge() {
        System.out.println (age);
    }
    public void happyBirthday () {
        System.out.println (age + 1);
    }
}
