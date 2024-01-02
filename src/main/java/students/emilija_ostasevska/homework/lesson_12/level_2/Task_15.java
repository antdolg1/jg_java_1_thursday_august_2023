package students.emilija_ostasevska.homework.lesson_12.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public boolean hasSearchClientsRole() {
        return roles.contains(Role.CAN_SEARCH_CLIENTS);
    }
}

class AccessDeniedException extends Exception {
    public AccessDeniedException(String message) {
        super(message);
    }
}

class BankClient {
    private String uid;
    private String fullName;

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }
}

interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}

class BankApiImpl implements BankApi {
    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        if (!credentials.hasSearchClientsRole()) {
            throw new AccessDeniedException("Access denied. User does not have the required role to search clients.");
        }

        return clients.stream()
                .filter(client -> client.getUid().equals(uid))
                .findFirst();
    }
}

class Main {
    public static void main(String[] args) {

        UserCredentials credentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS));

        BankApiImpl bankApi = new BankApiImpl(List.of(
                new BankClient("123", "John Doe"),
                new BankClient("456", "Jane Doe")
        ));

        try {
            Optional<BankClient> foundClient = bankApi.findByUid(credentials, "123");

            foundClient.ifPresent(client -> System.out.println("Found client: " + client.getFullName()));
        } catch (AccessDeniedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
