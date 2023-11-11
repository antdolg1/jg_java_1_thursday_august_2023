package students.anastassia_iljina.lesson_3.homework.level_5.task_22;

class Dog {
    public String name;
    public String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void voice() {
        System.out.println(name);
        System.out.println(color);
    }

    void changeColor(String newColor) {
        this.color = newColor;
    }
}
