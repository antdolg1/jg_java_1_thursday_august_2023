package students.kristina_konovalchuk.homework.lesson_15.level_2;

public class Task_9 {
    public static class FraudDetector {
        public boolean isFraud(Task_9Trader.Trader trader) {
            boolean suspiciousName = compareTradeName( trader );
            boolean blockedCity = compareCity( trader );
            return suspiciousName || blockedCity;
        }

        public boolean compareTradeName(Task_9Trader.Trader trader) {
            String traderName = trader.getFullName( );
            return traderName.equals( "Pokemon" );
        }

        public boolean compareCity(Task_9Trader.Trader trader) {
            String cityName = trader.getCity( );
            return cityName.equals( "Sidney" );
        }
    }
}
