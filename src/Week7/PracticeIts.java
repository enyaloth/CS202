package Week7;

import java.util.*;

public class PracticeIts {
    public static void main(String[] args) {
        LinkedList<Integer> p1 = new LinkedList<Integer>();

        p1.add(5);
        p1.add(6);
        p1.add(5);
        p1.add(6);
        p1.add(5);
        p1.add(6);
        p1.add(6);



        LinkedList<Integer> p2 = new LinkedList<>();
        List<String> hamlet = new ArrayList<String>();
        Collections.addAll(hamlet = new ArrayList<>(), "to", "be", "or", "not", "to", "be", "hamlet");

        Set<String> mutableSet = Collections.EMPTY_SET;
        Collections.addAll(mutableSet = new HashSet<String>(), "to", "be", "or", "not", "to", "be", "hamlet");
//        System.out.println(maxLength(mutableSet));

//        alternate(p1,p2);
//        removeInRange(p1,0,5,13);
//        System.out.println("Unique="+countUnique(p1));
//        System.out.println(countCommon(p1,p2));
//        System.out.println(maxLength());
//        removeEvenLength(mutableSet);
//          System.out.println(contains3(hamlet));

          Map<String, Integer> map = new HashMap<>();

          Map<String, Integer> map2 = new HashMap<>();

          Map<Integer,String> reverse = new HashMap<>();
          reverse.put(5,"dave");
          reverse.put(6,"dave");
          reverse.put(2,"tina");
          reverse.put(1,"bob");

        map.put("north",1);
        map.put("west",2);
        map.put("west",3);
        map.put("south",6);
        map.put("east",7);

        map2.put("north",1);
        map2.put("west",5);
        map2.put("exit",10);
        map2.put("east",7);

//        intersect(map,map2);
//        maxOccurrences(p1);
//        System.out.println(reverse);
//       System.out.println(reverse(reverse));
//        rarest(map);
//        pairCounts(hamlet);
        //rarest(map);
    }

    public static List<Integer> alternate(List<Integer> p1, List<Integer> p2) {
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);

        List<Integer> holder = p1;

        if (holder.size()>p2.size()) {
            int h = p1.size();
            int j = 0;
            for (int i = 1; i<=h; i=i+2) {
                System.out.println(p2.get(j));
                int k = p2.get(j);
                p1.add(i, k);
                j++;
            }
        }
        else {
            int h = p2.size();
            int j = 0;
            for (int i = 1; i<=h; i=i+2) {
                System.out.println(p1.get(j));
                int k = p1.get(j);
                p2.add(i, k);
                j++;
            }
        }
        System.out.println(holder);
        return p1;
    }

    public static void removeInRange(List list, int value, int startI, int endI) {
        System.out.println(list);
        int k = endI;
        for (int i=startI; i<k; i++) {
            if (list.get(i).equals(value)) {
                System.out.println("i=" + i+" @i value is="+list.get(i) + " looking for: " + value + " k=" + k);
                list.remove(i);
                System.out.println(list);
                k--;
                System.out.println("k is now "+k);
            }
        }
    }

    public static int countUnique(List<Integer> list) {
        int unique = 0;
        Set<Integer> set = new TreeSet<Integer>();
        for (int i=0; i<list.size(); i++) {
            set.add(list.get(i));
        }
        System.out.println(set);
        unique = set.size();
        return unique;
    }

    public static int countCommon(List<Integer> l1, List<Integer> l2) {
        int common = 0;
        Set<Integer> s1 = new TreeSet<Integer>();
        Set<Integer> s2 = new TreeSet<Integer>();

        for (int i=0; i<l1.size(); i++) {
            s1.add(l1.get(i));
        }
        for (int i=0; i<l2.size(); i++) {
            s2.add(l2.get(i));
        }
        List<Integer> targetList = new ArrayList<>(s1);
        List<Integer> targetList2 = new ArrayList<>(s2);

        if (s1.size()>s2.size()) {
            for (int i : targetList) {
                if (s2.contains(i)) {
                    common++;
                }
            }
        }
        else {
            for (int j : targetList2) {
                if (s1.contains(j)) {
                    common++;
                }
            }
        }
        return common;
    }

    public static int maxLength(Set<String> set) {
        List<String> list = new ArrayList<>(set);
        if (list.isEmpty()) {return 0;}
        int max = list.get(0).length();
        int i=0;
        for (i = 0; i<set.size()-1; i++) {
            if (list.get(i).length()>max) {
                max = list.get(i).length();
            }
        }
        return max;
    }

    public static boolean hasOdd(Set<Integer> set) {
        for (Integer i : set) {
            if (i%2!=0) { return true; }
        }
            return false;
    }

    public static void removeEvenLength(Set<String> set) {
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
            if (itr.next().length() % 2 == 0) {	// remove even elements
                itr.remove();
            }
        }
        System.out.println("New set: " + set);
    }

    public static boolean contains3(List<String> list) {

        System.out.println(list);
        for (String s: list) {
            int count = 0; 
//            System.out.print(s);
            for (int i=1; i<list.size(); i++) {
                    System.out.println("S: " + s + " List get: " + list.get(i) + " Count: " + count);
                    if (s.equals(list.get(i))) {
                        count++;
                        System.out.println(count);
                        if (count==3) {return true;}
                    }
            }
        }
        return false;
    }

    public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {

        Map<String,Integer> intersectingMap = new HashMap<>();

        Iterator<String> itr = map1.keySet().iterator();

        while (itr.hasNext()) {
            String s = itr.next();

            if (map1.get(s).equals(map2.get(s))) {
                intersectingMap.put(s, map1.get(s));
            }
        }
        return intersectingMap;
    }

    public static int maxOccurrences(List<Integer> list) {
        int max = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : list) {
            if(map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
            if(map.get(n) > max)
                max = map.get(n);
        }
        return max;
    }

    public static Map<String, Integer> reverse(Map<Integer, String> map) {
            Map<String,Integer> reversed = new HashMap<>();
        for (Map.Entry<Integer,String> m: map.entrySet()) {
            reversed.put(m.getValue(),m.getKey());
        }
        return reversed;
    }

//    public static int rarest(Map<String, Integer> m) {
//        int rarest=0;
//        Map<Integer, Integer> rare = new HashMap<Integer,Integer>();
//        for (Map.Entry value :m.entrySet()) {
//            int i=1;
//            if (m.containsValue(value)) {
//                System.out.println("Value: " + value + " i: " + i);
//                rare.put(value,i);
//                i++;
//            }
//            else { rare.put(value,0); }
//        }
//        System.out.println(rare);
//        return rarest;
//    }

    public static Map<String, Integer> pairCounts(List<String> list) {
        Map<String,Integer> pairs = new HashMap<>();
        String dub = "null";
        for (String s: list) {
            System.out.println("s: " + s);
            for (int i = 1; i < s.length(); i++) {
                dub = s.substring(i - 1, i + 1);
                System.out.println("dub: " + dub);
                if (pairs.containsKey(dub)) {
                    pairs.put(dub, pairs.get(dub) + 1);
                } else {
                    pairs.put(dub, 1);
                }
            }
        }
        System.out.println(pairs);
        return pairs;
    }
}
