import java.util.*;

public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(9);
        hs.add(2);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        for (Integer i : hs) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + hs);

    }
}

/*
 * Output:
 * 2 3 4 9
 * 2 3 4 9
 * [2, 3, 4, 9]
 */