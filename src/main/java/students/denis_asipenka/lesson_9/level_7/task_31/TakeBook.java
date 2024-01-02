package students.denis_asipenka.lesson_9.level_7.task_31;

import java.time.LocalDate;

public class TakeBook {
    public TakeBook() {
    }

    private int takeBookId;
    private Book book;
    private BookReader borrower;

    public TakeBook(int takeBookId, Book book, BookReader borrower, LocalDate checkoutDate, LocalDate returnDate) {
        this.takeBookId = takeBookId;
        this.book = book;
        this.borrower = borrower;
        this.checkoutDate = checkoutDate;
        this.returnDate = returnDate;
    }

    private LocalDate checkoutDate;
    private LocalDate returnDate;
    private boolean isReserved;

    public int getTakeBookId() {
        return takeBookId;
    }

    public void setTakeBookId(int takeBookId) {

        this.takeBookId = takeBookId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BookReader getBorrower() {
        return borrower;
    }

    public void setBorrower(BookReader borrower) {
        this.borrower = borrower;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }
}