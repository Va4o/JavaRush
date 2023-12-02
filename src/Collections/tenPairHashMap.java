package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class tenPairHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("watermelon", "berry");
        map.put("bananas", "grass");
        map.put("cherry","berry");
        map.put("pear","fruit");
        map.put("melon","vegetable");
        map.put("blackberry","bush");
        map.put("zhen shen","root");
        map.put("strawberry","berry");
        map.put("iris","flower");
        map.put("potatoes","tuber");

//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//        while(iterator.hasNext()){
//            Map.Entry<String, String> pair = iterator.next();
//            String key = pair.getKey();
//            String value = pair.getValue();
//            System.out.println(key + " - " + value);
//        }
        for(Map.Entry<String, String> pair : map.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
