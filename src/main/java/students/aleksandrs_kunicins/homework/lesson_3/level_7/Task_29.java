package students.aleksandrs_kunicins.homework.lesson_3.level_7;

import java.time.LocalDate; //Хочу добавить эту библиотеку, для объекта айфон, чтобы когда я включал телефон, мне показовало реальное время и дату
import java.time.LocalTime;

class Iphone{
    int model;
    String color;
    int memory;
    String version;
    void turnOn(){
        LocalTime time = LocalTime.now();
        System.out.println("Current time in Riga is " + time);
    }
    void turnOff(){
        System.out.println("Turning off .");
        System.out.println("Turning off ..");
        System.out.println("Turning off ...");
    }
    void showCurrentDate(){
        LocalDate date = LocalDate.now();
        System.out.println("Current date is : " + date);
    }
    void showSpecifications(){
        System.out.println("Model : Iphone " + model + " "+ version);
        System.out.println("Color : " + color);
        System.out.println("Memory : " + memory);
    }
    Iphone(int model,String color,int memory,String version){
        this.model = model;
        this.color = color;
        this.memory = memory;
        this.version = version;
    }
}

class DemoIphone{
    public static void main(String[] args) {
        Iphone myPhone = new Iphone(11, "Bright Green", 128,"Pro");
        myPhone.turnOn();
        myPhone.turnOff();
        myPhone.showCurrentDate();
        myPhone.showSpecifications();
    }
}