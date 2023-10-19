package students.denis_asipenka.lesson_9.level_7.task_31;

public class Book {
    private int id;
    private String title;

    private String author;

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public Book(int id, String title, String author, boolean available, boolean isReserved) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = available;
        this.isReserved = isReserved;
    }

    public Book() {
    }

    private boolean available;
    private boolean isReserved;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}