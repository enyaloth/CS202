package Week5;
import java.lang.reflect.Array;
import java.util.*;

// * ArrayList *//
//* Structure/Declaration *//
//* Manipulate - Add/Remove *//
//* Traverse - For Loop *//
//* FinanceClass *//
//* Demo GitHub/ Repl.it *//
//Arrays have a fixed size! This is why we use Array Lists. Arrays are data structures; in the object-oriented world we use the word "collections."
// Array lists are like more flexible versions of arrays.

public class ArrayLists {
    public static void main(String[] args) {
        //declaration
        ArrayList<String> stringArrayList = new ArrayList<String>();

        //add strings to my array list, append (to add to the end)
        stringArrayList.add("Rebekah");
        stringArrayList.add("Sharon");
        stringArrayList.add("Douglas");
        stringArrayList.add("Caleb");
        stringArrayList.add(0, "Candida");
        stringArrayList.add(3, "Eduard");
        String get = stringArrayList.get(2);
        System.out.println(get);


        stringArrayList.remove(2);
        stringArrayList.add("Christina");
        //print the array list (contents)
        System.out.println(stringArrayList);

        //Traverse with a for loop for individual elements.
        for (int i = 0; i < stringArrayList.size(); i++) {
        System.out.println(stringArrayList.get(i));        }
    }
}