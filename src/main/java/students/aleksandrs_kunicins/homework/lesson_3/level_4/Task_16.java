package students.aleksandrs_kunicins.homework.lesson_3.level_4;

class Car {

    String model;

    Car(String newModel) {
        this.model = newModel;
    }

    String getModel (){ //Круглая скобочка
        return this.model; //Точка с запятой
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}