package students.artjom_ossipov.lesson_12.level_2;

import java.util.List;
import java.util.Optional;

public class BankApiImpl implements BankApi {

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    private List<BankClient> clients;

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        Optional<BankClient> searchClient = Optional.empty();
        if (!credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException("Отказано в доступе!");
        }
        for (BankClient bankClient : clients) {
            if (bankClient.getUid().equals(uid)) {
                searchClient = Optional.of(bankClient);
            }
        }
        return searchClient;
    }
}
