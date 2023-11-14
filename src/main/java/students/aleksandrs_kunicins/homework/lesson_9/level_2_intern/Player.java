package students.aleksandrs_kunicins.homework.lesson_9.level_2_intern;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super(name);
    }

}

class ComputerPlayerDemo {
    public static void main(String[] args) {
        HumanPlayer player = new HumanPlayer("Player");
    }
}
