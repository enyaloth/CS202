package Week8;

public class ListNode {
    // 1) ListNode Class
    int data;
    ListNode next;

    // 2) Constructors for LinkedLists

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public boolean hasNext() {
        if (next!=null) {
            return true;
        }
        return false;
    }

    public ListNode add(ListNode n) {
        ListNode temp = next;
        if (temp!=null) {
            while (temp.hasNext()) {
                temp = temp.next;
            }
            temp.next = n;
        }
        else { next = n; }
        return next;
    }




}
