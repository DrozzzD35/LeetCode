package leetCode.task_09_04_2026.task3;

public class Main {

    public static void main(String[] args) {

    }

    public void reverseString(char[] s) {
        char temp;
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
