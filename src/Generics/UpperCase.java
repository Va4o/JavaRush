package Generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UpperCase {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 20; i++){
            String s = reader.readLine();
            if(s.equals("")){
                break;
            }
            list.add(s);
        }
        for(int k = 0; k < list.size(); k++){
            list.replaceAll(String :: toUpperCase);
            System.out.println(list.get(k));
        }

    }
}
