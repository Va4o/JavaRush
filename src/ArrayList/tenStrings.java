package ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class tenStrings {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list= new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++){
            String s = reader.readLine();
            list.add(s);
        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}