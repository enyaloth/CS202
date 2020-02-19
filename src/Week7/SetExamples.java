package Week7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        Set<String> breakfast = new HashSet<>();
        breakfast.add("Salsa");
        breakfast.add("Bacon");
        breakfast.add("Eggs");
        breakfast.add("Veggies");
        breakfast.add("Cheese");
        breakfast.add("Potatoes");
        System.out.println("Breakfast Hash Recipe: "  + breakfast);

        Iterator<String> itr = breakfast.iterator();
        while (itr.hasNext()) {
            String b = itr.next();
            System.out.println("Remove Ingredient: " + b);
            itr.remove();
        }
        System.out.println("New recipe: " + breakfast);

    }
}
