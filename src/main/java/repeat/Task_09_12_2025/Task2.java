package repeat.Task_09_12_2025;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int[] arr1 = {0};
        int[] arr2 = {1};

        merge(arr1, 0, arr2, 1);

        System.out.println(Arrays.toString(arr1));


    }


    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int a = nums1.length - 1;

        if (m == 0) {
            nums1[m] = nums2[m];
        }

        while (i > 0 || j > 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[a] = nums1[i];
                i--;

            } else {
                nums1[a] = nums2[j];
                j--;
            }
            a--;

        }

    }
}
