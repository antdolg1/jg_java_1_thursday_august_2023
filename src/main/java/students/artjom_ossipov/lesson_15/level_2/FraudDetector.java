package students.artjom_ossipov.lesson_15.level_2;

public class FraudDetector {
    public boolean isFraud(Trader trader) {
        return (detectingFraudulentTraderByName(trader) || comparisonOfTradersCityAndCityBlockedForTrading(trader));
    }

    private boolean detectingFraudulentTraderByName(Trader trader) {
        return trader.getFullName().equals("Pokemon");
    }

    private boolean comparisonOfTradersCityAndCityBlockedForTrading(Trader trader) { // я бы еще город подавал отдельным параметром, или даже списком, ибо города в которых будут проверяться явно будут увеличиваться и имена тоже
        return trader.getCity().equals("Sidney");
    }
}
