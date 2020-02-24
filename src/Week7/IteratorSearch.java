//* CS202 - Christina Parkhurst - Iterator Examples - 2/21/20 *//
package Week7;

import java.util.*;

public class IteratorSearch {

    public static void main(String[] args) {
        List<String> words = new LinkedList<>();

        for (int i=0; i<8; i++) {
            words.add("item" + i);
        }
        System.out.println("Initialized LinkList: ");
        System.out.println(words + "\n");

        changeLinkedList(words);
        iterateLinkedList(words); {

        }
    }

    public static void changeLinkedList(List<String> s) {
        System.out.println("Manually replace all elements in LinkedList: ");
        for (int i=0; i<s.size(); i++) {
            s.set(i,"Replaced. ");
        }
        System.out.println(s + "\n");
    }

    public static void iterateLinkedList(List<String> s) {
        System.out.println("Iterate across the LinkedList: ");
        Iterator<String> itr = s.iterator();
        while (itr.hasNext()) {
            System.out.println(s);
            String a = itr.next();
            itr.remove();
        }
        System.out.println(s);
    }
}
