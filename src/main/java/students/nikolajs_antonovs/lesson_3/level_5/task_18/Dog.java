package students.nikolajs_antonovs.lesson_3.level_5.task_18;

public class Dog {

    String name;

    Dog(String dogName, int age){
        this.name = dogName;
    }
    void sayName(){
        System.out.println("Dog name is " + name);
    }
    void voice(){
        System.out.println("Woof");
    }
    public Dog(){

    }
}
