//* CS202 - Christina Parkhurst - Set Examples - 2/21/20 *//
package Week7;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        System.out.println();
        Set<String> breakfast = new HashSet<>();
        breakfast.add("Salsa");
        breakfast.add("Bacon");
        breakfast.add("Eggs");
        breakfast.add("Veggies");
        breakfast.add("Cheese");
        breakfast.add("Potatoes");
        System.out.println("Breakfast Hash Recipe: "  + breakfast);

        Set<String> green = new TreeSet<>();
        green.add("Leaves");
        green.add("Branches");
        green.add("Trunk");
        green.add("Pinecones");
        green.add("Bark");
        System.out.println("Tree Set Has: " + green + "\n");

        Iterator<String> itr = breakfast.iterator();
        while (itr.hasNext()) {
            String b = itr.next();
            System.out.println("Remove Ingredient: " + b);
            itr.remove();
        }
        System.out.println("New recipe: " + breakfast + "\n");

        Iterator<String> itr2 = green.iterator();
        while(itr2.hasNext()) {
            String t = itr2.next();
            System.out.println("Remove " + t);
            itr2.remove();
        }
        System.out.println("New Tree: " + green + "\n");
    }
}
