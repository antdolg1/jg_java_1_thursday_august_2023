package students.julija_pilenkova.homework.lesson_3.level_4;

public class Phone {

    String model;

         Phone(String newModel) {  //изменила имя объекта которого мы вызываем
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
