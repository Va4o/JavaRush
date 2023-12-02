package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class streamKeys {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("1","q");
        map.put("2","q");
        map.put("3","q");
        map.put("4","q");
        map.put("5","q");
        map.put("6","q");
        map.put("7","q");
        map.put("8","q");
        map.put("9","q");
        map.put("10","q");
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String ,String> pair = iterator.next();
            String keys = pair.getKey();
            String value = pair.getValue();
            System.out.println("Key: " + keys);
        }
    }
}
