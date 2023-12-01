package students.denis_asipenka.lesson_15.level_6;

import lombok.Getter;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    @Getter
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.addElement(rental);
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            double thisAmount = calculateAmount(each);
            frequentRenterPoints += calculateFrequentRenterPoints(each);
            result += each.getMovie().getTitle() + " " + thisAmount + "\n";
            totalAmount += thisAmount;
        }
        result += "You owed " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points\n";
        return result;
    }

    private double calculateAmount(Rental rental) {
        double thisAmount = 0;
        switch (rental.getMovie().getPriceCode()) {
            case Movie.REGULAR -> {
                thisAmount += 2;
                if (rental.getDaysRented() > 2)
                    thisAmount += (rental.getDaysRented() - 2) * 1.5;
            }
            case Movie.NEW_RELEASE -> {
                thisAmount += rental.getDaysRented() * 3;
            }
            case Movie.CHILDRENS -> {
                thisAmount += 1.5;
                if (rental.getDaysRented() > 3)
                    thisAmount += (rental.getDaysRented() - 3) * 1.5;
            }
        }
        return thisAmount;
    }

    private int calculateFrequentRenterPoints(Rental rental) {
        int frequentRenterPoints = 1;
        if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE && rental.getDaysRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }
}