package Week7;
import java.io.File;
import java.util.*;

// Set Theory: Union & Intersection. The union is the whole, the section is the overlap.
//pg. 742 in book: union/intersection: UNION: addAll() - INTERSECTION: retainAll() - DIFFERENCE: removeAll() - superset/subset: constainsAll();

public class CollectionsPractice {
    public static void main(String[] args) {
        List<String> words = new LinkedList<>();

//        Scanner scan = new Scanner(File.createTempFile(quote));
        //read it into the linkedlist.

        System.out.println("\nCreate a new LinkedList:");

        for (int i=0; i<10; i++) {
            words.add("item"+i);
        }

        for (String n:words
             ) {
            System.out.print(n + " ");
        }
        System.out.println("\n");

        // traverse it with an iterator:
        Iterator<String> itr = words.iterator();
        System.out.println("Iterator has next " + itr.hasNext());
        System.out.println("Iterator remove");
        while (itr.hasNext()) {
            System.out.println(words);
            String a = itr.next();
            System.out.println("word: " + a);
            itr.remove();
        }
        System.out.println("New list: " + words);
        System.out.println();

        //this is a while iteration - it's unneeded.
        System.out.println("Remove 0th element until empty:");
     while(!words.isEmpty()) {
         words.remove(0);
         System.out.println(words);
     }
        System.out.println("List has been emptied\n");
    }
}
