package leetCode.task_16_05_2026.task1;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        merge(nums1, 3, nums2, 3);

        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int point = nums1.length - 1;
        int arrOne = m - 1;
        int arrTwo = n - 1;

        while (arrOne >= 0 && arrTwo >= 0) {

            if (nums2[arrTwo] > nums1[arrOne]) {
                nums1[point] = nums2[arrTwo];
                arrTwo--;
            } else {
                nums1[point] = nums1[arrOne];
                arrOne--;
            }
            point--;

        }

        while (arrTwo >= 0) {
            nums1[point] = nums2[arrTwo];
            arrTwo--;
            point--;
        }

    }
}
