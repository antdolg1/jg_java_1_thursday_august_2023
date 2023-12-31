package students.emilija_ostasevska.homework.lesson_8.level_1_2;

public class FraudDetector {
    boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();

        if ("Pokemon".equals(trader.getName())) {
            return true;
        }
        return false;
    }
}
