package leetCode.task_12_04_2026.task2;

public class Main {

    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        while (head != null){
            if (head == head.next){
                head = head.next.next;
            }
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
