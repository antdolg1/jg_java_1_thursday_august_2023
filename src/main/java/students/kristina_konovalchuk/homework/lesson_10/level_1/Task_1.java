package students.kristina_konovalchuk.homework.lesson_10.level_1;

public class Task_1 {
    public interface JavaStarLoginService {
        boolean canLogin(String login, String password);
    }

    public class JavaStarLoginServiceImpl implements JavaStarLoginService {
        public boolean canLogin(String login, String password) {
            return (login != null)
                    && login.equals( "javastar" )
                    && (password != null)
                    && password.equals( "pass" );
        }
    }
}
