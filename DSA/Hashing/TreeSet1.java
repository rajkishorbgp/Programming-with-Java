import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");

        System.out.println(ts);
        ts.remove("Delhi");
        System.out.println(ts);
    }
}

/*
 * Output:
 * [Bengaluru, Delhi, Mumbai, Noida]
 * [Bengaluru, Mumbai, Noida]
 */