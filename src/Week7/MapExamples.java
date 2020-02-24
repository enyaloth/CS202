//* Christina Parkhurst - MapExamples - 02/23/2020 *//
package Week7;

import java.util.*;

public class MapExamples {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(5,"north");
        map.put(3,"west");
        map.put(1,"west");
        map.put(5,"south");
        map.put(2,"east");
        System.out.println(map);

        System.out.println("Size: " + map.size());
        System.out.println("All Values: " + map.values());
        System.out.println("3rd value: " + map.get(2));
        System.out.println("All Keys: " + map.keySet());

        for (int a: map.keySet()
             ) {
            String value = map.get(a);
            System.out.println("Value: " + value + " Key is: " + a);
        }

    }
}
