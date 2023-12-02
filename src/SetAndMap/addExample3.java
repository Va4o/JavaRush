package SetAndMap;

import java.util.HashMap;
import java.util.Map;

public class addExample3 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a","s");
        map.put("z","x");
        map.put("z","s");
        map.put("w","e");
        map.put("s","s");
        map.put("x","c");
        map.put("z","r");
        map.put("d","f");
        map.put("c","v");
        map.put("r","t");
        for(Map.Entry<String,String> pair : map.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println("Key: " + key + " Value: " + value);
        }
    }
}
