package students.denis_asipenka.lesson_7.level_7;

public class UserEntityTest {
    public static void main(String[] args) {
        System.out.println("Результат должен быть \"ОК\" если нет пометки \"*FAIL*\"");
        System.out.println("_______________________________________________________");
        System.out.println();
        UserEntityTest test = new UserEntityTest();
        test.redactionUserNameTest();
        test.redactionUserNameTestOne();
        test.deleteUserIdTest();
        test.deleteUserIdTestOne();
        test.printAllUserTest();
        test.printUserIdTest();
        test.printUserIdTestOne();
        test.printUserNameTest();
        test.printUserNameTestOne();
        test.createUserTest();
        test.createUserTestOne();
    }

    void redactionUserNameTest() {
        UserEntity arrayUserTest[] = new UserEntity[10];
        UserEntity userEntity = new UserEntity();
        arrayUserTest[0] = new UserEntity(0, "Denis", "Ivanov");
        arrayUserTest[1] = new UserEntity(2, "Denis1", "Ivanov1");
        arrayUserTest[2] = new UserEntity(3, "Denis2", "Ivanov2");
        arrayUserTest[3] = new UserEntity(4, "Denis3", "Ivanov3");
        arrayUserTest[4] = new UserEntity(5, "Denis4", "Ivanov4");
        arrayUserTest[5] = new UserEntity(6, "Denis5", "Ivanov5");
        arrayUserTest[6] = new UserEntity(7, "Denis6", "Ivanov6");
        arrayUserTest[7] = new UserEntity(8, "Denis7", "Ivanov7");
        arrayUserTest[8] = new UserEntity(9, "Denis8", "Ivanov8");
        arrayUserTest[9] = new UserEntity(10, "Denis9", "Ivanov9");
        int userIdTest = 10;
        String nameUserTest = "Ivan";
        String surNameTest = "Ivanov";
        userEntity = userEntity.redactionUserName(arrayUserTest, userIdTest, nameUserTest, surNameTest);
        if (userEntity.id == userIdTest && userEntity.name.equalsIgnoreCase(nameUserTest) && userEntity.surname.equalsIgnoreCase(surNameTest)) {
            checkTestResult(true, "Тест на редактирование пользователя: ");
        } else checkTestResult(false, "Тест на редактирование пользователя: ");
    }

    void redactionUserNameTestOne() {
        UserEntity arrayUserTest[] = new UserEntity[10];
        UserEntity userEntity = new UserEntity();
        arrayUserTest[0] = new UserEntity(1, "Denis", "Ivanov");
        arrayUserTest[1] = new UserEntity(2, "Denis1", "Ivanov1");
        arrayUserTest[2] = new UserEntity(3, "Denis2", "Ivanov2");
        arrayUserTest[3] = new UserEntity(4, "Denis3", "Ivanov3");
        arrayUserTest[4] = new UserEntity(5, "Denis4", "Ivanov4");
        arrayUserTest[5] = new UserEntity(6, "Denis5", "Ivanov5");
        arrayUserTest[6] = new UserEntity(7, "Denis6", "Ivanov6");
        arrayUserTest[7] = new UserEntity(8, "Denis7", "Ivanov7");
        arrayUserTest[8] = new UserEntity(9, "Denis8", "Ivanov8");
        arrayUserTest[9] = new UserEntity(10, "Denis9", "Ivanov9");

        int userIdTest = 11;
        String nameUserTest = "Ivan";
        String surNameTest = "Ivanov";
        userEntity = userEntity.redactionUserName(arrayUserTest, userIdTest, nameUserTest, surNameTest);
        if (userEntity == null) {
            checkTestResult(true, "Тест на редактирование пользователя (пользователя с таким ID не найдено): ");
        } else checkTestResult(false, "Тест на редактирование пользователя (пользователя с таким ID не найдено): ");
    }

    void deleteUserIdTest() {
        UserEntity arrayUserTest[] = new UserEntity[10];
        UserEntity userEntity = new UserEntity();
        arrayUserTest[0] = new UserEntity(1, "Denis", "Ivanov");
        arrayUserTest[1] = new UserEntity(2, "Denis1", "Ivanov1");
        arrayUserTest[2] = new UserEntity(3, "Denis2", "Ivanov2");
        arrayUserTest[3] = new UserEntity(4, "Denis3", "Ivanov3");
        arrayUserTest[4] = new UserEntity(5, "Denis4", "Ivanov4");
        arrayUserTest[5] = new UserEntity(6, "Denis5", "Ivanov5");
        arrayUserTest[6] = new UserEntity(7, "Denis6", "Ivanov6");
        arrayUserTest[7] = new UserEntity(8, "Denis7", "Ivanov7");
        arrayUserTest[8] = new UserEntity(9, "Denis8", "Ivanov8");
        arrayUserTest[9] = new UserEntity(10, "Denis9", "Ivanov9");
        int userIdTest = 10;
        if (userEntity.deleteUserId(arrayUserTest, userIdTest)) {
            checkTestResult(true, "Тест на удаление пользователя: ");
        } else checkTestResult(false, "Тест на удаление пользователя: ");
    }

    void deleteUserIdTestOne() {
        UserEntity arrayUserTest[] = new UserEntity[10];
        UserEntity userEntity = new UserEntity();
        arrayUserTest[0] = new UserEntity(1, "Denis", "Ivanov");
        arrayUserTest[1] = new UserEntity(2, "Denis1", "Ivanov1");
        arrayUserTest[2] = new UserEntity(3, "Denis2", "Ivanov2");
        arrayUserTest[3] = new UserEntity(4, "Denis3", "Ivanov3");
        arrayUserTest[4] = new UserEntity(5, "Denis4", "Ivanov4");
        arrayUserTest[5] = new UserEntity(6, "Denis5", "Ivanov5");
        arrayUserTest[6] = new UserEntity(7, "Denis6", "Ivanov6");
        arrayUserTest[7] = new UserEntity(8, "Denis7", "Ivanov7");
        arrayUserTest[8] = new UserEntity(9, "Denis8", "Ivanov8");
        arrayUserTest[9] = new UserEntity(10, "Denis9", "Ivanov9");

        int userIdTest = 12;
        if (userEntity.deleteUserId(arrayUserTest, userIdTest)) {
            checkTestResult(true, "Тест на удаление пользователя (пользователь с таким ID не найден): ");
        } else checkTestResult(false, "Тест на удаление пользователя (пользователь с таким ID не найден *FAIL*): ");
    }

    void printAllUserTest() {
        UserEntity arrayUserTest[] = new UserEntity[10];
        UserEntity userEntity = new UserEntity();
        arrayUserTest[0] = new UserEntity(1, "Denis", "Ivanov");
        arrayUserTest[1] = new UserEntity(2, "Denis1", "Ivanov1");
        arrayUserTest[2] = new UserEntity(3, "Denis2", "Ivanov2");
        arrayUserTest[3] = new UserEntity(4, "Denis3", "Ivanov3");
        arrayUserTest[4] = new UserEntity(5, "Denis4", "Ivanov4");
        arrayUserTest[5] = new UserEntity(6, "Denis5", "Ivanov5");
        arrayUserTest[6] = new UserEntity(7, "Denis6", "Ivanov6");
        arrayUserTest[7] = new UserEntity(8, "Denis7", "Ivanov7");
        arrayUserTest[8] = new UserEntity(9, "Denis8", "Ivanov8");
        arrayUserTest[9] = new UserEntity(10, "Denis9", "Ivanov9");

        int result = 10; // сколько строк будет напечатано (все не пустые ячейки массива)
        if (userEntity.printAllUser(arrayUserTest) == result) {
            checkTestResult(true, "Тест на вывод всех пользователей: ");
        } else checkTestResult(false, "Тест на вывод всех пользователей: ");
    }

    void printUserIdTest() {
        UserEntity arrayUserTest[] = new UserEntity[10];
        UserEntity userEntity = new UserEntity();
        arrayUserTest[0] = new UserEntity(1, "Denis", "Ivanov");
        arrayUserTest[1] = new UserEntity(2, "Denis1", "Ivanov1");
        arrayUserTest[2] = new UserEntity(3, "Denis2", "Ivanov2");
        arrayUserTest[3] = new UserEntity(4, "Denis3", "Ivanov3");
        arrayUserTest[4] = new UserEntity(5, "Denis4", "Ivanov4");
        arrayUserTest[5] = new UserEntity(6, "Denis5", "Ivanov5");
        arrayUserTest[6] = new UserEntity(7, "Denis6", "Ivanov6");
        arrayUserTest[7] = new UserEntity(8, "Denis7", "Ivanov7");
        arrayUserTest[8] = new UserEntity(9, "Denis8", "Ivanov8");
        arrayUserTest[9] = new UserEntity(10, "Denis9", "Ivanov9");

        int userIdTest = 1;
        String nameUserTest = "Denis";
        String surNameTest = "Ivanov";
        userEntity = userEntity.printUserId(arrayUserTest, userIdTest);
        if (userEntity.id == userIdTest && userEntity.name.equalsIgnoreCase(nameUserTest) && userEntity.surname.equalsIgnoreCase(surNameTest)) {
            checkTestResult(true, "Тест на вывод пользователя по ID: ");
        } else checkTestResult(false, "Тест на вывод пользователя по ID: ");
    }

    void printUserIdTestOne() {
        UserEntity arrayUserTest[] = new UserEntity[10];
        UserEntity userEntity = new UserEntity();
        arrayUserTest[0] = new UserEntity(1, "Denis", "Ivanov");
        arrayUserTest[1] = new UserEntity(2, "Denis1", "Ivanov1");
        arrayUserTest[2] = new UserEntity(3, "Denis2", "Ivanov2");
        arrayUserTest[3] = new UserEntity(4, "Denis3", "Ivanov3");
        arrayUserTest[4] = new UserEntity(5, "Denis4", "Ivanov4");
        arrayUserTest[5] = new UserEntity(6, "Denis5", "Ivanov5");
        arrayUserTest[6] = new UserEntity(7, "Denis6", "Ivanov6");
        arrayUserTest[7] = new UserEntity(8, "Denis7", "Ivanov7");
        arrayUserTest[8] = new UserEntity(9, "Denis8", "Ivanov8");
        arrayUserTest[9] = new UserEntity(10, "Denis9", "Ivanov9");

        int userIdTest = 11;
        if (userEntity.printUserId(arrayUserTest, userIdTest) == null) {
            checkTestResult(true, "Тест на вывод пользователя по ID (пользователь с таким ID отсутствует): ");
        } else checkTestResult(false, "Тест на вывод пользователя по ID (пользователь с таким ID отсутствует): ");
    }

    void printUserNameTest() {
        UserEntity arrayUserTest[] = new UserEntity[10];
        UserEntity userEntity = new UserEntity();
        arrayUserTest[0] = new UserEntity(1, "Denis6", "Ivanov");
        arrayUserTest[1] = new UserEntity(2, "Denis6", "Ivanov1");
        arrayUserTest[2] = new UserEntity(3, "Denis6", "Ivanov2");
        arrayUserTest[3] = new UserEntity(4, "Denis63", "Ivanov3");
        arrayUserTest[4] = new UserEntity(5, "Denis4", "Ivanov4");
        arrayUserTest[5] = new UserEntity(6, "Denis5", "Ivanov5");
        arrayUserTest[6] = new UserEntity(7, "Denis6", "Ivanov6");
        arrayUserTest[7] = new UserEntity(8, "Denis7", "Ivanov7");
        arrayUserTest[8] = new UserEntity(9, "Denis86", "Ivanov8");
        arrayUserTest[9] = new UserEntity(10, "Denis9", "Ivanov9");

        String userSearchTest = "Denis6";
        int resultCount = 4; // сколько пользователей найдено в списке с именем "Denis6"
        if (userEntity.printUserName(arrayUserTest, userSearchTest) == resultCount) {
            checkTestResult(true, "Тест на вывод пользователя по имени: ");
        } else checkTestResult(false, "Тест на вывод пользователя по имени: ");
    }

    void printUserNameTestOne() {
        UserEntity arrayUserTest[] = new UserEntity[10];
        UserEntity userEntity = new UserEntity();
        arrayUserTest[0] = new UserEntity(1, "Denis6", "Ivanov");
        arrayUserTest[1] = new UserEntity(2, "Denis6", "Ivanov1");
        arrayUserTest[2] = new UserEntity(3, "Denis6", "Ivanov2");
        arrayUserTest[3] = new UserEntity(4, "Denis63", "Ivanov3");
        arrayUserTest[4] = new UserEntity(5, "Denis4", "Ivanov4");
        arrayUserTest[5] = new UserEntity(6, "Denis5", "Ivanov5");
        arrayUserTest[6] = new UserEntity(7, "Denis6", "Ivanov6");
        arrayUserTest[7] = new UserEntity(8, "Denis7", "Ivanov7");
        arrayUserTest[8] = new UserEntity(9, "Denis86", "Ivanov8");
        arrayUserTest[9] = new UserEntity(10, "Denis9", "Ivanov9");

        String userSearchTest = "Denis644";
        int resultCount = 0; // сколько пользователей найдено в списке с именем "Denis6"
        if (userEntity.printUserName(arrayUserTest, userSearchTest) == resultCount) {
            checkTestResult(true, "Тест на вывод пользователя по имени (пользователь с таким именем отсутствует): ");
        } else
            checkTestResult(false, "Тест на вывод пользователя по имени (пользователь с таким именем отсутствует): ");
    }

    void createUserTest() {
        UserEntity userEntity = new UserEntity();
        int idTest = 1;
        String userNameTest = "Denis644";
        String userSurNameTest = "Ivanov";
        userEntity = userEntity.createUser(userNameTest, userSurNameTest);
        if (userEntity.id == idTest && userEntity.name.equalsIgnoreCase(userNameTest) && userEntity.surname.equalsIgnoreCase(userSurNameTest)) {
            checkTestResult(true, "Тест на создание пользователя: ");
        } else
            checkTestResult(false, "Тест на создание пользователя: ");
    }

    void createUserTestOne() {
        UserEntity userEntity = new UserEntity();
        String userNameTest = "Denis644";
        String userSurNameTest = "Ivanov";
        userEntity.createUser(userNameTest, userSurNameTest);
        userEntity.createUser(userNameTest, userSurNameTest);
        userEntity.createUser(userNameTest, userSurNameTest);
        userEntity.createUser(userNameTest, userSurNameTest);
        userEntity.createUser(userNameTest, userSurNameTest);
        userEntity.createUser(userNameTest, userSurNameTest);
        userEntity.createUser(userNameTest, userSurNameTest);
        userEntity.createUser(userNameTest, userSurNameTest);
        userEntity.createUser(userNameTest, userSurNameTest);
        userEntity.createUser(userNameTest, userSurNameTest);
        userEntity = userEntity.createUser(userNameTest, userSurNameTest);
        if (userEntity == null) {
            checkTestResult(true, "Тест на создание пользователя (список полон, нет места для добавления): ");
        } else
            checkTestResult(false, "Тест на создание пользователя(список полон, нет места для добавления): ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}