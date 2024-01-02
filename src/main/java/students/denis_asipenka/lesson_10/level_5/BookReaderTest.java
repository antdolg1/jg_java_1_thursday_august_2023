package students.denis_asipenka.lesson_10.level_5;

import java.util.ArrayList;

public class BookReaderTest {
    public static void main(String[] args) {
        BookReaderTest test = new BookReaderTest();
        test.bookAddTest();
        test.addNonAuthor();
        test.removeBook();
        test.printBook();
        test.searchBook();
        test.searchBookFirstLetter();
        test.searchBookTitle();
        test.searchBookFirstLetterTitle();
        test.markAsReadTest();
        test.markAsUnreadTest();
        test.printBookRead();
        test.printBookUnread();

    }

    void bookAddTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook("Tina Turner", "Happiness Becomes You: A Guide to Changing Your Life for Good");
        bookReader.addBook("Rowling", "Harry Potter and the Sorcerer's Stone");
        bookReader.addBook("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle");
        bookReader.addBook("Agatha Christie", "And Then There Were None");
        bookReader.addBook("Erik Larson", "The Devil in the White City");
        bookReader.addBook("Katherine Arden", "The Bear and the Nightingale");
        bookReader.addBook("Rowling", "Harry Potter and the Chamber of Secrets");
        bookReader.addBook("Heather Morris", "The Tattooist of Auschwitz");
        bookReader.addBook("Gail Honeyman", "Eleanor Oliphant Is Completely Fine");
        bookReader.addBook("Agatha Christie", "Murder on the Orient Express");
        bookReader.addBook("Rowling", "Harry Potter and the Prisoner of Azkaban");
        bookReader.addBook("Becky Chambers", "The Long Way to a Small, Angry Planet");
        bookReader.addBook("Mark Haddon", "The Curious Incident of the Dog in the Night-Time");
        bookReader.addBook("Rowling", "Harry Potter and the Goblet of Fire");
        bookReader.addBook("Ken Kesey", "One Flew Over the Cuckoo's Nest");
        checkResult(bookReader.addBook("Roald Dahl", "James and the Giant Peach"), "Корректное добавление новой книги: ");
        checkResult(bookReader.addBook("Roald Dahl", "James and the Giant Peach one"), "Корректное добавление новой книги: ");
        checkResult(bookReader.addBook("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"), "Не корректное добавление новой книги (FAIL): ");
        checkResult(bookReader.addBook("Rowling", "Harry Potter and the Goblet of Fire"), "Не корректное добавление новой книги (FAIL): ");
    }

    void addNonAuthor() {
        BookReaderImpl bookReader = new BookReaderImpl();
        checkResult(bookReader.addBook("", "Convenience Store Woman"), "Не корректное добавление новой книги без автора  (FAIL): ");
        checkResult(bookReader.addBook("Sayaka Murata", "        "), "Не корректное добавление новой книги  без названия (FAIL): ");
        checkResult(bookReader.addBook("", "   "), "Не корректное добавление новой книги без автора и названия (FAIL): ");
        checkResult(bookReader.addBook("Agatha Christie", "The Mysterious Affair at Styles"), "Корректное добавление новой книги: ");
    }

    void removeBook() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook("Tina Turner", "Happiness Becomes You: A Guide to Changing Your Life for Good");
        bookReader.addBook("Rowling", "Harry Potter and the Sorcerer's Stone");
        bookReader.addBook("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle");
        checkResult(bookReader.removeBook("Tina Turner", "Happiness Becomes You: A Guide to Changing Your Life for Good"), "Удаление существующего элемента: ");
        checkResult(bookReader.removeBook("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle one"), "Удаление не существующего элемента (FAIL): ");
    }

    void printBook() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook("Tina Turner", "Happiness Becomes You: A Guide to Changing Your Life for Good");
        bookReader.addBook("Rowling", "Harry Potter and the Sorcerer's Stone");
        bookReader.addBook("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle");
        bookReader.addBook("Agatha Christie", "And Then There Were None");
        bookReader.addBook("Erik Larson", "The Devil in the White City");
        bookReader.addBook("Katherine Arden", "The Bear and the Nightingale");
        bookReader.addBook("Rowling", "Harry Potter and the Chamber of Secrets");
        bookReader.addBook("Heather Morris", "The Tattooist of Auschwitz");
        bookReader.addBook("Gail Honeyman", "Eleanor Oliphant Is Completely Fine");
        bookReader.addBook("Agatha Christie", "Murder on the Orient Express");
        bookReader.addBook("Rowling", "Harry Potter and the Prisoner of Azkaban");
        bookReader.addBook("Becky Chambers", "The Long Way to a Small, Angry Planet");
        bookReader.addBook("Mark Haddon", "The Curious Incident of the Dog in the Night-Time");
        bookReader.addBook("Rowling", "Harry Potter and the Goblet of Fire");
        bookReader.addBook("Ken Kesey", "One Flew Over the Cuckoo's Nest");
        bookReader.allBookPrint();
    }

    void searchBook() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook("Tina Turner", "Happiness Becomes You: A Guide to Changing Your Life for Good");
        bookReader.addBook("Rowling", "Harry Potter and the Sorcerer's Stone");
        bookReader.addBook("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle");
        bookReader.addBook("Agatha Christie", "And Then There Were None");
        bookReader.addBook("Erik Larson", "The Devil in the White City");
        bookReader.addBook("Katherine Arden", "The Bear and the Nightingale");
        bookReader.addBook("Rowling", "Harry Potter and the Chamber of Secrets");
        bookReader.addBook("Heather Morris", "The Tattooist of Auschwitz");
        bookReader.addBook("Gail Honeyman", "Eleanor Oliphant Is Completely Fine");
        bookReader.addBook("Agatha Christie", "Murder on the Orient Express");
        bookReader.addBook("Rowling", "Harry Potter and the Prisoner of Azkaban");
        bookReader.addBook("Becky Chambers", "The Long Way to a Small, Angry Planet");
        bookReader.addBook("Mark Haddon", "The Curious Incident of the Dog in the Night-Time");
        bookReader.addBook("Rowling", "Harry Potter and the Goblet of Fire");
        bookReader.addBook("Ken Kesey", "One Flew Over the Cuckoo's Nest");
        System.out.println();
        ArrayList<Book> returnList = (bookReader.searchBookAuthor("Rowling"));
        for (Book book : returnList) {
            System.out.println(book.getTitle() + " [" + book.getAuthor() + "]");
        }
    }

    void searchBookFirstLetter() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook("Erik Tina Turner", "Happiness Becomes You: A Guide to Changing Your Life for Good");
        bookReader.addBook("Rowling", "Harry Potter and the Sorcerer's Stone");
        bookReader.addBook("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle");
        bookReader.addBook("Agatha Christie", "And Then There Were None");
        bookReader.addBook("Erik Larson", "The Devil in the White City");
        bookReader.addBook("Katherine Arden", "The Bear and the Nightingale");
        bookReader.addBook("Rowling", "Harry Potter and the Chamber of Secrets");
        bookReader.addBook("Heather Morris", "The Tattooist of Auschwitz");
        bookReader.addBook("Gail Honeyman", "Eleanor Oliphant Is Completely Fine");
        bookReader.addBook("Agatha Christie", "Murder on the Orient Express");
        bookReader.addBook("Rowling", "Harry Potter and the Prisoner of Azkaban");
        bookReader.addBook("Erik Becky Chambers", "The Long Way to a Small, Angry Planet");
        bookReader.addBook("Mark Haddon", "The Curious Incident of the Dog in the Night-Time");
        bookReader.addBook("Rowling", "Harry Potter and the Goblet of Fire");
        bookReader.addBook("Erik Ken Kesey", "One Flew Over the Cuckoo's Nest");
        ArrayList<Book> returnList = (bookReader.searchFirstLetterAuthor("Erik"));
        System.out.println();
        for (Book book : returnList) {
            System.out.println(book.getTitle() + " [" + book.getAuthor() + "]");
        }
    }

    void searchBookTitle() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook("Tina Turner", "Happiness Becomes You: A Guide to Changing Your Life for Good");
        bookReader.addBook("Rowling", "Harry Potter and the Sorcerer's Stone");
        bookReader.addBook("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle");
        bookReader.addBook("Agatha Christie", "And Then There Were None");
        bookReader.addBook("Erik Larson", "The Devil in the White City");
        bookReader.addBook("Katherine Arden", "The Bear and the Nightingale");
        bookReader.addBook("Rowling", "Harry Potter and the Chamber of Secrets");
        bookReader.addBook("Heather Morris", "The Tattooist of Auschwitz");
        bookReader.addBook("Gail Honeyman", "Eleanor Oliphant Is Completely Fine");
        bookReader.addBook("Agatha Christie", "Murder on the Orient Express");
        bookReader.addBook("Rowling", "Harry Potter and the Prisoner of Azkaban");
        bookReader.addBook("Becky Chambers", "The Long Way to a Small, Angry Planet");
        bookReader.addBook("Mark Haddon", "The Curious Incident of the Dog in the Night-Time");
        bookReader.addBook("Rowling", "Harry Potter and the Goblet of Fire");
        bookReader.addBook("Ken Kesey", "One Flew Over the Cuckoo's Nest");
        System.out.println();
        ArrayList<Book> returnList = (bookReader.searchBookTitle("Eleanor Oliphant Is Completely Fine"));
        for (Book book : returnList) {
            System.out.println(book.getTitle() + " [" + book.getAuthor() + "]");
        }
    }

    void searchBookFirstLetterTitle() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook("Erik Tina Turner", "Happiness Becomes You: A Guide to Changing Your Life for Good");
        bookReader.addBook("Rowling", "Harry Potter and the Sorcerer's Stone");
        bookReader.addBook("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle");
        bookReader.addBook("Agatha Christie", "And Then There Were None");
        bookReader.addBook("Erik Larson", "The Devil in the White City");
        bookReader.addBook("Katherine Arden", "The Bear and the Nightingale");
        bookReader.addBook("Rowling", "Harry Potter and the Chamber of Secrets");
        bookReader.addBook("Heather Morris", "The Tattooist of Auschwitz");
        bookReader.addBook("Gail Honeyman", "Eleanor Oliphant Is Completely Fine");
        bookReader.addBook("Agatha Christie", "Murder on the Orient Express");
        bookReader.addBook("Rowling", "Harry Potter and the Prisoner of Azkaban");
        bookReader.addBook("Erik Becky Chambers", "The Long Way to a Small, Angry Planet");
        bookReader.addBook("Mark Haddon", "The Curious Incident of the Dog in the Night-Time");
        bookReader.addBook("Rowling", "Harry Potter and the Goblet of Fire");
        bookReader.addBook("Erik Ken Kesey", "One Flew Over the Cuckoo's Nest");
        ArrayList<Book> returnList = (bookReader.searchFirstLetterTitle("Harry"));
        System.out.println();
        for (Book book : returnList) {
            System.out.println(book.getTitle() + " [" + book.getAuthor() + "]");
        }
    }

    void markAsReadTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook("Erik Tina Turner", "Happiness Becomes You: A Guide to Changing Your Life for Good");
        bookReader.addBook("Rowling", "Harry Potter and the Sorcerer's Stone");
        bookReader.addBook("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle");
        bookReader.addBook("Agatha Christie", "And Then There Were None");
        bookReader.addBook("Erik Larson", "The Devil in the White City");
        bookReader.addBook("Katherine Arden", "The Bear and the Nightingale");
        bookReader.addBook("Rowling", "Harry Potter and the Chamber of Secrets");
        bookReader.addBook("Heather Morris", "The Tattooist of Auschwitz");
        bookReader.addBook("Gail Honeyman", "Eleanor Oliphant Is Completely Fine");
        bookReader.addBook("Agatha Christie", "Murder on the Orient Express");
        bookReader.addBook("Rowling", "Harry Potter and the Prisoner of Azkaban");
        bookReader.addBook("Erik Becky Chambers", "The Long Way to a Small, Angry Planet");
        bookReader.addBook("Mark Haddon", "The Curious Incident of the Dog in the Night-Time");
        bookReader.addBook("Rowling", "Harry Potter and the Goblet of Fire");
        bookReader.addBook("Erik Ken Kesey", "One Flew Over the Cuckoo's Nest");
        checkResult(bookReader.markAsRead("Rowling", "Harry Potter and the Chamber of Secrets"),
                "Тест на изменения статуса на прочитано: ");
        checkResult(bookReader.markAsRead("Rowling5", "Harry Potter and the Chamber of Secrets"),
                "Тест на изменения статуса на прочитано (FAIL): ");
    }

    void markAsUnreadTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook("Erik Tina Turner", "Happiness Becomes You: A Guide to Changing Your Life for Good");
        bookReader.addBook("Rowling", "Harry Potter and the Sorcerer's Stone");
        bookReader.addBook("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle");
        bookReader.addBook("Agatha Christie", "And Then There Were None");
        bookReader.addBook("Erik Larson", "The Devil in the White City");
        bookReader.addBook("Katherine Arden", "The Bear and the Nightingale");
        bookReader.addBook("Rowling", "Harry Potter and the Chamber of Secrets");
        bookReader.addBook("Heather Morris", "The Tattooist of Auschwitz");
        bookReader.addBook("Gail Honeyman", "Eleanor Oliphant Is Completely Fine");
        bookReader.addBook("Agatha Christie", "Murder on the Orient Express");
        bookReader.addBook("Rowling", "Harry Potter and the Prisoner of Azkaban");
        bookReader.addBook("Erik Becky Chambers", "The Long Way to a Small, Angry Planet");
        bookReader.addBook("Mark Haddon", "The Curious Incident of the Dog in the Night-Time");
        bookReader.addBook("Rowling", "Harry Potter and the Goblet of Fire");
        bookReader.addBook("Erik Ken Kesey", "One Flew Over the Cuckoo's Nest");
        bookReader.markAsRead("Rowling", "Harry Potter and the Chamber of Secrets");
        checkResult(bookReader.markAsUnread("Rowling", "Harry Potter and the Chamber of Secrets"),
                "Тест на изменение статуса на не прочитано: ");
        checkResult(bookReader.markAsUnread("Rowling5", "Harry Potter and the Chamber of Secrets"),
                "Тест на изменение статуса на не прочитано (FAIL): ");
    }

    void printBookRead() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook("Tina Turner", "Happiness Becomes You: A Guide to Changing Your Life for Good");
        bookReader.addBook("Rowling", "Harry Potter and the Sorcerer's Stone");
        bookReader.addBook("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle");
        bookReader.addBook("Agatha Christie", "And Then There Were None");
        bookReader.addBook("Erik Larson", "The Devil in the White City");
        bookReader.addBook("Katherine Arden", "The Bear and the Nightingale");
        bookReader.addBook("Rowling", "Harry Potter and the Chamber of Secrets");
        bookReader.addBook("Heather Morris", "The Tattooist of Auschwitz");
        bookReader.addBook("Gail Honeyman", "Eleanor Oliphant Is Completely Fine");
        bookReader.addBook("Agatha Christie", "Murder on the Orient Express");
        bookReader.addBook("Rowling", "Harry Potter and the Prisoner of Azkaban");
        bookReader.addBook("Becky Chambers", "The Long Way to a Small, Angry Planet");
        bookReader.addBook("Mark Haddon", "The Curious Incident of the Dog in the Night-Time");
        bookReader.addBook("Rowling", "Harry Potter and the Goblet of Fire");
        bookReader.addBook("Ken Kesey", "One Flew Over the Cuckoo's Nest");
        bookReader.markAsRead("Rowling", "Harry Potter and the Chamber of Secrets");
        bookReader.markAsRead("Ken Kesey", "One Flew Over the Cuckoo's Nest");
        bookReader.markAsRead("Becky Chambers", "The Long Way to a Small, Angry Planet");
        System.out.println();
        bookReader.printBookIsRead();
    }

    void printBookUnread() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook("Tina Turner", "Happiness Becomes You: A Guide to Changing Your Life for Good");
        bookReader.addBook("Rowling", "Harry Potter and the Sorcerer's Stone");
        bookReader.addBook("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle");
        bookReader.addBook("Agatha Christie", "And Then There Were None");
        bookReader.addBook("Erik Larson", "The Devil in the White City");
        bookReader.addBook("Katherine Arden", "The Bear and the Nightingale");
        bookReader.addBook("Rowling", "Harry Potter and the Chamber of Secrets");
        bookReader.addBook("Heather Morris", "The Tattooist of Auschwitz");
        bookReader.addBook("Gail Honeyman", "Eleanor Oliphant Is Completely Fine");
        bookReader.addBook("Agatha Christie", "Murder on the Orient Express");
        bookReader.addBook("Rowling", "Harry Potter and the Prisoner of Azkaban");
        bookReader.addBook("Becky Chambers", "The Long Way to a Small, Angry Planet");
        bookReader.addBook("Mark Haddon", "The Curious Incident of the Dog in the Night-Time");
        bookReader.addBook("Rowling", "Harry Potter and the Goblet of Fire");
        bookReader.addBook("Ken Kesey", "One Flew Over the Cuckoo's Nest");
        bookReader.markAsRead("Rowling", "Harry Potter and the Chamber of Secrets");
        bookReader.markAsRead("Ken Kesey", "One Flew Over the Cuckoo's Nest");
        bookReader.markAsRead("Becky Chambers", "The Long Way to a Small, Angry Planet");
        System.out.println();
        bookReader.printBookIsUnread();
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}