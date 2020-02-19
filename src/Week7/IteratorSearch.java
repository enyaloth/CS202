package Week7;
//HW - two methods; one for manipulating the linkedlist (add or change), one for iterating over the linkedlist.

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorSearch {
    public static void main(String[] args) {
        List<String> words = new LinkedList<String>();
        // add to this sample, one method to change the linkedlist and a second method to iterate the linked list.

        for (int i=0; i<8; i++) {
            words.add("item" + i);
        }
        System.out.println(words);

        Iterator<String> itr = words.iterator();
        String result = itr.next();
        System.out.println("Result before: " + result);
        while (itr.hasNext()) {
            String next = itr.next();
            if (next.length()>result.length()) {
                result = next;
            }
        }
        System.out.println(result);
    }
}
