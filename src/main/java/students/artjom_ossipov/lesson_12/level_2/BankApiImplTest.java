package students.artjom_ossipov.lesson_12.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankApiImplTest {
    public static void main(String[] args) throws AccessDeniedException {
        BankApiImplTest test = new BankApiImplTest();
        test.findByIdTest();
        test.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
    }

    void findByIdTest() throws AccessDeniedException {
        BankClient client1 = new BankClient("1", "ivanov ivan");
        BankClient client2 = new BankClient("2", "ivanov Boris");
        BankClient client3 = new BankClient("3", "ivanov Denis");
        BankClient client4 = new BankClient("4", "ivanov Kirill");
        BankClient client5 = new BankClient("5", "ivanov Petr");
        BankClient client6 = new BankClient("6", "ivanov Agafja");
        List<BankClient> listBankClient = new ArrayList<>();
        listBankClient.add(client1);
        listBankClient.add(client2);
        listBankClient.add(client3);
        listBankClient.add(client4);
        listBankClient.add(client5);
        listBankClient.add(client6);
        List<Role> listRole = new ArrayList<>();
        listRole.add(Role.CAN_SEARCH_CLIENTS);
        BankApiImpl bankApi = new BankApiImpl(listBankClient);
        Optional<BankClient> result = Optional.of(client5);
        checkResult(bankApi.findByUid(new UserCredentials(listRole), "5").equals(result), "Тест на нахождение пользователя в базе данных банка: ");
    }

    void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> listBankClient = new ArrayList<>();
        BankApiImpl bankApi = new BankApiImpl(listBankClient);
        List<Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);
        try {
            bankApi.findByUid(credentials, "5");
            System.out.println("Тест на выбрасывание ошибки: = FAIL!");
        } catch (AccessDeniedException e) {
            System.out.println("Тест на выбрасывание ошибки: = OK!");
        }
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
