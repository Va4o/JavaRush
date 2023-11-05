package ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class shortString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < list.get(0).length()) {
                list.set(0, list.get(0));
            }
        }
        System.out.println(list.get(0));
    }

}
