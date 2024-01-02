package students.artjom_ossipov.lesson_8.level_1_2;

class FraudDetector {

    boolean isFraud(String t) {
        String name = "Pokemon";
        if (t.equals(name)) {
            return false;
        } else {
            return true;
        }
    }
}
