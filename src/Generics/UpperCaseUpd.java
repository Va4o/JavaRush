package Generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperCaseUpd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            String s = reader.readLine();
            if(s.isEmpty()){
                break;
            }
            list.add(s);
        }
        ArrayList<String> newList = new ArrayList<>(list);

        for(int i = 0; i < newList.size();i++){
            String g = list.get(i);
            if(g.length() % 2 == 0){
                System.out.println(g + " " + g);
            }
            else
                System.out.println(g + " " + g + " " + g);

        }

    }
}
