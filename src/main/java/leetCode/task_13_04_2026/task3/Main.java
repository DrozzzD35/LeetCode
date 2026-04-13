package leetCode.task_13_04_2026.task3;

public class Main {
    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode tail;
        ListNode prev;

        while (current.next != null) {

            tail = current.next.next;
            prev = current;
            current = current.next;
            current.next = prev;
            prev.next = tail;

        }

        return head;


    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
