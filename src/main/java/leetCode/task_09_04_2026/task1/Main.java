package leetCode.task_09_04_2026.task1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};

        System.out.println(Arrays.toString(nums));
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i += 1;
                nums[i] = nums[j];
            }

        }
        return i + 1;

    }

}
