package leetCode.task_20_05_2026.task1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int number = target - nums[i];

            if (map.containsKey(number)) {
                return new int[]{map.get(number), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
