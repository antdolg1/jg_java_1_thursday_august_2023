package teacher.lesson_9.lessoncode.abstraction;

public interface LibraryItem {
    //Variables in the interface (they are implicitly public, static and final)
    int MAX_CHECKOUT_DAYS = 21;
    double LATE_FEE_PER_DAY = 0.50;

    //Abstract methods (those methods are implicitly public and abstract)
    String getTitle();

    String getAuthor();

    boolean isAvailable();

    void checkout();

    void returnItem();

    double calculateLateFee(int daysOverdue);

    //Default method
    default void displayInformation() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Availability: " + (isAvailable() ? "Available" : "Checked out"));
    }
}
