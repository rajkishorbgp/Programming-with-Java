import java.util.TreeMap;

public class TreeMap3 {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 80);
        tm.put("US", 50);

        System.out.println(tm); // sorted order
    }
}

/*
 * Output:
 * {China=80, India=100, US=50}
 */