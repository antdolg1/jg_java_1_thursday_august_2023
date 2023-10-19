package teacher.lesson_10.lessoncode.interface_example;

public interface MyInterface {

    void myMethod();

    default void methodA() {
        System.out.println("default method A");
        commonMethod();
    }

    default void methodB() {
        System.out.println("default method B");
        commonMethod();
    }

    private void commonMethod() {
        System.out.println("common logic running");
    }

}
