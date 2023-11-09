package teacher.lesson_13.lessoncode;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CustomerTest {

    private Customer customer1;
    private Customer customer2;
    private Customer customer3;

    @Before
    public void initialize() {
        customer1 = new Customer("john.doe@mail.com", 20, Gender.MALE);
        customer2 = new Customer("sarah.doe@mail.com", 18, Gender.FEMALE);
        customer3= new Customer("jack.russel@mail.com", 30, Gender.MALE);
    }

    @Test
    public void getAllCustomersFromMap() {
        List<Customer> actualCustomerList = Customer.getAllCustomersFromMap();
        List<Customer> expectedCustomerList = new ArrayList<>();
        expectedCustomerList.add(customer1);
        expectedCustomerList.add(customer2);
        expectedCustomerList.add(customer3);

        assertEquals(expectedCustomerList, actualCustomerList);
    }

    @Test
    public void getAllCustomersFromMapNotNull() {
        List<Customer> actualCustomerList = Customer.getAllCustomersFromMap();
        assertNotNull(actualCustomerList);
    }

    @Test
    public void getAllMaleCustomersFromMap() {
        List<Customer> actualCustomerList = Customer.getAllCustomersFromMap(Gender.MALE);
        List<Customer> expectedCustomerList = new ArrayList<>();
        expectedCustomerList.add(customer1);
        expectedCustomerList.add(customer3);

        assertEquals(expectedCustomerList, actualCustomerList);
    }

    @Test
    public void getAllMaleCustomersFromMapNotNull() {
        List<Customer> actualCustomerList = Customer.getAllCustomersFromMap(Gender.MALE);
        assertNotNull(actualCustomerList);
    }

    @Test
    public void getAllFemaleCustomersFromMap() {
        List<Customer> actualCustomerList = Customer.getAllCustomersFromMap(Gender.FEMALE);
        List<Customer> expectedCustomerList = new ArrayList<>();
        expectedCustomerList.add(customer2);

        assertEquals(expectedCustomerList, actualCustomerList);
    }

    @Test
    public void getAllFemaleCustomersFromMapNotNull() {
        List<Customer> actualCustomerList = Customer.getAllCustomersFromMap(Gender.FEMALE);
        assertNotNull(actualCustomerList);
    }

    @Test
    public void getTotalCustomerAmount() {
        int actualCustomerAmount = Customer.getTotalCustomerAmount();
        int expectedCustomerAmount = 3;
        assertEquals(actualCustomerAmount, expectedCustomerAmount);
    }

    @Test
    public void getTotalMaleCustomerAmount() {
        int actualCustomerAmount = Customer.getTotalCustomerAmount(Gender.MALE);
        int expectedCustomerAmount = 2;
        assertEquals(actualCustomerAmount, expectedCustomerAmount);
    }

    @Test
    public void getTotalFemaleCustomerAmount() {
        int actualCustomerAmount = Customer.getTotalCustomerAmount(Gender.FEMALE);
        int expectedCustomerAmount = 1;
        assertEquals(actualCustomerAmount, expectedCustomerAmount);
    }

    @Ignore
    public void getAllCustomersAge() {
        int actualTotalAge = Customer.getAllCustomersAge();
        int expectedTotalAge = 68;
        assertEquals(actualTotalAge, expectedTotalAge);
    }

    @Test
    public void getAllMaleCustomersAge() {
        int actualTotalAge = Customer.getAllCustomersAge(Gender.MALE);
        int expectedTotalAge = 50;
        assertEquals(actualTotalAge, expectedTotalAge);
    }

    @Test
    public void getAllFemaleCustomersAge() {
        int actualTotalAge = Customer.getAllCustomersAge(Gender.FEMALE);
        int expectedTotalAge = 18;
        assertEquals(actualTotalAge, expectedTotalAge);
    }
}