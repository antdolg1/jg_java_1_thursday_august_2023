package students.kristina_konovalchuk.homework.lesson_12.level2;

import javax.management.relation.Role;
import java.util.List;

public class Task_8 {
    static class UserCredentials {
        private List<Role> roles;

        public UserCredentials(List<Role> roles) {
            this.roles = roles;
        }

        public UserCredentials(Task_7.Role role) {
        }

        public List<Role> getRoles() {
            return roles;
        }
    }
}
