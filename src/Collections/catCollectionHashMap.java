package Collections;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class catCollectionHashMap {

    static class Cat{
        String name;
    }

    public static void main(String[] args) {
        HashMap<String, Cat> map = new HashMap<>();
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        map.put("Barsik", cat);
        map.put("Marsik", cat2);
        map.put("Farsik", cat3);
        map.put("YopTvouMat", cat4);
//        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
//        while(iterator.hasNext()){
//            Map.Entry<String, Cat> list = iterator.next();
//            String key = list.getKey();
//            Cat value = list.getValue();
//            System.out.println(key + " " + value);
//        }
        for(Map.Entry<String,Cat> pair : map.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue().toString();
            System.out.println(key + " " + value);
        }
    }
}
