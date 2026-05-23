package leetCode.task_21_05_2026.task2;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {
    private final Deque<Integer> stack1;
    private final Deque<Integer> stack2;


    public MinStack() {
        this.stack1 = new ArrayDeque<>();
        this.stack2 = new ArrayDeque<>();
    }

    public void push(int val) {
        stack1.push(val);

        if (stack2.isEmpty()) {
            stack2.push(val);
        } else {
            int min = Math.min(val, stack2.peek());
            stack2.push(min);
        }

    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        if (!stack1.isEmpty()) {
            return stack1.peek();
        } else {
            return 0;
        }
    }

    public int getMin() {
        if (!stack2.isEmpty()) {
            return stack2.peek();
        } else {
            return 0;
        }
    }
}
