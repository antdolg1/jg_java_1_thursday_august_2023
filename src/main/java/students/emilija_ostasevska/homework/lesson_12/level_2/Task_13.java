import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

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
        if (!credentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException();
        }
        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }
}

class BankApiImplTest {

    @Test
    void testFindByUidSuccess() throws AccessDeniedException {
        List<BankClient> clients = List.of(
                new BankClient("123", "John Doe"),
                new BankClient("456", "Jane Doe")
        );
        BankApi bankApi = new BankApiImpl(clients);
        UserCredentials credentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS));

        Optional<BankClient> result = bankApi.findByUid(credentials, "123");

        assertTrue(result.isPresent());
        assertEquals("John Doe", result.get().getFullName());
    }

    @Test
    void testFindByUidAccessDenied() {
        List<BankClient> clients = List.of(
                new BankClient("123", "John Doe"),
                new BankClient("456", "Jane Doe")
        );
        BankApi bankApi = new BankApiImpl(clients);
        UserCredentials credentials = new UserCredentials(List.of());

        assertThrows(AccessDeniedException.class, () -> bankApi.findByUid(credentials, "123"));
    }

    @Test
    void testFindByUidNotFound() throws AccessDeniedException {
        List<BankClient> clients = List.of(
                new BankClient("123", "John Doe"),
                new BankClient("456", "Jane Doe")
        );
        BankApi bankApi = new BankApiImpl(clients);
        UserCredentials credentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS));

        Optional<BankClient> result = bankApi.findByUid(credentials, "789");

        assertTrue(result.isEmpty());
    }
}
