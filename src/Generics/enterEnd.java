package Generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class enterEnd {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++){
            String isExit = "end";
            list.add(reader.readLine());
            if(isExit.equalsIgnoreCase(list.get(i))){
                break;
            }

        }
        for(int j = 0 ; j < list.size(); j++) {
            System.out.println(list.get(j));
        }

    }
}
