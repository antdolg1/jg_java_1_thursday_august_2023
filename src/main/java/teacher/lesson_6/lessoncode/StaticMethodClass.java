package teacher.lesson_6.lessoncode;

public class StaticMethodClass {

    int nonStaticVariable = 1;
    static int staticVariable = 3;

    public void nonStaticMethod() {
        System.out.println("I am non static method");
    }

    static void staticMethod(int localVariable) {
        System.out.println("localVariable = " + localVariable);
        System.out.println("staticVariable = " + staticVariable);
        //Мы не может обращаться к нестатической переменной из статитческого контекста
//        System.out.println("nonStaticVariable = " + nonStaticVariable);
    }

    public static void main(String[] args) {

        staticMethod(22);
        //Мы не может обращаться к нестатическому методу из статитческого контекста
//        nonStaticMethod();
        StaticMethodClass staticMethodClass = new StaticMethodClass();
        staticMethodClass.staticMethod(20);
        staticMethodClass.nonStaticMethod();
    }

}
