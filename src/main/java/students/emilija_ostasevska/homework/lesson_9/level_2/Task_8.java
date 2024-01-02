package students.emilija_ostasevska.homework.lesson_9.level_2;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }
}

class ComputerPlayer extends Player {

    ComputerPlayer(String name) {
        super(name); // вызов конструктора родительского класса Player
    }
}

class ComputerPlayerDemo {
    public static void main(String[] args) {
        ComputerPlayer computerPlayer = new ComputerPlayer("ComputerPlayerName");
        // Теперь у вас есть инстанция класса ComputerPlayer
    }
}

