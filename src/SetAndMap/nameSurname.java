package SetAndMap;

import java.util.HashMap;
import java.util.Map;

public class nameSurname {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("Name", "Surname");
        map.put("Nam", "Surname");
        map.put("Na", "Surname");
        map.put("N", "Surname");
        map.put("Eman", "Surname");
        map.put("Ema", "Surname");
        map.put("Em", "Surname");
        map.put("E", "Surname");
        map.put("Name", "Surname");

        System.out.println(map.keySet());

    }
}
