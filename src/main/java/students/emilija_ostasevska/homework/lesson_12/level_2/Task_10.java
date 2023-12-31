package students.emilija_ostasevska.homework.lesson_12.level_2;

import java.util.Optional;
import java.util.List;

enum Role {
    CAN_SEARCH_CLIENTS
}

// Класс для представления прав доступа пользователя
class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }
}

// Класс для представления клиента
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

// Интерфейс для Bank API
interface BankApi {

    // Метод для поиска клиента по уникальному идентификатору
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws SecurityException;
}

// Реализация Bank API
class BankDatabase implements BankApi {

    private List<BankClient> clientDatabase;

    // Конструктор, инициализирующий базу данных
    public BankDatabase(List<BankClient> clientDatabase) {
        this.clientDatabase = clientDatabase;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws SecurityException {
        if (credentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS)) {
            return clientDatabase.stream()
                .filter(client -> client.getUid().equals(uid))
                .findFirst();
        } else {
            throw new SecurityException("User does not have the required role to search clients.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Пример использования Bank API

        // Создаем учетные данные пользователя с ролью CAN_SEARCH_CLIENTS
        UserCredentials credentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS));

        // Создаем экземпляр базы данных
        BankDatabase bankDatabase = new BankDatabase(List.of(new BankClient("123", "John Doe"),
                                                             new BankClient("456", "Jane Doe")));

        // Пользователь выполняет поиск клиента по UID
        Optional<BankClient> foundClient = bankDatabase.findByUid(credentials, "123");

        // Вывод результата
        foundClient.ifPresent(client -> System.out.println("Found client: " + client.getFullName()));
    }
}

