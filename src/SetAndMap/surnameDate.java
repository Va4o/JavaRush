package SetAndMap;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class surnameDate {

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = new HashMap<>();
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        map.put("Surname" , dateFormat.parse("September 13 2005"));
        map.put("Surnam" , dateFormat.parse("November 13 2005"));
        map.put("Surna" , dateFormat.parse("October 13 2005"));
        map.put("Surn" , dateFormat.parse("November 13 2005"));
        map.put("Sur" , dateFormat.parse("December 13 2005"));
        map.put("Su" , dateFormat.parse("January 13 2005"));
        map.put("S" , dateFormat.parse("February 13 2005"));

        List<String> removeKeys = new ArrayList<>();

        for (HashMap.Entry<String, Date> pair : map.entrySet()) {
            String key = pair.getKey();
            Date value = pair.getValue();

            // Код для получения месяца
            Calendar cal = Calendar.getInstance();
            cal.setTime(value);
            int month = cal.get(Calendar.MONTH);

            // Включает в себя июнь, июль и август
            if (month >= 5 && month <= 7) {
                removeKeys.add(key);
            }
        }

// Удаление из словаря
        map.keySet().removeAll(removeKeys);

        System.out.println(map);


// {Stallone4=Mon Oct 01 00:00:00 YEKT 1984, Stallone5=Fri Nov 01 00:00:00 YEKT 1985, Stallone3=Thu Sep 01 00:00:00 YEKST 1983}
    }
}
