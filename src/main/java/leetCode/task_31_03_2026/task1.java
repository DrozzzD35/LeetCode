package leetCode.task_31_03_2026;

public class task1 {

    public static void main(String[] args) {

        System.out.println(isPalindrome("gg9"));

    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
//
//        if (s == null) {
//            return false;
//        }
//
//        int left = 0;
//        int right = s.length() - 1;
//
//        while (left < right) {
//            if (!Character.isLetterOrDigit(s.charAt(left))) {
//                left++;
//            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
//                right--;
//            } else {
//                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
//                    return false;
//                }
//                left++;
//                right--;
//            }
//        }
//
//        return true;
    }
}
