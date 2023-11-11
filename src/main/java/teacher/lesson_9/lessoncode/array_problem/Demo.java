package teacher.lesson_9.lessoncode.array_problem;

public class Demo {
    public static void main(String[] args) {

        BruteForce bruteForce = new BruteForce();
        SortSelect sortSelect = new SortSelect();
        LinearTraversal linearTraversal = new LinearTraversal();
        int[] array = {-10, -15, 1, 3, 8};
        int[] result = linearTraversal.maxProductPair(array);
        System.out.println(result[0] + " " +result[1]);

    }
}
