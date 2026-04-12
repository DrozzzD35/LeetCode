package leetCode.task_12_04_2026.task1;

public class Main {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode nextTemp;
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
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
