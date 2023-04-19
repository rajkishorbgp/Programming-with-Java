import java.util.LinkedHashMap;
import java.util.HashMap;

public class LinkedHashMap2 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("india", 100);
        lhm.put("china", 200);
        lhm.put("US", 80);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 100);
        hm.put("china", 200);
        hm.put("US", 80);

        System.out.println(lhm);
        System.out.println(hm);
    }
}

/*
 * Output:
 * {india=100, china=200, US=80}
 * {china=200, india=100, US=80}
 */
