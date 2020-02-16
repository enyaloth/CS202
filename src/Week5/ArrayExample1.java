package Week5;

import java.util.ArrayList;

public class ArrayExample1 {
    public static void removeAll(ArrayList<String> stringArrayList) {

    }

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList();
        int sum =0;
        stringArrayList.add("Echo");
        stringArrayList.add("Radiohead");
        stringArrayList.add("Tool");
        stringArrayList.add("Lemon Demon");
        stringArrayList.add("Shakira");
        stringArrayList.add("Hillsong Young and Free");
        // classic For Loop structure
        for (int i=0; i<stringArrayList.size(); i++) {
            String s = stringArrayList.get(i);
            if (s.length()==4) {
            System.out.println("string length " + s.length());
            sum += s.length();
        }}
        //for each syntax/ enhanced for loop
        //for <type> <name> : <structure>
        for (String s: stringArrayList) {
            System.out.println(s);
        }
        System.out.println("Length Totals: " + sum);
    }
}
