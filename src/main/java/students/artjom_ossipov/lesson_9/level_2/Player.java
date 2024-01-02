package students.artjom_ossipov.lesson_9.level_2;

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
