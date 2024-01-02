package students.emilija_ostasevska.homework.lesson_12.level_2;

class BankClient {

    private String uid;
    private String fullName;

    // Конструктор класса, принимающий значения свойств
    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    // Метод получения уникального идентификатора клиента
    public String getUid() {
        return uid;
    }

    // Метод получения полного имени клиента
    public String getFullName() {
        return fullName;
    }
}
