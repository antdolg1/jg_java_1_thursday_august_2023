package students.julija_pilenkova.homework.lesson_3.level_7.Task_29;

import java.util.Date;

class Phone {

    public String model;
    public String color;
    public int memory;

    Phone(String phoneModel, String phoneColor, int memory){
        this.model = phoneModel;
        this.color = phoneColor;
        this.memory = memory;
    }

    void phoneInfo(){

        System.out.print("Model: " + model + "\n Color : " + color + "\n Memory: " + memory );

    }

    void incommingCall(){
        System.out.println("\n Bzz Bzz Bzz");
    }

    void newMessage(){
        System.out.println("New message!");
    }

    void time (){
        Date date = new Date();
        System.out.println(date);
    }

}

class PhoneDemo{

    public static void main(String[] args) {

        Phone myPhone = new Phone("Samsung", "White", 128);

        myPhone.phoneInfo();
        myPhone.incommingCall();
        myPhone.newMessage();
        myPhone.time();






    }

}
