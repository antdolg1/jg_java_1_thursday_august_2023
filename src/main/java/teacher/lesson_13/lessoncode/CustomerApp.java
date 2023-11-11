package teacher.lesson_13.lessoncode;

public class CustomerApp {

    public static void main(String[] args) {

        new Customer("john.doe@mail.com", 20, Gender.MALE);
        new Customer("sarah.doe@mail.com", 18, Gender.FEMALE);
        new Customer("jack.russel@mail.com", 30, Gender.MALE);

        System.out.println("All customers:");
        Customer.getAllCustomersFromMap().forEach(System.out::println);
        System.out.println();
        System.out.println("All MALE customers:");
        Customer.getAllCustomersFromMap(Gender.MALE).forEach(System.out::println);
        System.out.println();
        System.out.println("All FEMALE customers:");
        Customer.getAllCustomersFromMap(Gender.FEMALE).forEach(System.out::println);
        System.out.println();
        System.out.println("Total customer mount: " + Customer.getTotalCustomerAmount());
        System.out.println("Total MALE customer mount: " + Customer.getTotalCustomerAmount(Gender.MALE));
        System.out.println("Total FEMALE customer mount: " + Customer.getTotalCustomerAmount(Gender.FEMALE));
        System.out.println();
        System.out.println("Total age: " + Customer.getAllCustomersAge());
        System.out.println("Total MALE age: " + Customer.getAllCustomersAge(Gender.MALE));
        System.out.println("Total FEMALE age: " + Customer.getAllCustomersAge(Gender.FEMALE));
    }

}
