package students.emilija_ostasevska.homework.lesson_12.level_2;
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

class BankDatabase implements BankApi {
    private List<BankClient> clientDatabase;

    public BankDatabase(List<BankClient> clientDatabase) {
        this.clientDatabase = clientDatabase;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        if (credentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS)) {

            return clientDatabase.stream()
                    .filter(client -> client.getUid().equals(uid))
                    .findFirst();
        } else {
            throw new AccessDeniedException("Access denied. User does not have the required role to search clients.");
        }
    }
}

class Main {
    public static void main(String[] args) {

        UserCredentials credentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS));

        BankDatabase bankDatabase = new BankDatabase(List.of(new BankClient("123", "John Doe"),
                                                             new BankClient("456", "Jane Doe")));

        try {
            Optional<BankClient> foundClient = bankDatabase.findByUid(credentials, "123");

            foundClient.ifPresent(client -> System.out.println("Found client: " + client.getFullName()));
        } catch (AccessDeniedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}