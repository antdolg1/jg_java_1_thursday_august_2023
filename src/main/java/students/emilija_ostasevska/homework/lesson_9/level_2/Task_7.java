package students.emilija_ostasevska.homework.lesson_9.level_2;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }
}

class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super(name); // вызов конструктора родительского класса Player
    }
}

