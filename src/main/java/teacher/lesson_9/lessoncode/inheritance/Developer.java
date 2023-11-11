package teacher.lesson_9.lessoncode.inheritance;

public class Developer extends Employee {
    int bonus = 1000;

    public static void main(String[] args) {
        Developer dev = new Developer();
        System.out.println("Developer salary is: " + dev.salary);
        System.out.println("Bonus of Developer is: " + dev.bonus);
//        System.out.println("Developer tax rate is: " + dev.taxRate); will not work because private fields are not inherited

        Employee employee = new Employee();
        System.out.println("Employee salary is: " + employee.salary);
//        System.out.println("Bonus of employee is: " + employee.bonus); will not work because Employee doesn't have such a field
    }
}
