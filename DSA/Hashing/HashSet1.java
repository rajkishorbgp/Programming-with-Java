import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(2);
        hs.add(3);
        System.out.println(hs);
        hs.remove(3);
        System.out.println(hs);
        System.out.println(hs.contains(3));
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
    }
}

/*
 * Output:
 * [1, 2, 3]
 * [1, 2]
 * false
 * 2
 * false
 */
