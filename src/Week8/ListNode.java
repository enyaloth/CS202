package Week8;

import java.sql.SQLOutput;

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
        if (this.next!=null) {
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

    public ListNode interleave(ListNode b) {
        ListNode current = this;
        current.printList();
        ListNode temp = null;
        b.printList();
        while (current.next != null) {
            temp = new ListNode(b.data);
            b = b.next;
            temp.next = current.next;
            current.next = temp;
            current = current.next.next;
        }
        current.next = b;
        return this;
    }

    public void printList() {
        ListNode temp = this;
        while (temp.next!=null) {
            System.out.print("-> "+temp.data);
            temp = temp.next;
        }
        System.out.println("-> "+temp.data);
    }


}
