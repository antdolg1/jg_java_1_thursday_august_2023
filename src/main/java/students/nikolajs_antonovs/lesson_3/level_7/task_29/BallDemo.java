package students.nikolajs_antonovs.lesson_3.level_7.task_29;

public class BallDemo {
    public static void main(String[] args) {
        Ball ball = new Ball("basketball", "bouncing");
        String sportType = ball.getGetSportType();
        System.out.println("This ball is " + sportType);

        String state = ball.getState();
        System.out.println("This " + sportType + "is " + state);
    }

}
