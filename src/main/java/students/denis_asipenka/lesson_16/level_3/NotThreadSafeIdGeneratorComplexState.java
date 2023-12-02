package students.denis_asipenka.lesson_16.level_3;

public class NotThreadSafeIdGeneratorComplexState extends Thread {
    private int id;
    private boolean even;

    public int nextId() {
        id++;
        this.even = isEven(id);
        return id;
    }

    public boolean isEven() {
        return this.even;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            int id2 = nextId();
            boolean isEven = isEven();
            if ((id2 % 2 == 0 && !isEven) || (id2 % 2 != 0 && isEven)) {
                System.out.println("Number ID : " + id2 + "  " + isEven);
            }
        }
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}