package Week8;

import java.util.List;

public class SimpleLL {
    public static void main(String[] args) {

        // Manual LinkedList
        ListNode list = new ListNode(42);
        list.next = new ListNode(3);
        list.next.next = new ListNode(2);

        System.out.println("Manually create a linkedlist: ");
        System.out.println("1st List: " + list.data + "->" + list.next.data + "->" + list.next.next.data + "\n");

        // 3) Insert Node at the end
        System.out.println("Insert node at the end: ");
        ListNode temp = new ListNode(17);
        list.next.next.next = temp;

        System.out.println("List with added end value: " + list.data + "->" + list.next.data + "->" + list.next.next.data + "->" + list.next.next.next.data + "\n");

        System.out.println("Testing just printing list: " + list + "\n"); // Notice that list2 is a reference; not a value call

        // 4) Inserting nodes at the beginning
        ListNode frontPiece = new ListNode(5,list);
        System.out.println("List with added beginning value: " + frontPiece.data + "->" + frontPiece.next.data + "->"
                + frontPiece.next.next.data + "->" + frontPiece.next.next.next.data + "->" + frontPiece.next.next.next.next.data);

        // 5) Insert Node in the middle
        System.out.println("5) Insert Node in the Middle\n");
        System.out.println("LinkedList before insert: " + list.data + "->" + list.next.data + "->"
                + list.next.next.data + "->" + list.next.next.next.data);
        ListNode middlePiece = new ListNode(12);
        middlePiece.next = list.next; // Point middlePiece to list.next.next
        list.next = middlePiece; // point list.next to middlePiece;
        System.out.println("With added middle value: " + list.data + "->" + list.next.data + "->" + list.next.next.data + "->"
                + list.next.next.next.data + "->" + list.next.next.next.next.data);

        // 6) Interleave 2 LLs (like in the videos)

        // 7) Add node w/ method
        ListNode adding = new ListNode(5);
        adding.add(new ListNode(3));
        System.out.println("Added: " + adding.data + " " + adding.next.data);


        // Working with inserting & repointing nodes
        ListNode two = new ListNode(2);
        ListNode nodey = new ListNode(1, new ListNode(3));
        ListNode tempy = new ListNode(2, new ListNode(4));
//        nodey.next = tempy;
//        System.out.println(nodey.data + " " + nodey.next.data + " " + nodey.next.next.data);

        System.out.println(nodey.data + " " + nodey.next.data);
        System.out.println(tempy.data + " " + tempy.next.data);

        nodey.interleave(tempy);
        System.out.println("Interleave: " + nodey.data + " " + nodey.next.data + " " + nodey.next.next.data + " " + nodey.next.next.next.data);

        //In-Class Homework:
        //1) Create ListNode Class
        //2) Build LL w/ Constructors
        //3) Add Node at the end
        //4) Add node at the beginning
        //5) Insert Node in the middle
        //6) Interleave 2 LLs (like in video)
        // CRUD - Create, Read, Update, Delete

    }
}
