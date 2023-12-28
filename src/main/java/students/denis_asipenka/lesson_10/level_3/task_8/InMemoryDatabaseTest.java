package students.denis_asipenka.lesson_10.level_3.task_8;

import java.util.Optional;

public class InMemoryDatabaseTest {
    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.dataBaseTest();
    }

    void dataBaseTest() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        inMemoryDatabase.save(new ProductDatabase.Product("Computer"));
        inMemoryDatabase.save(new ProductDatabase.Product("Computer1"));
        inMemoryDatabase.save(new ProductDatabase.Product("Computer2"));
        inMemoryDatabase.save(new ProductDatabase.Product("Computer3"));
        inMemoryDatabase.save(new ProductDatabase.Product("Computer4"));
        inMemoryDatabase.save(new ProductDatabase.Product("Computer5"));
        inMemoryDatabase.save(new ProductDatabase.Product("Computer6"));
        inMemoryDatabase.save(new ProductDatabase.Product("Computer7"));
        checkResult(Optional.ofNullable(inMemoryDatabase.findByTitle("Computer6")).isPresent(), "Тест на нулевое значение: ");
        checkResult(Optional.ofNullable(inMemoryDatabase.findByTitle("Computer655")).isPresent(), "Тест на нулевое значение: ");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}