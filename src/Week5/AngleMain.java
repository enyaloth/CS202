//*Christina Parkhurst - Angle - 2/7/20*//

package Week5;

import java.util.ArrayList;

public class AngleMain {
    public static void main(String[] args) {
        ArrayList<Angle> angleArrayList = new ArrayList<>();
        // initialize and add to my Array List
        angleArrayList.add(new Angle(3, 1));
        angleArrayList.add(new Angle(2, 5));
        angleArrayList.add(new Angle(6, 11));
        angleArrayList.add(new Angle(32, 15));
        ArrayList<Object> myStuff;
        myStuff = new ArrayList<Object>();
        myStuff.add(new String("greetings"));
        myStuff.add(new Angle(2,3));
        myStuff.add(new Object());

        for (Angle a: angleArrayList) {
            System.out.println(a);
        }
    }
}
