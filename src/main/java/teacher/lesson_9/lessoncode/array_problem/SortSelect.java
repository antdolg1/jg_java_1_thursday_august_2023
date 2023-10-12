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
