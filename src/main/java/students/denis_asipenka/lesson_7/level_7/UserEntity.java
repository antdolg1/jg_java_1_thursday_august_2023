package students.denis_asipenka.lesson_7.level_7;

public class UserEntity {
    public UserEntity(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public UserEntity() {
    }

    public int id;
    public String name;
    public String surname;
    int stringArray = 0;


    public UserEntity createUser(String testNameUser, String surNameUserTest) {
        this.id += 1;
        if (this.id <= 10) {
            UserEntity user = new UserEntity(id, testNameUser, surNameUserTest);
            stringArray += 1;
            return user;
        } else {
            return null;
        }
    }

    public int printUserName(UserEntity arrayUserTest[], String userNameTest) {
        int count = 0;
        for (int i = 0; i <= 9; i++) {
            if (arrayUserTest[i] != null) {
                if (arrayUserTest[i].name.equalsIgnoreCase(userNameTest)) {
                    count += 1;
                }
            }
        }
        return count;
    }

    public UserEntity printUserId(UserEntity arrayUserTest[], int userIdTest) {
        for (int i = 0; i <= 9; i++) {
            if (arrayUserTest[i] != null) {
                if (arrayUserTest[i].id == userIdTest) {
                    return arrayUserTest[i];
                }
            }
        }
        return null;
    }

    public int printAllUser(UserEntity arrayUserTest[]) {
        int count = 0;
        for (int i = 0; i <= 9; i++) {
            if (arrayUserTest[i] != null) {
                count += 1;
            }
        }
        return count;
    }

    public boolean deleteUserId(UserEntity arrayUserTest[], int userIdTest) {
        for (int i = 0; i <= 9; i++) {
            if (arrayUserTest[i] != null) {
                if (arrayUserTest[i].id == userIdTest) {
                    return true;
                }
            }
        }
        return false;
    }

    public UserEntity redactionUserName(UserEntity arrayUserTest[], int userIdTest, String nameUserTest, String surNameTest) {
        for (int count = 0; count <= 9; count++) {
            if (arrayUserTest[count] != null) {
                if (arrayUserTest[count].id == userIdTest) {
                    return new UserEntity(userIdTest, nameUserTest, surNameTest);
                }
            }
        }
        return null;
    }
}