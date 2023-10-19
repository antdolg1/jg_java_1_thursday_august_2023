package students.denis_asipenka.lesson_9.level_6;

public class Varargs {
    public static void main(String[] args) {
        System.out.println("Среднее арифметическое: "+sum(1,2,3,4,5,6,7,8,9));
        System.out.println("Самое длинное слово: "+longWord("Whgdhdhdgh","t","longlong"));
    }
    static int sum(int... a){
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum/a.length;
    }
    static String longWord(String... a){
        int result=0;
        int resultIndex=0;
        int temp=0;
        for (int i=0;i<a.length;i++){
            temp=a[i].length();
            if (temp>result){
                result=a[i].length();
                resultIndex=i;
            }
        }
        return a[resultIndex];
    }
}