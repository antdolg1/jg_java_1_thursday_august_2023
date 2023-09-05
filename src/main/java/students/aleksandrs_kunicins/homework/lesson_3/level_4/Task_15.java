package students.aleksandrs_kunicins.homework.lesson_3.level_4;

class Phone {

    String model; //Лищняя Скобочка

    Phone(String newModel) { // Book -> Phone
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }

}

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}