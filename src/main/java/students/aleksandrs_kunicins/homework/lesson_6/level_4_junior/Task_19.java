package students.aleksandrs_kunicins.homework.lesson_6.level_4_junior;

class WhileInfiniteLoopBreak  {
    public static void main(String[] args) {
        while(true){
            System.out.println(1);
            break;
        }
    }
}
class ForInfiniteLoopBreak   {
    public static void main(String[] args) {
        for(;;){
            System.out.println(2);
            break;
        }
    }
}