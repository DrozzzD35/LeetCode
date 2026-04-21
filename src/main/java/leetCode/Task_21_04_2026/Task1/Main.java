package leetCode.Task_21_04_2026.Task1;

public class Main {
    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = dummy;
        ListNode first;
        ListNode seconde;

        while (dummy.next != null && dummy.next.next != null) {
            first = dummy.next;
            seconde = dummy.next.next;
            dummy.next = seconde;

            first.next = seconde.next;
            seconde.next = first;
            dummy = first;
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
