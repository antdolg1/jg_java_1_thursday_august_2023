package students.kristina_konovalchuk.homework.lesson_12.level2;

import java.nio.file.AccessDeniedException;
import java.util.Optional;

public class Task_9 {
    static class BankClient {
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
        Optional<BankClient> findByUid(Task_8.UserCredentials credentials, String uid) throws Exception,
                AccessDeniedException;
    }
}
