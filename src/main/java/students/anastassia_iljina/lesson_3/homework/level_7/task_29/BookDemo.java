package students.anastassia_iljina.lesson_3.homework.level_7.task_29;

public class BookDemo {
    public static void main(String[] args) {

        Book book = new Book("Harry Potter and the philosopher's stone", "Joanne Rowling");
        book.read(56);
        System.out.println("Я начала читать " + book.name + ", автором которого является " + book.author);
        System.out.println("За первый день я прочитала " + book.numberOfPages + " страниц");
        book.read(68);
        System.out.println("За два дня я прочитала " + book.numberOfPages + " страниц");


    }
}
