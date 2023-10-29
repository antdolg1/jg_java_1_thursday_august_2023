package students.anastassia_iljina.lesson_3.homework.level_7.task_29;

class Book {
    String name;
    String author;
    int numberOfPages;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.numberOfPages = 0;
    }

    public int read(int numberOfPagesRead) {
        numberOfPages = numberOfPages + numberOfPagesRead;
        return numberOfPages;

    }

}
