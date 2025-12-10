package repeat.Task_09_12_2025;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println(solution(arr));
        System.out.println(Arrays.toString(arr));
    }


    static int solution(int[] nums) {
        int i = 0;
        int j = 1;
        int k = 1;


        while (j < nums.length) {

            if (nums[i] == nums[j]) {
                nums[j] = 0;
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
                k++;
            }
        }

        return k;

    }
}

