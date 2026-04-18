package leetCode.Task_17_04_2026.Task1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};

        System.out.println(Arrays.toString(twoSum(nums, 6)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int result;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            result = target - nums[i];

            if (map.containsKey(result)) {
                return new int[]{map.get(result), i};
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }
}
