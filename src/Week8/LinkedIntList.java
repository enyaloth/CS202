package Week8;

import java.util.NoSuchElementException;

public class LinkedIntList {
    private ListNode front;


    // Constructor to initialize list
    public LinkedIntList() {
        front = null;
    }

    public void add(int value) { // appends a node - adds to front
        if (front==null) { // Test for an empty list
            front = new ListNode(value);
        }
        else { // Move to end of list and add a node
            ListNode current = front;
            while (current.next!=null) {
                current = current.next;
            }
            current.next =new ListNode(value); // Found the end; add the new node.
        }
    }

    public void insert(int value, int index) {
        if (index==0) {
            front = new ListNode(value, front);
        }
        else {
            ListNode current = nodeAt(index-1);
            current.next = new ListNode(value, current.next);
        }
    }

    public ListNode set(int index, int value) { // Replaces a given index's value
        ListNode temp = front;
        if (index==0) {
            temp.data = value;
            return front;
        }
        if (getSize()<=index) {
            throw new IllegalArgumentException("Index must be less than " + (getSize()));
        }
        for (int i=0; i<index-1; i++) {
            temp = temp.next;
        }
        temp.next.data = value;
        return front;
    }

    public int getSize() {
        int count = 0;
        ListNode current = front;
        while (current!=null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public String toString() { // Method to print list
        if (front == null) {
            return "[]";
        }
        else {
            String results = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                results += "->" + current.data;
                current = current.next;
            }
            results +="]";
            return results;
        }
    }

    public int getValue(int index) { // 1st way to get value
        ListNode current = front;
        for (int i=0; i<index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int getPosition(int value) {
        ListNode current = front;
        int count = 0;
        if (current==null) {return -1;}
        while (current!=null) {
            if (current.data == value) {
                return count;
            } else count++;
            current = current.next;
        }
        return -1; // no such value found
    }

    private ListNode nodeAt(int index) {
        ListNode current = front;
        for (int i=0; i<index; i++) {
            current = current.next;
        }
        return current;
    }

    public int getValue2(int index) { // 2nd way to get value
        return nodeAt(index).data;
    }

    public boolean hasOddEven() {
        ListNode current = front;
        boolean even = false;
        boolean odd = false;
        while (current!=null) {
            if (current.data%2==0) {
                even = true;
            }
            else odd=true;
            if (even&&odd) return true;
            current = current.next;
        }
        return false;
    }

    public void remove(int index) {
        if (index==0) {
            front = front.next;
        }
        else {
            ListNode current = nodeAt(index-1);
            current.next = current.next.next;
        }
    }

    public void removeValue(int value) {
        if (front!=null) {
            ListNode current = front;
            ListNode foundAt = null;
            while (current!=null) {
                if (current.next.data==value) {
                    foundAt = current;
                }
                current = current.next;
            }
            if (foundAt!=null) {
                foundAt.next = foundAt.next.next;
            }
            else if (front.data==value) {
                front.data = front.next.data;
            }
        }
    }

    public void removeLast(int value) {
        ListNode current = front;
        ListNode spot = null;
        boolean hasTrees = true;
        if (front!=null) {
            while (current.next != null) {
                if (current.next.data == value) {
                    spot = current;
                }
                current = current.next;
            }
            if (spot != null) {
                spot.next = spot.next.next;
            }
            else if (front.data == value) {
                front = front.next;
                hasTrees = false;
            }
            if (!hasTrees) { return;}
        }
    }

    public int min() {
        ListNode current = front;
        if (current==null) {
            throw new NoSuchElementException();
        }
        else {
            int minValue = current.data;
            while(current.next!=null) {
                if (current.next.data<minValue) {
                    minValue = current.next.data;
                }
                current = current.next;
            }
            return minValue;
        }
    }

    public boolean isSorted() {
        ListNode current = front;
        System.out.print("Current.data="+current.data);
        if (current==null) {
            return true;
        }
        else {
            while(current.next!=null) {
                System.out.print(" Current.next.data="+current.next.data + " ");
                if (current.next.data<=current.data) {
                    System.out.println(" if: current=" + current.data + " next=" + current.next.data);
                    System.out.println("return false");
                    return false;
                }
                current = current.next;
            }
        } return true;
    }

    public int lastIndexOf(int n) {
        ListNode current = front;
        int index=-1;
        int count = 0;
        if (current==null) {return -1;}
        else {
            if (current.data==n) {index=0;}
            while (current.next!=null) {
                if (current.data==n) {
                    index=count;
                }
                count++;
                current = current.next;
            }
            return index;
        }
    }

    public int countDuplicates() {
        ListNode current = front;
        int doubles = 0;
        if (current==null) {return 0;}
        else {
            while (current.next!=null) {
                int holder = current.data;
                while (current.next!=null) {
                    if (holder==current.next.data) {
                        doubles++;
                        break;
                    }
                    holder = current.next.data;
                    current = current.next;
                }
                current = current.next;
            }
        } return doubles;
    }

    public boolean hasTwoConsecutive() {
        ListNode current = front;
        if (current==null) {return false;}
        while (current.next!=null) {
            if ((current.data+1)==current.next.data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int deleteBack() {
        ListNode current = front;
        int value;
        if (current==null) {
            throw new NoSuchElementException();
        }
        else if (current.next==null) {
            value = current.data;
            front = null;
            return value;
        }
        else {
            while (current.next.next!=null) {
                current = current.next;
            }
            value = current.next.data;
            current.next = null;
        }
        return value;
    }

    public void stutter() {
        ListNode current = front;

        while (current!=null) {
            current.next = new ListNode(current.data, current.next);
            current = current.next.next;
        }
    }

    public void stretch(int n) {
        ListNode current = front;
        System.out.println("current: " +current.data);
        if (n<=0) {
            current = null;
        }
        else {
            while (current.next!=null) {
                System.out.println("current.next!=null: "+current.next.data);
                for (int i = 0; i < n; i++) {
                    ListNode temp = front;
                    current.printList();
                    System.out.println("current.next: " + current.next.data);
                    current.next = new ListNode(current.data, current.next);

                    System.out.println("current.next new listnode: " + current.next.data);
                    current = current.next.next;
                }
            }
        }
        current.printList();
    }


    public void compress(int n) {
        if(front == null)
            return;

        ListNode current = front;
        ListNode runner = current;
        int i = 0;
        int sum = 0;

        while(current != null) {
            System.out.println("while current!=null " + current.data);
            if(i < n && runner != null) {
                System.out.println("i: " + i + " n: "  + n);
                sum += runner.data;
                System.out.println("sum: " + sum);
                runner = runner.next;
                System.out.println("runner: " + runner.data);
                i++;
            } else {
                current.data = sum;
                current.next = runner;
                current = runner;
                System.out.println(current.data);
                sum = 0;
                i = 0;
            }
        }
    }

    public void split() {
        ListNode current = front;
        ListNode prev = current;
        while (current.next!=null) {
            if (current.data<0) {
                System.out.println("current.data: " + current.data + " current.next.data: " + current.next.data);
                current.next=prev.next;
                prev.next=front;
                front=prev;
                current.printList();
            }
            current = current.next;
        }
    }

    public void switchPairs() {
        boolean pairExists = false;
        ListNode current= front;
        ListNode temp = front;
        ListNode nextPair=front;
        if (front==null) {return;}
        if (current.next!=null) {pairExists=true;}
        while (pairExists) {
         if (front.next==null) {
                pairExists=false;
                return;
            }
            while (current!=null) {
                if (current.next!=null) {
                    if (current.next.next!=null) {
                        nextPair=current.next.next;
                        front=front.next;
                        temp=current.next;
                        front=temp;
                    }
                }
                current = current.next;
            }
        }
    }


    public static void main(String[] args) {
        int[] data = {1,-3,2,-5,-3,2,1,6,6,5,4,3};
        LinkedIntList pit = new LinkedIntList();
        for (int d: data) {
            pit.add(d);
        }

        System.out.println(pit);
        pit.split();
//        pit.isSorted();
//        pit.compress(3);
//        System.out.println(pit.min());


//        System.out.println("Get Value at index 1: " + pit.getValue(1));
//        pit.insert(3,1);
//        System.out.println("Insert value 3 at index 1: " + pit);
//        System.out.println("Get position of 5: " + pit.getPosition(5));
//        pit.remove(2);
//        System.out.println("After removing: " + pit);
//        System.out.println("List Size: " + pit.getSize());
//        System.out.println("hassOddEven? " + pit.hasOddEven());
//        pit.set(12,6);
//        System.out.println("Set 6 at index 1: " + pit);
    }

}
