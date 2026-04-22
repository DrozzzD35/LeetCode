package leetCode.task_22_04_2026.task8;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int slow = 0;
        int fast = 0;
        int temp;

        while (fast < nums.length){
            if (nums[fast] != 0){
                temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
            fast++;
        }

    }
}
