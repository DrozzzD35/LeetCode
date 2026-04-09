package leetCode.task_09_04_2026.task2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        int sum;

        while (i < j) {
            sum = numbers[i] + numbers[j];

            if (sum == target) {
                arr[0] = i + 1;
                arr[1] = j + 1;
                return arr;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }

        }
        return arr;


    }
}
