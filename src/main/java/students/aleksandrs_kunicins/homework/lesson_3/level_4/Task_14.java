package students.aleksandrs_kunicins.homework.lesson_3.level_4;

class Book {

    String title; //Точка с запятой

    Book(String bookTitle) {
        this.title = bookTitle; //Переименовал переменную
    }

    String getTitle() {
        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
