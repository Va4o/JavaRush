package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class plantsHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("watermelon");
        set.add("bananas");
        set.add("chery");
        set.add("pear");
        set.add("melon");
        set.add("blackberry");
        set.add("zheng shen");
        set.add("strawberry");
        set.add("iris");
        set.add("potatoes");
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            String text = iterator.next();
//            System.out.println(text);
//        }
        for(String text : set){
            System.out.println(text);
        }
    }

}
