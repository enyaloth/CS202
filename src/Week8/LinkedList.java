package Week8;

public class LinkedList {
    Node head;

    public void append(int data) {
        Node current = head;
        if (head==null) {
            head = new Node(data);
            return;
        }
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data); // creates a new node
        newHead.next = head; // points new node to the current head
        head = newHead;  // sets new node to head
    }

    public void deleteWithValue(int data) {
        if (head==null) return;
        if (head.data==data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next!=null) {
            if (current.next.data==data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}

// 1) Store/make a copy
// 2) Use while loop until last pointer/node is null
// 3) Exception: Always check for an empty list
// 4) Inserting: i: Create new node, ii: Point it to the old front/head, iii: repoint it to the front.
