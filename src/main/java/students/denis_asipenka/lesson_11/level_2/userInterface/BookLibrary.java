package students.denis_asipenka.lesson_11.level_2.userInterface;


import students.denis_asipenka.lesson_11.level_2.BookDatabase;
import students.denis_asipenka.lesson_11.level_2.BookDatabaseImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BookLibrary {

    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new DeleteByBookUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new CountAllBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new FindUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new FindUniqueAuthorsUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new FindUniqueTitlesUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new FindUniqueBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(12, new GetAuthorToBooksMapUIAction(bookDatabase));
        menuNumberToActionMap.put(13, new GetEachAuthorBookCountUIAction(bookDatabase));

    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Пожалуйста выберите пункт меню: ");
            System.out.println("1. Создание книги и добавление в базу: ");
            System.out.println("2. Поиск книги по ID книги: ");
            System.out.println("3. Поиск книги по автору книги: ");
            System.out.println("4. Поиск книги по названию книги: ");
            System.out.println("5. Удаление по ID книги: ");
            System.out.println("6. Удаление по автору и названию книги: ");
            System.out.println("7. Вывести количество книг в базе: ");
            System.out.println("8. Поиск книги по автору или названию книги: ");
            System.out.println("9. Печать всех авторов книг из базы данных: ");
            System.out.println("10. Печать всех названий книг из базы данных: ");
            System.out.println("11. Печать всех уникальных книг из базы данных: ");
            System.out.println("12. Получить список всех авторов и список их книг: ");
            System.out.println("13. Получить список всех авторов и количество уникальных книг: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Спасибо! До свидание");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Пункт меню не существует: " + userSelectedMenuNumber);
        }
    }

}
