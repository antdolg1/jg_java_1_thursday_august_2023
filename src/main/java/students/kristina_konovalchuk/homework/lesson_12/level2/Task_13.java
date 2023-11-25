package students.kristina_konovalchuk.homework.lesson_12.level2;

import java.nio.file.AccessDeniedException;
import java.util.List;
import java.util.Optional;

public class Task_13 {
    private Task_9.BankClient[] clients;

    abstract class BankApiImpl implements Task_9.BankApi {
        private List<Task_9.BankClient> clients;

        public BankApiImpl(List<Task_9.BankClient> clients) {
            this.clients = clients;
        }
    }

    public Optional<Task_9.BankClient> findByUid(Task_8.UserCredentials credentials, String uid) throws
            AccessDeniedException {
        if (!credentials.getRoles( ).contains( Task_7.Role.CAN_SEARCH_CLIENTS )) {
            throw new AccessDeniedException( );
        }
        for (Task_9.BankClient client : clients) {
            if (client.getUid( ).equals( uid )) {
                return Optional.of( client );
            }
        }
        return Optional.empty( );
    }
}

