package students.emilija_ostasevska.homework.lesson_12.level_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThrows;

class BankApiImplTest {

    @Test
    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> clients = new ArrayList<>();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList<>();
        UserCredentials credentials = new UserCredentials(roles);

        // Используем assertThrows для проверки, что ожидаемое исключение было выброшено
        AccessDeniedException exception = assertThrows(AccessDeniedException.class, () -> {
            api.findByUid(credentials, "1234");
        });

        // Теперь вы можете добавить дополнительные проверки для сообщения ошибки и т. д.
        // Например:
        // assertEquals("Expected error message", exception.getMessage());
    }
}

