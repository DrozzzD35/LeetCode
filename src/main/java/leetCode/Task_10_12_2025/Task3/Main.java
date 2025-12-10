package leetCode.Task_10_12_2025.Task3;

public class Main {

    public static void main(String[] args) {
        String s = "abcg";
        String t = "ahbgdc";

        System.out.println(solution(s, t));


    }

    static boolean solution(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < t.length() && j < s.length()) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
            i++;
        }

        return j == s.length();
    }

}

