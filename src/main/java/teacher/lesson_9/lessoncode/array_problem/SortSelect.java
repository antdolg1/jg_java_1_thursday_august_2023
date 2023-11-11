package teacher.lesson_9.lessoncode.array_problem;

import java.util.Arrays;

public class SortSelect {

    public int[] maxProductPair(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        if (nums[0] * nums[1] > nums[n - 1] * nums[n - 2]) {
            return new int[]{nums[0], nums[1]};
        } else {
            return new int[]{nums[n - 1], nums[n - 2]};
        }
    }
}

/**
 * Sort the array in ascending order.
 * The two largest numbers will now be at the end of the array, and the two smallest numbers will be at the beginning.
 * Calculate the product of the two largest numbers.
 * Calculate the product of the two smallest numbers.
 * Compare the two products:
 * If the product of the two smallest numbers is greater, it means they are both large negative numbers, and their product is the maximum.
 * Otherwise, the product of the two largest numbers is the maximum.
 * Return the pair of numbers with the maximum product.
 */
