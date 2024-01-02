package students.emilija_ostasevska.homework.lesson_12.level_2;

import java.util.List;

enum Role {
    CAN_SEARCH_CLIENTS
}

class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }
}

interface BankApi {
    List<Client> searchClients(UserCredentials credentials, String query);
}

class Client {

}

class BankDatabase implements BankApi {

    private List<Client> clientDatabase;

    public BankDatabase(List<Client> clientDatabase) {
        this.clientDatabase = clientDatabase;
    }

    @Override
    public List<Client> searchClients(UserCredentials credentials, String query) {
        if (credentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS)) {
            return clientDatabase;
        } else {
            throw new SecurityException("User does not have the required role to search clients.");
        }
    }
}

class Main {
    public static void main(String[] args) {

        UserCredentials credentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS));

        BankDatabase bankDatabase = new BankDatabase(List.of(new Client(), new Client(), new Client()));

        List<Client> searchResult = bankDatabase.searchClients(credentials, "query");

        System.out.println("Search result: " + searchResult);
    }
}
