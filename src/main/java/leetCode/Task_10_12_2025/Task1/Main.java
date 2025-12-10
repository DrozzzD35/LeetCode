package leetCode.Task_10_12_2025.Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1};

        solution(arr);

        System.out.println(Arrays.toString(arr));


    }


    static void solution(int[] nums) {
        int i = 0;
        int j = 1;

        while (j < nums.length) {
            if (nums[i] == 0) {
                if (nums[j] == 0) {
                    j++;
                } else {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            } else {
                i++;
                j++;
            }
        }
    }
}
