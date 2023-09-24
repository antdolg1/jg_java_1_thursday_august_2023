package students.aleksandrs_kunicins.homework.lesson_6.level_4_junior;

class WhileLoopContinue {
    public static void main(String[] args) {
        int x = 0;
        while (x<5){
            System.out.println(1);
            x++;
            continue;
            
        }
    }
}
class ForLoopContinue {
    public static void main(String[] args) {
        for (int i = 0;i<5;i++){
            System.out.println(2);
            continue;
        }
    }
}