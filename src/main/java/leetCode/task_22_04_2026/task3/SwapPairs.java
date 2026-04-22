package leetCode.task_22_04_2026.task3;

public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        tail.next = head;
        ListNode nextTemp;
        ListNode first;
        ListNode second;

        while (tail.next != null && tail.next.next != null) {
            first = tail.next;
            second = tail.next.next;
            nextTemp = second.next;
            second.next = first;
            first.next = nextTemp;
            tail.next = second;
            tail = first;
        }

        return dummy.next;
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
