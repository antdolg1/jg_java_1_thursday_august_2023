package students.anastassia_iljina.lesson_3.homework.level_7.task_29;

class Apple {
    String variety;
    int weight;
    String color;

    public Apple(String variety, int weight, String color) {
        this.variety = variety;
        this.weight = weight;
        this.color = color;
    }

    void infoAboutApple() {
        System.out.println("Сорт: " + variety);
        System.out.println("Вес: " + weight + " грамм");
        System.out.println("Цвет: " + color);
    }

}
