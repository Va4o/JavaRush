package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class streamValues {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1","qw");
        map.put("2","as");
        map.put("3","zx");
        map.put("4","we");
        map.put("5","sd");
        map.put("6","xc");
        map.put("7","er");
        map.put("8","df");
        map.put("9","cv");
        map.put("10","rt");

//        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
//        while(iterator.hasNext()){
//            Map.Entry<String,String> pair = iterator.next();
//            String keys = pair.getKey();
//            String values = pair.getValue();
//            System.out.println("Value: " + values);
//        }
        for(Map.Entry<String,String> pair : map.entrySet()){
            String keys = pair.getKey();
            String values = pair.getValue();
            System.out.println("Values: " + values);
        }
    }
}
