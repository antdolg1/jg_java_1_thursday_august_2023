package students.artjom_ossipov.lesson_12.level_2;

import java.util.List;

public class UserCredentials {
    public List<Role> getRoles() {
        return roles;
    }
    private List<Role> roles;
    public boolean hasRole(Role role) {
        return roles.contains(role);
    }
    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }
}
