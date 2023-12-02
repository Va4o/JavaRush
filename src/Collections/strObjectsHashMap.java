package Collections;

import java.util.HashMap;
import java.util.Map;

public class strObjectsHashMap {
    public static void main(String[] args) {

        HashMap<String, Object> map = new HashMap<>();
        map.put("Name1", 1);
        map.put("Name2", 2);
        map.put("Name3", 3);
        map.put("Name4", 4);
        map.put("Name5", 5);
        map.put("Name6", 6);
        map.put("Name7", 7);
        map.put("Name8", 8);
        map.put("Name9", 9);
        map.put("Name10", 10);

        for(Map.Entry<String, Object> pair : map.entrySet()){
            String keys = pair.getKey();
            String value = pair.getValue().toString();
            System.out.println(keys + " - " + value);
        }
    }
}
