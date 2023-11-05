package ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class dlteLst {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        String lastElement = list.remove(list.size() - 1);
        for (int i = 0; i < 13; i++) {

            list.add(0, lastElement);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
