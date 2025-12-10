package leetCode.Task_10_12_2025.Task2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        solution(s);
        System.out.println(Arrays.toString(s));

    }

    static void solution(char[] s) {
        char a;
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            a = s[i];
            s[i] = s[j];
            s[j] = a;
            i++;
            j--;

        }


    }


}
