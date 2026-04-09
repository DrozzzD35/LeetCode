package leetCode.task_07_04_2026.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void moveZeroes(int[] nums) {
        int writer = 0;
        int number;

        for (int explorer = 0; explorer < nums.length; explorer++) {
            if (nums[explorer] != 0) {
                number = nums[writer];
                nums[writer] = nums[explorer];
                nums[explorer] = number;
                writer++;
            }

        }
    }

}
