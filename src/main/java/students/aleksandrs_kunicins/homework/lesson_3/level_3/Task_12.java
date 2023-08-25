package students.aleksandrs_kunicins.homework.lesson_3.level_3;

        class Robot{
            String robotName;
             Robot(String robotName){
                this.robotName = robotName;
    }
    public void sayHello(){
        System.out.println("Hello!!!");
    }
    public void sayYourName(String robotName){
        System.out.println("Hello "+robotName);
    }

}
 class RobotDemo{
    public static void main(String[] args) {
        Robot robot1 = new Robot("R2D2");
        robot1.sayHello();
        robot1.sayYourName("R2D2");
        Robot robot2 = new Robot("C3PO");
        robot2.sayYourName("C3PO");
    }
}