package teacher.lesson_9.lessoncode.array_problem;

public class LinearTraversal {
    public int[] maxProductPair(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        if (min1 * min2 > max1 * max2) {
            return new int[]{min1, min2};
        } else {
            return new int[]{max1, max2};
        }
    }
}


/**
 *
 * We need to keep track of the two largest numbers and the two smallest numbers in the array. Why? Because multiplying two large positive numbers or two large negative numbers can give us the highest product.
 * We'll use four variables: max1, max2 for the largest and second-largest numbers, and min1, min2 for the smallest and second-smallest numbers.
 * Go through the array:
 *
 * Look at each number in the array one by one.
 * For each number:
 * If it's bigger than our current largest number (max1), then shift max1 to max2 and update max1 with this new number.
 * If it's not bigger than max1 but is bigger than max2, then update max2 with this number.
 * Similarly, if it's smaller than our current smallest number (min1), then shift min1 to min2 and update min1 with this new number.
 * If it's not smaller than min1 but is smaller than min2, then update min2 with this number.
 * Decide the answer:
 *
 * Once we've looked at all the numbers in the array, we'll have our two largest and two smallest numbers.
 * We then check which pair gives a bigger product: max1 * max2 or min1 * min2.
 * The pair with the bigger product is our answer.
 */