package students.nikolajs_antonovs;

public class Demo {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String ("Java");
        boolean b = (s1 == s2);     //true
        System.out.println(b);
        b =	(s1 == s3);      //false
        System.out.println(b);
    }
}
