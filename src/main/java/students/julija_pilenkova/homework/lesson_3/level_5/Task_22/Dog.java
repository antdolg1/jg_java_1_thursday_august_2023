package students.julija_pilenkova.homework.lesson_3.level_5.Task_22;

class Dog {

    public String name;
    public int age;
    public String color;

    Dog(String dogName, int dogAge, String dogColor) {
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }
    public void voice() {System.out.println(name + age + color);}


    public String newColor;


    public void changeColor() {System.out.println(name + age + newColor);}

}
