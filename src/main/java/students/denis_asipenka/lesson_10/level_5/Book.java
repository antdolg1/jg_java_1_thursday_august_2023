package students.denis_asipenka.lesson_10.level_5;

public class Book {
    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String title;

    public Book(String title, String author, boolean read) {
        this.title = title;
        this.author = author;
        this.read = read;
    }

    private String author;

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    private boolean read;
}