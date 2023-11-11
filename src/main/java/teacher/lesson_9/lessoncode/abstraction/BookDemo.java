package teacher.lesson_9.lessoncode.abstraction;

public class BookDemo {
    public static void main(String[] args) {


        Book book1 = new Book("LOTR", "Tolkien");

        double book1Fee = book1.calculateLateFee(12);

        System.out.println("Late fee for LOTR book for 12 days is: " + book1Fee);

        book1.displayInformation();

    }
}
