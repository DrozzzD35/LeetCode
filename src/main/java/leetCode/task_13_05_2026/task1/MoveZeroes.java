package leetCode.task_13_05_2026.task1;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 3, 12};

        moveZeroes(arr);

        System.out.println(Arrays.toString(arr));
    }


    // 1,0,1,0,3,12
    // 1,0,1,0,3,12
    // 1,1,0,0,3,12
    // 1,1,3,s 0,f 0,12
    // 1,1,3,s 12,0,f0


    public static void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;
        int camp;

        while (fast < nums.length) {
            if (nums[fast] != 0) {
                camp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = camp;
                slow++;
            }
            fast++;
        }

    }
}
