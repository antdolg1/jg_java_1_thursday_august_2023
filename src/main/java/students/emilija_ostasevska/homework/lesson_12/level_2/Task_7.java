package students.emilija_ostasevska.homework.lesson_12.level_2;

import java.util.List;

enum Role {
    CAN_SEARCH_CLIENTS
}

// Интерфейс для Bank API
interface BankApi {
    // Метод для поиска клиентов в базе данных банка
    List<Client> searchClients(User user, String query);
}

class Client {
    // Поля клиента, например, ID, имя, баланс и так далее
}

// Класс пользователя с ролями
class User {
    private List<Role> roles;

    public User(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }
}

// Реализация Bank API
class BankDatabase implements BankApi {
    private List<Client> clientDatabase;

    // Конструктор, инициализирующий базу данных
    public BankDatabase(List<Client> clientDatabase) {
        this.clientDatabase = clientDatabase;
    }

    @Override
    public List<Client> searchClients(User user, String query) {
        if (user.getRoles().contains(Role.CAN_SEARCH_CLIENTS)) {
            // Просто возвращаем пустой список
            return clientDatabase;
        } else {
            // Если у пользователя нет необходимой роли, выбрасываем ошибку
            throw new SecurityException("User does not have the required role to search clients.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Пример использования Bank API

        // Создаем пользователя с ролью CAN_SEARCH_CLIENTS
        User user = new User(List.of(Role.CAN_SEARCH_CLIENTS));

        // Создаем экземпляр базы данных
        BankDatabase bankDatabase = new BankDatabase(List.of(new Client(), new Client(), new Client()));

        // Пользователь выполняет поиск клиентов
        List<Client> searchResult = bankDatabase.searchClients(user, "query");

        // Вывод результата
        System.out.println("Search result: " + searchResult);
    }
}

