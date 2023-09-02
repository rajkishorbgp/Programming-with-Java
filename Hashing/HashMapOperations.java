/*
 *              HashMap Operation
 */

import java.util.HashMap;

public class HashMapOperations {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - 0(1)
        hm.put("India", 100);
        hm.put("Chaina", 150);
        hm.put("US", 95);

        System.out.println(hm);
        hm.put("India", 120);
        System.out.println(hm);

        // Get - O(1)
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia"));

        // ContainsKey -O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // remove -O(1)
        hm.remove("Chaina");
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // clear
        hm.clear();

        // is Empty
        System.out.println(hm.isEmpty());
    }
}

/*
 * Output:
 * {Chaina=150, US=95, India=100}
 * {Chaina=150, US=95, India=120}
 * 120
 * null
 * true
 * false
 * {US=95, India=120}
 * 2
 * true
 */