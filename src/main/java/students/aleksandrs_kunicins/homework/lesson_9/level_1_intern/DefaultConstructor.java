package students.aleksandrs_kunicins.homework.lesson_9.level_1_intern;

public class DefaultConstructor {
    public DefaultConstructor() {
    }
}

class DefaultConstructorDemo {
    public static void main(String[] args) {
        DefaultConstructor constructor = new DefaultConstructor();
        constructor.getClass();// ЭТА СТРОЧКА НУЖНА ЧТОБЫ У МЕНЯ ЖЁЛТЫМ ЦВЕТОМ НЕ ПОДКЧЁРКИВАЛСЯ CONSTRUCTOR,
                               // ЕЁ МОЖНО УБРАТЬ
    }
}