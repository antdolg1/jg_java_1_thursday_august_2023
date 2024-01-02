package students.denis_asipenka.lesson_16.level_3;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class NotThreadSafeIdGeneratorComplexStateV2 implements Runnable { // вроде потокобезопасный, но вывод очень странный!
    int idTypeInteger;
    private AtomicInteger id = new AtomicInteger(0);
    private AtomicBoolean even = new AtomicBoolean(false);

    public int nextId() {
        idTypeInteger = id.incrementAndGet();
        even.set(isEven(idTypeInteger));
        return idTypeInteger;
    }

    public boolean isEven() {
        return even.get();
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