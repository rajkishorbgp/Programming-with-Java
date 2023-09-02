import java.util.HashMap;
import java.util.Set;

public class IterationOnHashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 200);
        hm.put("Indonesia", 180);
        hm.put("Nepal", 50);

        // Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key=" + k + ",value=" + hm.get(k));
        }
    }
}

/*
 * Output:
 * [China, US, Nepal, India, Indonesia]
 * key=China,value=150
 * key=US,value=200
 * key=Nepal,value=50
 * key=India,value=100
 * key=Indonesia,value=180
 */