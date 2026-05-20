package leetCode.task_20_05_2026.task3;

public class isPalindrome {

    public boolean isPalindrome(String s) {
        if (s == null){
            return true;
        }

        int left = 0;
        int right = s.length() -1;

        while (left < right){
            char charLeft = s.charAt(left);
            char charRight = s.charAt(right);

            if (!Character.isLetterOrDigit(charLeft)){
                left++;
            } else if (!Character.isLetterOrDigit(charRight)) {
                right--;
            } else if (Character.toLowerCase(charLeft) != Character.toLowerCase(charRight)) {
                return false;
            }
            left++;
            right--;

        }

        return true;

    }
}
