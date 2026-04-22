package leetCode.task_22_04_2026.task7;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;
        int k = 1;


        while (right < nums.length) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
                k++;
            }
            right++;
        }

        return k;
    }
}
