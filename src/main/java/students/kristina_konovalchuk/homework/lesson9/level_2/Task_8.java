package students.kristina_konovalchuk.homework.lesson9.level_2;

public class Task_8 {
    class Player {
        private String name;

        Player(String name) {
            this.name = name;
        }
    }

    class ComputerPlayer extends Player {
        ComputerPlayer(String name) {
            super( name );
        }
    }

    class ComputerPlayerDemo {
        public void main(String[] args) {
            ComputerPlayer computerPlayer = new ComputerPlayer( "Charles" );
        }
    }
}
