package students.aleksandrs_kunicins.homework.lesson_3.level_3;
//Task_13

     class Robot{
        public String robotName;
        public Robot(String robotName){
            this.robotName = robotName;
        }
        public void sayHello(){
            System.out.println("My name is : "+robotName);
        }
    
    }

    public class RobotDemo{
        public static void main(String[] args) {
            Robot robot = new Robot("Anton");
            robot.sayHello();
        }
    }

