/*
 *     Ordered using DLL
 */

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);
        lhs.remove("Delhi");
        System.out.println(lhs);
    }
}

/*
 * Output:
 * [Delhi, Mumbai, Noida, Bengaluru]
 * [Mumbai, Noida, Bengaluru]
 */
