package leetCode.Task_21_04_2026.task5;

public class Main {
    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode node = new ListNode(0);
        ListNode tail = node;
        tail.next = head;
        ListNode first;
        ListNode second;

        while (tail.next != null && tail.next.next != null) {
            first = tail.next;
            second = tail.next.next;
            tail.next = second;

            first.next = second.next;
            second.next = first;
            tail = first;
        }

        return node.next;
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
