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

    public boolean hasRole(Role role) {
        return roles.contains(role);
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

class AccessDeniedException extends Exception {
    public AccessDeniedException(String message) {
        super(message);
    }
}

class BankApiImpl implements BankApi {
    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        if (!credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException("Access denied. User does not have the required role to search clients.");
        }

        return clients.stream()
                .filter(client -> client.getUid().equals(uid))
                .findFirst();
    }
}

