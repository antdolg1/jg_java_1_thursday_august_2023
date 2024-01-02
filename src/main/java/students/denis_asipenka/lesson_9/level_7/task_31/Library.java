package students.denis_asipenka.lesson_9.level_7.task_31;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Library {
    public void addBook(Book book, ArrayList<Book> listBook) { // добавление книги
        listBook.add(book);
    }

    public void printListBook(ArrayList<Book> books) { // печать списка книг
        for (Book book : books) {
            System.out.println("ID: " + book.getId() + "\nНазвание книги: " + book.getTitle() + "\nАвтор книги: "
                    + book.getAuthor() + "\nДоступность книги: " + book.isAvailable() + "\nЗарезервирована: " + book.isReserved());
            System.out.println();
        }
    }

    public void bookTake(int idBookTake, BookReader bookReader, int bookId, ArrayList<Book> listBook, ArrayList<TakeBook> listTakeBook) { // взять книгу
        int index = 0;
        LocalDate checkoutDate = LocalDate.now();
        LocalDate returnDate = checkoutDate.plusDays(14);
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getId() == bookId) {
                index = i;
            }
        }
        if (listBook.get(index).isReserved()) {
            System.out.println("Книга зарезервирована!");
        } else {
            listTakeBook.add(new TakeBook(idBookTake, listBook.get(index), bookReader, checkoutDate, returnDate));
            Book tempBook = listBook.get(index);
            tempBook.setAvailable(false);
            listBook.set(index, tempBook);
        }
    }

    public void printingListBorrowedBooks(ArrayList<TakeBook> listTakeBook) { // печать списка взятых книг
        for (TakeBook takeBook : listTakeBook) {
            System.out.println("ID: " + takeBook.getTakeBookId() + "\nID человека взявшего книгу: " + takeBook.getBorrower().getMemberId()
                    + "\nФамилия человека взявшего книгу: " + takeBook.getBorrower().getSurName() + "\nКакую книгу взял: " + takeBook.getBook().getTitle() + "\nID книги какую взял: " + takeBook.getBook().getId()
                    + "\nКогда взял книгу: " + takeBook.getCheckoutDate() + "\nКогда нужно вернуть книгу: " + takeBook.getReturnDate());
            System.out.println();
        }
    }

    public void returnBook(int idTakeBook, ArrayList<Book> listBook, ArrayList<TakeBook> listTakeBook) { // вернуть книгу
        ReturnBook returnBook = new ReturnBook();
        int index = 0;
        for (int i = 0; i < listTakeBook.size(); i++) {
            if (listTakeBook.get(i).getTakeBookId() == idTakeBook) {
                index = i;
            }
        }
        LocalDate todayData = LocalDate.now();
        if (todayData.isAfter(listTakeBook.get(index).getReturnDate())) {
            long daysBetween = ChronoUnit.DAYS.between(listTakeBook.get(index).getReturnDate(), todayData);
            System.out.println("Срок сдачи просрочен на " + daysBetween + "д.\nШТРАФ: " + (daysBetween * returnBook.getAmount()) + " EUR");
        }
        int idBook = listTakeBook.get(index).getBook().getId();
        int indexBook = 0;
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getId() == idBook) {
                indexBook = i;
            }
        }
        Book tempBook = listBook.get(indexBook);
        tempBook.setAvailable(true);
        listBook.set(indexBook, tempBook);
        listTakeBook.remove(index);
    }


    public void bookReservation(int bookId, ArrayList<Book> books) { // резервация книги
        int index = -1;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == bookId) {
                index = i;
            }
        }
        if (index < 0) {
            System.out.println("Книги с таким ID нет!");
        } else if (books.get(index).isReserved()) {
            System.out.println("Книга уже забронированная!");
        } else {
            Book tempBook = books.get(index);
            tempBook.setReserved(true);
            books.set(index, tempBook);
        }
    }

    public void searchBook(String title, ArrayList<Book> books) {
        int count = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                System.out.println("ID: " + books.get(i).getId() + "\nНазвание книги: " + books.get(i).getTitle()
                        + "\nАвтор книги: " + books.get(i).getAuthor() + "\nДоступность книги: " + books.get(i).isAvailable()
                        + "\nЗарезервирована: " + books.get(i).isReserved());
                System.out.println();
                count += 1;
            }
        }
        if (count <= 0) {
            System.out.println("Такая книга отсутствует в библиотеке!");
        }
    }

    public void notification(ArrayList<TakeBook> takeBooks) {
        LocalDate todayData = LocalDate.now();
        int count = 0;
        for (TakeBook takeBook : takeBooks) {
            long daysBetween = ChronoUnit.DAYS.between(todayData, takeBook.getReturnDate());
            if (daysBetween <= 2) {
                System.out.println("Подходит срок сдачи книги: " + takeBook.getBook().getTitle() + ". Дата сдачи: " + takeBook.getReturnDate());
                count += 1;
            }
        }
        if (count <= 0) {
            System.out.println("Не найдено приближающихся сроков сдачи книг.");
        }
    }
}