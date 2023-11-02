package students.denis_asipenka.lesson_11.level_2;

import java.util.*;

public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.removeId();
        test.removeBook();
        test.searchId();
        test.searchAuthor();
        test.searchTitle();
        test.countBook();
        test.removeTitle();
        test.removeAuthor();
        test.findTest();
        test.findUniqueAuthorsTest();
        test.findUniqueTitlesTest();
        test.findUniqueBooksTest();
        test.containsTest();
        test.getAuthorToBooksMapTest();
        test.getEachAuthorBookCount();
        test.findTestPageOnlyNotHard();
        test.findTestSortOnlyNotHard();
        test.findTestSortAndPage();

    }

    void removeId() {
        Long bookId = 15l;
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Tina Turner", "Happiness Becomes You: A Guide to Changing Your Life for Good"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "And Then There Were None"));
        bookDatabaseImpl.save(new Book("Erik Larson", "The Devil in the White City"));
        bookDatabaseImpl.save(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        bookDatabaseImpl.save(new Book("Katherine Arden", "The Bear and the Nightingale"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        bookDatabaseImpl.save(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        bookDatabaseImpl.save(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "Murder on the Orient Express"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        checkResult(bookDatabaseImpl.delete(bookId), "Тест на удаление элемента по ID: ");
        checkResult(bookDatabaseImpl.delete(44l), "Тест на удаление элемента по ID (FAIL): ");
    }

    void removeBook() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Tina Turner", "Happiness Becomes You: A Guide to Changing Your Life for Good"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "And Then There Were None"));
        bookDatabaseImpl.save(new Book("Erik Larson", "The Devil in the White City"));
        bookDatabaseImpl.save(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        bookDatabaseImpl.save(new Book("Katherine Arden", "The Bear and the Nightingale"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        bookDatabaseImpl.save(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        bookDatabaseImpl.save(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "Murder on the Orient Express"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        Book bookRemove = new Book("Agatha Christie", "Murder on the Orient Express");
        checkResult(bookDatabaseImpl.delete(bookRemove), "Тест на удаление элемента по названию и автору: ");
        checkResult(bookDatabaseImpl.delete(new Book("Agatha Christie One", "Murder on the Orient Express")), "Тест на удаление элемента по названию и автору (FAIL): ");
    }

    void searchId() {
        Long bookId = 12l;
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Tina Turner", "Happiness Becomes You: A Guide to Changing Your Life for Good"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "And Then There Were None"));
        bookDatabaseImpl.save(new Book("Erik Larson", "The Devil in the White City"));
        bookDatabaseImpl.save(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        bookDatabaseImpl.save(new Book("Katherine Arden", "The Bear and the Nightingale"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        bookDatabaseImpl.save(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        bookDatabaseImpl.save(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "Murder on the Orient Express"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        Optional<Book> bookResultOptional = Optional.of(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        checkResult(bookDatabaseImpl.findById(bookId).equals(bookResultOptional), "Тест на поиск книги в списке по ID: ");
        checkResult(bookDatabaseImpl.findById(33l).equals(bookResultOptional), "Тест на поиск книги в списке по ID (FAIL): ");
    }

    void searchAuthor() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Tina Turner", "Happiness Becomes You: A Guide to Changing Your Life for Good"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "And Then There Were None"));
        bookDatabaseImpl.save(new Book("Erik Larson", "The Devil in the White City"));
        bookDatabaseImpl.save(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        bookDatabaseImpl.save(new Book("Katherine Arden", "The Bear and the Nightingale"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        bookDatabaseImpl.save(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        bookDatabaseImpl.save(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "Murder on the Orient Express"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        List<Book> result = new LinkedList<>();
        result.add(new Book("Agatha Christie", "And Then There Were None"));
        result.add(new Book("Agatha Christie", "Murder on the Orient Express"));
        checkResult(bookDatabaseImpl.findByAuthor("Agatha Christie").equals(result), "Тест на поиск книги в списке по автору: ");
        checkResult(bookDatabaseImpl.findByAuthor("Agatha Christie Petrova").equals(result), "Тест на поиск книги в списке по автору (FAIL): ");
    }

    void searchTitle() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "And Then There Were None"));
        bookDatabaseImpl.save(new Book("Erik Larson", "The Devil in the White City"));
        bookDatabaseImpl.save(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        bookDatabaseImpl.save(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        bookDatabaseImpl.save(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        bookDatabaseImpl.save(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "Murder on the Orient Express"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        List<Book> result = new LinkedList<>();
        result.add(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        result.add(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        result.add(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        checkResult(bookDatabaseImpl.findByTitle("One Flew Over the Cuckoo's Nest").equals(result), "Тест на поиск книги в списке по названию: ");
        checkResult(bookDatabaseImpl.findByTitle("One Flew Over the Cuckoo's Nest One").equals(result), "Тест на поиск книги в списке по названию (FAIL): ");
    }

    void countBook() {
        int result = 15;
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "And Then There Were None"));
        bookDatabaseImpl.save(new Book("Erik Larson", "The Devil in the White City"));
        bookDatabaseImpl.save(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        bookDatabaseImpl.save(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        bookDatabaseImpl.save(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        bookDatabaseImpl.save(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "Murder on the Orient Express"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        checkResult(bookDatabaseImpl.countAllBooks() == result, "Тест на количество всех книг в списке: ");
        checkResult(bookDatabaseImpl.countAllBooks() == 44, "Тест на количество всех книг в списке (FAIL): ");
    }

    void removeTitle() {
        int result = 12;
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "And Then There Were None"));
        bookDatabaseImpl.save(new Book("Erik Larson", "The Devil in the White City"));
        bookDatabaseImpl.save(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        bookDatabaseImpl.save(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        bookDatabaseImpl.save(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        bookDatabaseImpl.save(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "Murder on the Orient Express"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.deleteByTitle("One Flew Over the Cuckoo's Nest");
        checkResult(bookDatabaseImpl.linkedListBook.size() == result, "Тест на удаление всех книг определенного названия: ");
        checkResult(bookDatabaseImpl.linkedListBook.size() == 33, "Тест на удаление всех книг определенного названия (FAIL): ");

    }

    void removeAuthor() {
        int result = 13;
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "And Then There Were None"));
        bookDatabaseImpl.save(new Book("Erik Larson", "The Devil in the White City"));
        bookDatabaseImpl.save(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        bookDatabaseImpl.save(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        bookDatabaseImpl.save(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        bookDatabaseImpl.save(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "Murder on the Orient Express"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.deleteByAuthor("Agatha Christie");
        checkResult(bookDatabaseImpl.linkedListBook.size() == result, "Тест на удаление всех книг определенного автора: ");
        checkResult(bookDatabaseImpl.linkedListBook.size() == 44, "Тест на удаление всех книг определенного автора (FAIL): ");
    }

    void findTest() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "And Then There Were None"));
        bookDatabaseImpl.save(new Book("Erik Larson", "The Devil in the White City"));
        bookDatabaseImpl.save(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        bookDatabaseImpl.save(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        bookDatabaseImpl.save(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        bookDatabaseImpl.save(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "Murder on the Orient Express"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        List<Book> listResult = new LinkedList<>();
        listResult.add(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        listResult.add(new Book("Agatha Christie", "And Then There Were None"));
        listResult.add(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        listResult.add(new Book("Agatha Christie", "Murder on the Orient Express"));
        listResult.add(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        List<Book> listResultNotPositive = new LinkedList<>();
        listResultNotPositive.add(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        listResultNotPositive.add(new Book("Agatha Christie", "And Then There Were None"));
        listResultNotPositive.add(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        listResultNotPositive.add(new Book("Agatha Christie", "Murder on the Orient Express"));
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Agatha Christie");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("One Flew Over the Cuckoo's Nest");
        SearchCriteria searchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        checkResult(bookDatabaseImpl.find(searchCriteria).equals(listResult), "Тест на реализацию сложного поиска: ");
        checkResult(bookDatabaseImpl.find(searchCriteria).equals(listResultNotPositive), "Тест на реализацию сложного поиска (FAIL): ");
    }

    void findUniqueAuthorsTest() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "And Then There Were None"));
        bookDatabaseImpl.save(new Book("Erik Larson", "The Devil in the White City"));
        bookDatabaseImpl.save(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        bookDatabaseImpl.save(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        bookDatabaseImpl.save(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        bookDatabaseImpl.save(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "Murder on the Orient Express"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        Set<String> listResult = new LinkedHashSet<>();
        listResult.add("Tina Turner");
        listResult.add("Rowling");
        listResult.add("Agatha Christie");
        listResult.add("Erik Larson");
        listResult.add("Stuart Turton");
        listResult.add("Katherine Arden");
        listResult.add("Heather Morris");
        listResult.add("Gail Honeyman");
        listResult.add("Becky Chambers");
        listResult.add("Mark Haddon");
        listResult.add("Ken Kesey");
        Set<String> listResultNotPositive = new LinkedHashSet<>();
        listResultNotPositive.add("Tina Turner");
        listResultNotPositive.add("Rowling");
        listResultNotPositive.add("Agatha Christie");
        listResultNotPositive.add("Erik Larson");
        listResultNotPositive.add("Stuart Turton");
        listResultNotPositive.add("Katherine Arden");
        listResultNotPositive.add("Heather Morris");
        listResultNotPositive.add("Gail Honeyman");
        listResultNotPositive.add("Becky Chambers");
        listResultNotPositive.add("Mark Haddon");
        checkResult(bookDatabaseImpl.findUniqueAuthors().equals(listResult), "Тест на поиск всех авторов, каждый автор может быть только 1 раз: ");
        checkResult(bookDatabaseImpl.findUniqueAuthors().equals(listResultNotPositive), "Тест на поиск всех авторов, каждый автор может быть только 1 раз (FAIL): ");
    }

    void findUniqueTitlesTest() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "And Then There Were None"));
        bookDatabaseImpl.save(new Book("Erik Larson", "The Devil in the White City"));
        bookDatabaseImpl.save(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        bookDatabaseImpl.save(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        bookDatabaseImpl.save(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        bookDatabaseImpl.save(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "Murder on the Orient Express"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        Set<String> listResult = new LinkedHashSet<>();
        listResult.add("One Flew Over the Cuckoo's Nest");
        listResult.add("Harry Potter and the Sorcerer's Stone");
        listResult.add("And Then There Were None");
        listResult.add("The Devil in the White City");
        listResult.add("The 7 1/2 Deaths of Evelyn Hardcastle");
        listResult.add("Harry Potter and the Chamber of Secrets");
        listResult.add("The Tattooist of Auschwitz");
        listResult.add("Eleanor Oliphant Is Completely Fine");
        listResult.add("Murder on the Orient Express");
        listResult.add("Harry Potter and the Prisoner of Azkaban");
        listResult.add("The Long Way to a Small, Angry Planet");
        listResult.add("The Curious Incident of the Dog in the Night-Time");
        listResult.add("Harry Potter and the Goblet of Fire");
        Set<String> listResultNotPositive = new LinkedHashSet<>();
        listResultNotPositive.add("One Flew Over the Cuckoo's Nest");
        listResultNotPositive.add("Harry Potter and the Sorcerer's Stone");
        listResultNotPositive.add("And Then There Were None");
        listResultNotPositive.add("The Devil in the White City");
        listResultNotPositive.add("The 7 1/2 Deaths of Evelyn Hardcastle");
        listResultNotPositive.add("Harry Potter and the Chamber of Secrets");
        listResultNotPositive.add("The Tattooist of Auschwitz");
        listResultNotPositive.add("Eleanor Oliphant Is Completely Fine");
        listResultNotPositive.add("Murder on the Orient Express");
        listResultNotPositive.add("Harry Potter and the Prisoner of Azkaban");
        listResultNotPositive.add("The Long Way to a Small, Angry Planet");
        listResultNotPositive.add("The Curious Incident of the Dog in the Night-Time");
        checkResult(bookDatabaseImpl.findUniqueTitles().equals(listResult), "Тест на поиск всех названий книг, каждая книга может быть только 1 раз: ");
        checkResult(bookDatabaseImpl.findUniqueTitles().equals(listResultNotPositive), "Тест на поиск всех названий книг, каждая книга может быть только 1 раз (FAIL): ");
    }

    void findUniqueBooksTest() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabaseImpl.save(new Book("Rowling one", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Erik Larson", "The Devil in the White City"));
        bookDatabaseImpl.save(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        bookDatabaseImpl.save(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        bookDatabaseImpl.save(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        bookDatabaseImpl.save(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "Murder on the Orient Express"));
        bookDatabaseImpl.save(new Book("Rowling one", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        Set<Book> listResult = new LinkedHashSet<>();
        listResult.add(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        listResult.add(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        listResult.add(new Book("Rowling one", "Harry Potter and the Prisoner of Azkaban"));
        listResult.add(new Book("Erik Larson", "The Devil in the White City"));
        listResult.add(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        listResult.add(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        listResult.add(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        listResult.add(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        listResult.add(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        listResult.add(new Book("Agatha Christie", "Murder on the Orient Express"));
        listResult.add(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        listResult.add(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        listResult.add(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        listResult.add(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        Set<Book> listResultNotPositive = new LinkedHashSet<>();
        listResultNotPositive.add(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        listResultNotPositive.add(new Book("Rowling one", "Harry Potter and the Prisoner of Azkaban"));
        listResultNotPositive.add(new Book("Erik Larson", "The Devil in the White City"));
        listResultNotPositive.add(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        listResultNotPositive.add(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        listResultNotPositive.add(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        listResultNotPositive.add(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        listResultNotPositive.add(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        listResultNotPositive.add(new Book("Agatha Christie", "Murder on the Orient Express"));
        listResultNotPositive.add(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        listResultNotPositive.add(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        listResultNotPositive.add(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        listResultNotPositive.add(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        checkResult(bookDatabaseImpl.findUniqueBooks().equals(listResult), "Тест метода который должен находить и возвращать все уникальные книги в библиотеке: ");
        checkResult(bookDatabaseImpl.findUniqueBooks().equals(listResultNotPositive), "Тест метода который должен находить и возвращать все уникальные книги в библиотеке (FAIL): ");

    }

    void containsTest() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabaseImpl.save(new Book("Rowling one", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Erik Larson", "The Devil in the White City"));
        bookDatabaseImpl.save(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        bookDatabaseImpl.save(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        bookDatabaseImpl.save(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        bookDatabaseImpl.save(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "Murder on the Orient Express"));
        bookDatabaseImpl.save(new Book("Rowling one", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        checkResult(bookDatabaseImpl.contains(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet")), "Тест метода который проверят есть такая книга уже есть базе данных библиотеки: ");
        checkResult(bookDatabaseImpl.contains(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet One")), "Тест метода который проверят есть такая книга уже есть базе данных библиотеки (FAIL): ");
    }

    void getAuthorToBooksMapTest() {
        Book book1 = new Book("Rowling", "One Flew Over the Cuckoo's Nest");
        Book book2 = new Book("Rowling", "Harry Potter and the Sorcerer's Stone");
        Book book3 = new Book("Rowling", "Harry Potter and the Prisoner of Azkaban");
        Book book4 = new Book("Erik Larson", "The Devil in the White City");
        Book book5 = new Book("Erik Larson", "The 7 1/2 Deaths of Evelyn Hardcastle");
        Book book6 = new Book("Erik Larson", "One Flew Over the Cuckoo's Nest");
        Book book7 = new Book("Rowling", "Harry Potter and the Chamber of Secrets");
        Book book8 = new Book("Erik Larson", "The Tattooist of Auschwitz");
        Book book9 = new Book("Erik Larson", "Eleanor Oliphant Is Completely Fine");
        Book book10 = new Book("Erik Larson", "Murder on the Orient Express");
        Book book11 = new Book("Rowling", "Harry Potter and the Prisoner of Azkaban");
        Book book12 = new Book("Erik Larson", "The Long Way to a Small, Angry Planet");
        Book book13 = new Book("Rowling", "The Curious Incident of the Dog in the Night-Time");
        Book book14 = new Book("Rowling", "Harry Potter and the Goblet of Fire");
        Book book15 = new Book("Rowling", "One Flew Over the Cuckoo's Nest");
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(book1);
        bookDatabaseImpl.save(book2);
        bookDatabaseImpl.save(book3);
        bookDatabaseImpl.save(book4);
        bookDatabaseImpl.save(book5);
        bookDatabaseImpl.save(book6);
        bookDatabaseImpl.save(book7);
        bookDatabaseImpl.save(book8);
        bookDatabaseImpl.save(book9);
        bookDatabaseImpl.save(book10);
        bookDatabaseImpl.save(book11);
        bookDatabaseImpl.save(book12);
        bookDatabaseImpl.save(book13);
        bookDatabaseImpl.save(book14);
        bookDatabaseImpl.save(book15);
        List<Book> listBookResultRowling = new LinkedList<>();
        listBookResultRowling.add(book1);
        listBookResultRowling.add(book2);
        listBookResultRowling.add(book3);
        listBookResultRowling.add(book7);
        listBookResultRowling.add(book11);
        listBookResultRowling.add(book13);
        listBookResultRowling.add(book14);
        listBookResultRowling.add(book15);
        List<Book> listBookResultErikLarson = new LinkedList<>();
        listBookResultErikLarson.add(book4);
        listBookResultErikLarson.add(book5);
        listBookResultErikLarson.add(book6);
        listBookResultErikLarson.add(book8);
        listBookResultErikLarson.add(book9);
        listBookResultErikLarson.add(book10);
        listBookResultErikLarson.add(book12);
        Map<String, List<Book>> listResult = new LinkedHashMap<>();
        listResult.put("Rowling", listBookResultRowling);
        listResult.put("Erik Larson", listBookResultErikLarson);
        Map<String, List<Book>> listResultNotPositive = new LinkedHashMap<>();
        listResultNotPositive.put("Rowling", listBookResultRowling);
        listResultNotPositive.put("Erik Larson One", listBookResultErikLarson);
        checkResult(bookDatabaseImpl.getAuthorToBooksMap().equals(listResult), "Тест метода который возвращать коллекцию мап в котором ключом является автор, а значением список книг этого автора: ");
        checkResult(bookDatabaseImpl.getAuthorToBooksMap().equals(listResultNotPositive), "Тест метода который возвращать коллекцию мап в котором ключом является автор, а значением список книг этого автора (FAIL): ");
    }

    void getEachAuthorBookCount() {
        Book book1 = new Book("Rowling", "One Flew Over the Cuckoo's Nest");
        Book book2 = new Book("Rowling", "Harry Potter and the Sorcerer's Stone");
        Book book3 = new Book("Rowling", "Harry Potter and the Prisoner of Azkaban");
        Book book4 = new Book("Erik Larson", "The Devil in the White City");
        Book book5 = new Book("Erik Larson", "The 7 1/2 Deaths of Evelyn Hardcastle");
        Book book6 = new Book("Erik Larson", "One Flew Over the Cuckoo's Nest");
        Book book7 = new Book("Rowling", "Harry Potter and the Chamber of Secrets");
        Book book8 = new Book("Erik Larson", "The Tattooist of Auschwitz");
        Book book9 = new Book("Erik Larson", "Eleanor Oliphant Is Completely Fine");
        Book book10 = new Book("Erik Larson", "Murder on the Orient Express");
        Book book11 = new Book("Rowling", "Harry Potter and the Prisoner of Azkaban");
        Book book12 = new Book("Erik Larson", "The Long Way to a Small, Angry Planet");
        Book book13 = new Book("Rowling", "The Curious Incident of the Dog in the Night-Time");
        Book book14 = new Book("Rowling", "Harry Potter and the Goblet of Fire");
        Book book15 = new Book("Rowling", "One Flew Over the Cuckoo's Nest");
        Book book16 = new Book("Erik Larson", "The Long Way to a Small, Angry Planet");

        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(book1);
        bookDatabaseImpl.save(book2);
        bookDatabaseImpl.save(book3);
        bookDatabaseImpl.save(book4);
        bookDatabaseImpl.save(book5);
        bookDatabaseImpl.save(book6);
        bookDatabaseImpl.save(book7);
        bookDatabaseImpl.save(book8);
        bookDatabaseImpl.save(book9);
        bookDatabaseImpl.save(book10);
        bookDatabaseImpl.save(book11);
        bookDatabaseImpl.save(book12);
        bookDatabaseImpl.save(book13);
        bookDatabaseImpl.save(book14);
        bookDatabaseImpl.save(book15);
        bookDatabaseImpl.save(book16);
        Map<String, Integer> listResult = new LinkedHashMap<>();
        listResult.put("Rowling", 6);
        listResult.put("Erik Larson", 7);
        Map<String, Integer> listResultNotPositive = new LinkedHashMap<>();
        listResultNotPositive.put("Rowling", 65);
        listResultNotPositive.put("Erik Larson", 7);
        checkResult(bookDatabaseImpl.getEachAuthorBookCount().equals(listResult), "Тест метода который должен возвращать мап в котором ключом является автор, а значением количество уникальных книг этого автора в базе данных: ");
        checkResult(bookDatabaseImpl.getEachAuthorBookCount().equals(listResultNotPositive), "Тест метода который должен возвращать мап в котором ключом является автор, а значением количество уникальных книг этого автора в базе данных (FAIL): ");
    }

    void findTestPageOnlyNotHard() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "And Then There Were None"));
        bookDatabaseImpl.save(new Book("Erik Larson", "The Devil in the White City"));
        bookDatabaseImpl.save(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        bookDatabaseImpl.save(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        bookDatabaseImpl.save(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        bookDatabaseImpl.save(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "Murder on the Orient Express"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "And Then There Were None"));
        bookDatabaseImpl.save(new Book("Erik Larson", "The Devil in the White City"));
        bookDatabaseImpl.save(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        bookDatabaseImpl.save(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        bookDatabaseImpl.save(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        bookDatabaseImpl.save(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "Murder on the Orient Express"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        bookDatabaseImpl.save(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        bookDatabaseImpl.save(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "Murder on the Orient Express"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "And Then There Were None"));
        bookDatabaseImpl.save(new Book("Erik Larson", "The Devil in the White City"));
        bookDatabaseImpl.save(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        bookDatabaseImpl.save(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        bookDatabaseImpl.save(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        bookDatabaseImpl.save(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "Murder on the Orient Express"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        bookDatabaseImpl.save(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        bookDatabaseImpl.save(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        bookDatabaseImpl.save(new Book("Agatha Christie", "Murder on the Orient Express"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
        List<Book> listResult = new LinkedList<>();
        listResult.add(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        listResult.add(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        listResult.add(new Book("Agatha Christie", "And Then There Were None"));
        listResult.add(new Book("Erik Larson", "The Devil in the White City"));
        listResult.add(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        listResult.add(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        listResult.add(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        listResult.add(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        listResult.add(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        listResult.add(new Book("Agatha Christie", "Murder on the Orient Express"));
        List<Book> listResultNotPositive = new LinkedList<>();
        listResultNotPositive.add(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        listResultNotPositive.add(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        listResultNotPositive.add(new Book("Agatha Christie", "And Then There Were None"));
        listResultNotPositive.add(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        listResultNotPositive.add(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        listResultNotPositive.add(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        listResultNotPositive.add(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        listResultNotPositive.add(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        listResultNotPositive.add(new Book("Agatha Christie", "Murder on the Orient Express"));
        SearchCriteria searchCriteria = new PagingSearchCriteria(1);
        checkResult(bookDatabaseImpl.find(searchCriteria).equals(listResult), "Тест на реализацию вывода по 1 странице: ");
        checkResult(bookDatabaseImpl.find(searchCriteria).equals(listResultNotPositive), "Тест на реализацию вывода по 1 странице (FAIL): ");
    }

    void findTestSortOnlyNotHard() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("ARowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("CMark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("DKen Kesey", "One Flew Over the Cuckoo's Nest"));
        List<Book> listResult = new LinkedList<>();
        listResult.add(new Book("ARowling", "Harry Potter and the Sorcerer's Stone"));
        listResult.add(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        listResult.add(new Book("CMark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        listResult.add(new Book("DKen Kesey", "One Flew Over the Cuckoo's Nest"));
        listResult.add(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        listResult.add(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        listResult.add(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        List<Book> listResultNotPositive = new LinkedList<>();
        listResultNotPositive.add(new Book("ARowling", "Harry Potter and the Sorcerer's Stone"));
        listResultNotPositive.add(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        listResultNotPositive.add(new Book("CMark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        listResultNotPositive.add(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        listResultNotPositive.add(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        listResultNotPositive.add(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        SearchCriteria searchCriteria = new SortSearchCriteria(true);
        checkResult(bookDatabaseImpl.find(searchCriteria).equals(listResult), "Тест на реализацию вывода отсортированного списка: ");
        checkResult(bookDatabaseImpl.find(searchCriteria).equals(listResultNotPositive), "Тест на реализацию вывода отсортированного списка: (FAIL): ");
    }
    void findTestSortAndPage() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("ARowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("CMark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("DKen Kesey", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        bookDatabaseImpl.save(new Book("ARowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabaseImpl.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabaseImpl.save(new Book("CMark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabaseImpl.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabaseImpl.save(new Book("DKen Kesey", "One Flew Over the Cuckoo's Nest"));

        List<Book> listResult = new LinkedList<>();
        listResult.add(new Book("ARowling", "Harry Potter and the Sorcerer's Stone"));
        listResult.add(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        listResult.add(new Book("CMark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        listResult.add(new Book("DKen Kesey", "One Flew Over the Cuckoo's Nest"));
        listResult.add(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        listResult.add(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        listResult.add(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        List<Book> listResultNotPositive = new LinkedList<>();
        listResultNotPositive.add(new Book("ARowling", "Harry Potter and the Sorcerer's Stone"));
        listResultNotPositive.add(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        listResultNotPositive.add(new Book("CMark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        listResultNotPositive.add(new Book("Rowling", "Harry Potter and the Prisoner of Azkaban"));
        listResultNotPositive.add(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        listResultNotPositive.add(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        SearchCriteria sortSearchCriteria = new SortSearchCriteria(true);
        SearchCriteria pagingSearchCriteria = new PagingSearchCriteria(1);
       // SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("ARowling");
      //  SearchCriteria titleSearchCriteria = new TitleSearchCriteria("The Curious Incident of the Dog in the Night-Time");

       // SortSearchCriteria searchCriteria = new OrSearchCriteria(authorSearchCriteria,titleSearchCriteria);
//        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Agatha Christie");
//        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("One Flew Over the Cuckoo's Nest");
        SearchCriteria searchCriteria = new OrSearchCriteria(sortSearchCriteria, pagingSearchCriteria);
        System.out.println("Day X");
        System.out.println(bookDatabaseImpl.find(searchCriteria));
      //  checkResult(bookDatabaseImpl.find(searchCriteria).equals(listResult), "Тест на реализацию сложного поиска: ");

//        checkResult(bookDatabaseImpl.find(d).equals(listResult), "Тест на реализацию вывода отсортированного списка: ");
//        checkResult(bookDatabaseImpl.find(j).equals(listResultNotPositive), "Тест на реализацию вывода отсортированного списка: (FAIL): ");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}