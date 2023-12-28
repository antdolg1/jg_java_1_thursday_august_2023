package students.denis_asipenka.lesson_9.level_7.task_31;

public class ReturnBook {

    private TakeBook takeBook;
    private double amount = 0.50;

    public TakeBook getTakeBook() {
        return takeBook;
    }

    public void setTakeBook(TakeBook takeBook) {
        this.takeBook = takeBook;
    }

    public double getAmount() {
        return amount;
    }
}