package students.nikolajs_antonovs.lesson_3.level_5.task_19;

 class Dog {
    String name;
    int age;

    Dog(String dogName, int dogAge) {
        this.name = dogName;
        this.age = dogAge;
    }

    void sayName(){
        System.out.println("Dog name is " + name);
    }

    void age() {
        System.out.println("Dog age is " + age);
    }

    void voice() {
        System.out.println("Woof");
    }

//    public Dog() {
//    }
}
