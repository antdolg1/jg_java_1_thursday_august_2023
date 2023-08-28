package students.julija_pilenkova.homework.lesson_3.level_5.Task_19;

class Dog {

    public String name;
    public int age;

    Dog (String dogName, int age) {

        this.name = dogName;
        this.age = age;
    }

    public void voice() {
        System.out.println(name + age);
    }
}
      class Dog_Demo {

         public static void main(String[] args) {
             Dog dog1 = new Dog("Jerry ",5);
             dog1.voice();

         }


     }

