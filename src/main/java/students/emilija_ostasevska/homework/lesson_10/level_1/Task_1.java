package students.emilija_ostasevska.homework.lesson_10.level_1;

// Интерфейс JavaStarLoginService
interface JavaStarLoginService {

    boolean canLogin(String login, String password);

}

// Класс JavaStarLoginServiceImpl реализует интерфейс JavaStarLoginService
class JavaStarLoginServiceImpl implements JavaStarLoginService {

    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }

}

// Пример использования интерфейса и класса
class Demo {
    public static void main(String[] args) {
        JavaStarLoginService loginService = new JavaStarLoginServiceImpl();
        
        // Вызываем метод canLogin через интерфейс
        boolean result = loginService.canLogin("javastar", "pass");
        
        System.out.println("Login successful: " + result);
    }
}

