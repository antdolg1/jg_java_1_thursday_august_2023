package teacher.lesson_15.lessoncode;

public class InlineMethod {
    
    int age = 20;
    
    String registerForDrivingExamTernaryVersion(int age) {
        return isAdult(age) ? "You are allowed to register for driving test" : "Registration for driving test is allowed only for adults";
    }

    private static boolean isAdult(int age) {
        return age >= 18;
    }

//    String registerForDrivingExam(int age) {
//        if (isAllowedToDrive(age)) {
//            return "You are allowed to register for driving test";
//        } else {
//            return "Registration for driving test is allowed only for adults";
//        }
//    }
    
//    boolean isAllowedToDrive(int age) {
//        return age >= 18;
//    }
    
}
