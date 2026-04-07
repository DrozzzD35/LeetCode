package leetCode.task_07_04_2026.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        System.out.println(Arrays.toString(sortedSquares(nums)));

    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare < rightSquare) {
                result[index] = rightSquare;
                right--;
            } else {
                result[index] = leftSquare;
                left++;
            }
            index--;

        }
        return result;

    }

}
