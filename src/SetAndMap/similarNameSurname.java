package SetAndMap;

import java.util.*;

public class similarNameSurname {
    public static void main(String[] args) {
        createMap();


    }

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        map.put("Raj", "Baj");
        map.put("Raq", "Ba");
        map.put("Raw", "B");
        map.put("Rae", "Faj");
        map.put("Rar", "Baj");
        System.out.println("Before: " + map);
        duplicateValues(map);
        removeDuplicateValues(map);
        System.out.println("After: " + map);


        return map;
    }

    public static Set<String> duplicateValues(Map<String, String> map) {
        Set<String> set = new HashSet<>();
        Set<String> dups = new HashSet<>();
        for (String v : map.values()) {
            if (!set.add(v)) {
                dups.add(v);
            }
        }
        return dups;
    }

    public static void removeDuplicateValues(Map<String, String> map) {
        Set<String> dups = duplicateValues(map);
        map.values().removeAll(dups);
    }
}
