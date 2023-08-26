package students.aleksandrs_kunicins.homework.lesson_3.level_5.task_18;

class Dog{
     String dogName;
     Dog(String dogName){
        this.dogName = dogName;
    }
    void voice(){
        System.out.println(dogName + dogName + dogName);
    }
}


     class DogDemo{
       public static void main(String[] args) {
            Dog myDogy = new Dog("Дружок ");
            myDogy.voice();
        }
     }
 
