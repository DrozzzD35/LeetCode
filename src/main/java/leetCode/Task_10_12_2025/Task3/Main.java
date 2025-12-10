package leetCode.Task_10_12_2025.Task3;

public class Main {

    public static void main(String[] args) {
        String s = "";
        String t = "ahbgdc";

        System.out.println(solution(s, t));


    }

    static boolean solution(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < t.length() && j < s.length()) {
            if (t.charAt(i) == s.charAt(j)) {
                if (j == s.length() - 1) {
                    return true;
                } else {
                    i++;
                    j++;
                }
            } else {
                i++;
            }
        }

        return false;
    }
}
