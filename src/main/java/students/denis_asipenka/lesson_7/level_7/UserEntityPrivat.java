package students.denis_asipenka.lesson_7.level_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserEntityPrivat {
    public UserEntityPrivat(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public UserEntityPrivat() {
    }

    public int id;
    public String name;
    public String surname;
    public UserEntityPrivat arrayUser[] = new UserEntityPrivat[10];
    int stringArray = 0;


    public void createUser() {
        Scanner scanner = new Scanner(System.in);
        this.id += 1;
        if (this.id <= 10) {
            System.out.println("Введите имя:");
            String nameUser = scanner.nextLine();
            System.out.println("Введите фамилию:");
            String surNameUser = scanner.nextLine();
            arrayUser[stringArray] = new UserEntityPrivat(id, nameUser, surNameUser);
            stringArray += 1;
        } else {
            System.out.println("The list is completely full");
            System.out.println();
        }
        menu();
    }

    public void printUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String nameUser = scanner.nextLine();
        for (int i = 0; i <= 9; i++) {
            if (arrayUser[i] != null) {
                if (arrayUser[i].name.equalsIgnoreCase(nameUser)) {
                    System.out.println("ID user: " + arrayUser[i].id + "\nUser name: " + arrayUser[i].name + "\nUser surname: " + arrayUser[i].surname);
                }
            }
        }
        menu();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean value = true;
        System.out.println("Выберите номер операции:");
        System.out.println("1 - Создание пользователя");
        System.out.println("2 - Удаление пользователя");
        System.out.println("3 - Поиск пользователя по ID");
        System.out.println("4 - Поиск пользователя по имени");
        System.out.println("5 - Вывод всех пользователей");
        System.out.println("6 - Редактирование пользователя");
        try {

            number = scanner.nextInt();
            while (value) {
                if (number == 1 || number == 2 || number == 3 || number == 4 || number == 5 || number == 6) {
                    value = false;
                } else {
                    System.out.println("Такого номера нет, сделайте повторный выбор");
                    number = scanner.nextInt();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Введите числовое значение!");
            System.out.println();
            menu();
            return;
        }
        switch (number) {
            case 1:
                createUser();
                break;
            case 2:
                deleteUserId();
                break;
            case 3:
                printUserId();
                break;
            case 4:
                printUserName();
                break;
            case 5:
                printAllUser();
                break;
            case 6:
                redactionUserName();
                break;
            default:
                System.out.println("Такого номера нет, сделайте повторный выбор");
        }
    }

    public void printUserId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уникальный ID пользователя:");
        int idUser = scanner.nextInt();
        for (int i = 0; i <= 9; i++) {
            if (arrayUser[i] != null) {
                if (arrayUser[i].id == idUser) {
                    System.out.println("ID user: " + arrayUser[i].id + "\nUser name: " + arrayUser[i].name + "\nUser surname: " + arrayUser[i].surname);
                }
            }
        }
        menu();
    }

    public void printAllUser() {
        for (int i = 0; i <= 9; i++) {
            if (arrayUser[i] != null) {
                System.out.println("ID user: " + arrayUser[i].id + "\nUser name: " + arrayUser[i].name + "\nUser surname: " + arrayUser[i].surname);
                System.out.println();
            }
        }
        menu();
    }

    public void deleteUserId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уникальный ID пользователя:");
        int idUser = scanner.nextInt();
        for (int i = 0; i <= 9; i++) {
            if (arrayUser[i] != null) {
                if (arrayUser[i].id == idUser) {
                    arrayUser[i] = null;
                }
            }
        }
        menu();
    }

    public void redactionUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уникальный ID пользователя:");
        int idUser = scanner.nextInt();
        for (int count = 0; count <= 9; count++) {
            if (arrayUser[count] != null) {
                if (arrayUser[count].id == idUser) {
                    arrayUser[count] = null;
                    System.out.println("Введите новое имя: ");
                    scanner.nextLine();
                    String newName = scanner.nextLine();
                    System.out.println("Введите новую фамилию: ");
                    String newSurNameUser = scanner.nextLine();
                    arrayUser[count] = new UserEntityPrivat(idUser, newName, newSurNameUser);
                    menu();
                }
            }
        }
        System.out.println("Пользователя в таким ID не существует");
        menu();
    }
}