package students.kristina_konovalchuk.homework.lesson9.level_2;

public class Task_7 {
    class Player {
        private String name;

        Player(String name) {
            this.name = name;
        }
    }

    class HumanPlayer extends Player {
        HumanPlayer(String name) {
            super( name );
        }
    }
}
