package Week5;

import java.util.*;

public class RemoveWords {
    public static void main(String[] args) {
        String[] data1 = {"a", "b", "c", "a", "b", "c", "a", "b", "c"};
        test(data1, "a");
        test(data1, "b");
        String target = "a";
        ArrayList<String> list = new ArrayList<String>();
        for (String word: data1) {
            list.add(word);
        }
        removeAll(list, target);
    }

    public static void test(String[] data, String target) {
        ArrayList<String> list = new ArrayList<String>();
        for (String word: data) {
            list.add(word);
        }
        System.out.println(list);

    }

    public static void removeAll(ArrayList<String> list, String target) {
//        for (int i=0; i < list.size(); i++) {
//            if (list.get(i).equals(target)) {
//                list.remove(i);
//                i--; //Works, but not ideal. Rather, run it backwards
//            }
//        }
        for (int i=list.size(); i >= 0; i--) {
            if (list.get(i).equals(target)) {
                list.remove(i);
            }
        }
    }
}
