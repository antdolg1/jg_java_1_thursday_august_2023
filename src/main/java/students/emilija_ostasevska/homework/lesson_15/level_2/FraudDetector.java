package students.emilija_ostasevska.homework.lesson_15.level_2;

class FraudDetector {

    public boolean isFraud(Trader trader) {
        return isPokemonTrader(trader) || isBlockedCity(trader);
    }

    private boolean isPokemonTrader(Trader trader) {
        String traderName = trader.getFullName();
        return traderName.equals("Pokemon");
    }

    private boolean isBlockedCity(Trader trader) {
        String cityName = trader.getCity();
        return cityName.equals("Sidney");
    }
}
