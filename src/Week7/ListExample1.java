//* CS202 - Christina Parkhurst - List Example - 02/21/20 *//
package Week7;

import java.util.*;

public class ListExample1 {
    public static void main(String[] args) {
        List<String> listExample = new LinkedList<String>();
        listExample.add("0th Element");
        listExample.add("Next Element");
        System.out.println();

        for (int i=0; i<4; i++) {
            listExample.add((i+2)+" Element");
        }
        System.out.println(listExample + "\n");
    }
}
