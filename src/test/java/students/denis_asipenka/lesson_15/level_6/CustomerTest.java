package students.denis_asipenka.lesson_15.level_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Movie prince = new Movie("Prince", Movie.CHILDRENS);
    Movie casper = new Movie("Casper", Movie.CHILDRENS);
    Movie hitch = new Movie("Hitch", Movie.REGULAR);
    Movie spy = new Movie("Spy", Movie.NEW_RELEASE);

    @Test
    public void weExpectTheCostToBe5And1Point() {
        Rental rental = new Rental(hitch, 4);
        Customer customer = new Customer("Ivan");
        customer.addRental(rental);
        String actualResult = customer.statement();
        String result = "Rental Record for Ivan\nHitch 5.0\nYou owed 5.0\nYou earned 1 frequent renter points\n";
        assertEquals(result, actualResult);
    }

    @Test
    public void weExpectTheCostToBe60And2Point() {
        Rental rental = new Rental(spy, 20);
        Customer customer = new Customer("Petr");
        customer.addRental(rental);
        String actualResult = customer.statement();
        String result = "Rental Record for Petr\nSpy 60.0\nYou owed 60.0\nYou earned 2 frequent renter points\n";
        assertEquals(result, actualResult);
    }

    @Test
    public void weExpectTheCostToBe69And2Point() {
        Rental rental = new Rental(casper, 5);
        Rental rental1 = new Rental(prince, 5);
        Rental rental2 = new Rental(spy, 20);
        Customer customer = new Customer("Kirill");
        customer.addRental(rental);
        customer.addRental(rental1);
        customer.addRental(rental2);
        String actualResult = customer.statement();
        String result = "Rental Record for Kirill\nCasper 4.5\nPrince 4.5\nSpy 60.0\nYou owed 69.0\nYou earned 4 frequent renter points\n";
        assertEquals(result, actualResult);
    }
    @Test
    public void weExpectTheCostToBe9And2Point() {
        Rental rental = new Rental(casper, 5);
        Rental rental1 = new Rental(prince, 5);
        Customer customer = new Customer("Vladimir");
        customer.addRental(rental);
        customer.addRental(rental1);
        String actualResult = customer.statement();
        String result = "Rental Record for Vladimir\nCasper 4.5\nPrince 4.5\nYou owed 9.0\nYou earned 2 frequent renter points\n";
        assertEquals(result, actualResult);
    }
}