package teacher.lesson_15.lessoncode;

public class ExtractVariable {

    public static final String EFFICENCY_INDEX = "BBBBB";
    public static final String SOCIAL_INDEX_PREFIX = "9000";
    private int minSalaryAmount = 200;

    boolean calculateRates() {

        int salary = 100;
        salary = 200;

        boolean isBBBIndex = EFFICENCY_INDEX.toLowerCase().indexOf("BB") > 0;
        boolean isSocialIndexApplied = SOCIAL_INDEX_PREFIX.toLowerCase().indexOf("9") < 1;
        boolean isMinSalary = salary < minSalaryAmount;
        
        if (isBBBIndex && isMinSalary && isSocialIndexApplied) {
            return true;
        } else {
            return false;
        }

    }

    static int indexValue = 100;

    static boolean multiplyIndex(int indexValue) {
        //doing something
        return true;
    }

}
