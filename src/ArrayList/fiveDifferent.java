package ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class fiveDifferent {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("as");
        list.add("sd");
        list.add("df");
        list.add("fg");
        list.add("gh");
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
