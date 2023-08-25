package students.aleksandrs_kunicins.homework.lesson_3.level_3;

public class Task_13{
    public class Robot{
        public String robotName;
        public Robot(String robotName){
            this.robotName = robotName;
        }
        public void sayHello(){
            System.out.println("My name is : "+robotName);
        }
    
    }

    class RobotDemo{
        public static void main(String[] args) {
            Robot robot = new Robot("Anton");
            robot.sayHello();
        }
    }
} 
