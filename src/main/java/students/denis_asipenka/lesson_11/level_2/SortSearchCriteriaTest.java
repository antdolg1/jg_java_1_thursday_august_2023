package students.denis_asipenka.lesson_11.level_2;

import java.util.List;

public class SortSearchCriteriaTest {
    public static void main(String[] args) {
        SortSearchCriteriaTest test = new SortSearchCriteriaTest();
        test.sortNotHard();
    }
    void sortNotHard(){
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
        SearchCriteria searchCriteria = new SortSearchCriteria(true);
        List<Book> listReturn = bookDatabaseImpl.find(searchCriteria);
        System.out.println(listReturn);
    }
}
