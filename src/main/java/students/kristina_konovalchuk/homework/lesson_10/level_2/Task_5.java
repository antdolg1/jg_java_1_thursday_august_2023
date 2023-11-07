package students.kristina_konovalchuk.homework.lesson_10.level_2;

public class Task_5 {
    public class DayOfTheWeekDetectorDemo {
        private final Task_4.DayOfTheWeekDetector detector;

        public DayOfTheWeekDetectorDemo(Task_4.DayOfTheWeekDetector detector) {
            this.detector = detector;
        }

        public void run() {
        }

        public void main(String[] args) {
            Task_4.DayOfTheWeekDetector detector1 = new Task_4.DayOfTheWeekDetectorIfVersion( );
            Task_4.DayOfTheWeekDetector detector2 = new Task_4.DayOfTheWeekDetectorSwitch( );
            Task_4.DayOfTheWeekDetector detector3 = new Task_4.DayOfTheWeekDetectorArray( );

            DayOfTheWeekDetectorDemo demo1 = new DayOfTheWeekDetectorDemo( detector1 );
            DayOfTheWeekDetectorDemo demo2 = new DayOfTheWeekDetectorDemo( detector2 );
            DayOfTheWeekDetectorDemo demo3 = new DayOfTheWeekDetectorDemo( detector3 );

            demo1.run( );
            demo2.run( );
            demo3.run( );
        }
    }

}
