package leetCode.task_20_05_2026.task2;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class containsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])){
                return true;
            }

            numbers.add(nums[i]);

        }

        return false;
    }
}
