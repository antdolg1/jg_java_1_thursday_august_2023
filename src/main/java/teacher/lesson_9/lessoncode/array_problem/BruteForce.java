package teacher.lesson_9.lessoncode.array_problem;

public class BruteForce {
    public int[] maxProductPair(int[] nums) {
        int[] result = new int[2];
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                if (product > maxProduct) {
                    maxProduct = product;
                    result[0] = nums[i];
                    result[1] = nums[j];
                }
            }
        }
        return result;
    }
}
