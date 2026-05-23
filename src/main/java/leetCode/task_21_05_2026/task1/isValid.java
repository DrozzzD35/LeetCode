package leetCode.task_21_05_2026.task1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class isValid {

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char symbol : s.toCharArray()) {
            if (symbol == '[' || symbol == '{' || symbol == '(') {
                stack.push(symbol);
            } else {
                if (stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();
                if ((top == '[' && symbol != ']')
                || (top == '(' && symbol != ')')
                || (top == '{' && symbol != '}')){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
