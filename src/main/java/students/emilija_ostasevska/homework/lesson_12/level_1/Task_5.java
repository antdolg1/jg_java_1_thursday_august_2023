package students.emilija_ostasevska.homework.lesson_12.level_1;

class ExceptionDemo {

    public static void main(String[] args) {
        try {
            // Способ 1: Создание экземпляра Exception без сообщения
            throw new Exception();

        } catch (Exception e) {
            System.out.println("Способ 1: Поймано исключение без сообщения");
            e.printStackTrace();
        }

        try {
            // Способ 2: Создание экземпляра Exception с сообщением
            throw new Exception("Это сообщение об ошибке");

        } catch (Exception e) {
            System.out.println("\nСпособ 2: Поймано исключение с сообщением");
            e.printStackTrace();
        }

        try {
            // Способ 3: Создание экземпляра Exception с предыдущим исключением в качестве причины
            try {
                throw new RuntimeException("Предыдущее исключение");
            } catch (RuntimeException cause) {
                throw new Exception("Исключение с причиной", cause);
            }

        } catch (Exception e) {
            System.out.println("\nСпособ 3: Поймано исключение с причиной");
            e.printStackTrace();
        }
    }
}