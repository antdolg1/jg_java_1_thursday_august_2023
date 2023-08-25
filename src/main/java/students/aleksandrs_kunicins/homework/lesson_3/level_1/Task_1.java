package students.aleksandrs_kunicins.homework.lesson_3.level_1;

class Robot{                                //Создаём класс Robot
    public void sayHello(){                 //Создём новую функцию
        System.out.print("Hello!");         //Пишем что должна делать это функция
    }
    public static void main(String[] args){ 
        Robot robot = new Robot();          // В переменную robot вы засовываем новый класс
        robot.sayHello();                   //Просим выполнить функцию sayHello из класса robot
    }
}
