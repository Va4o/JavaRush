package Generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class nAndm {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> list = new ArrayList<>();
        for(int a = 0; a < n; a++){
            String s = reader.readLine();
            list.add(s);
        }
        for(int b = 0; b < m; b++){
            String temp = list.get(b);
            list.add(temp);
        }
        for(int c = 0; c < m; c++){
            list.remove(list.get(c));
        }
        for(int d = 0; d < list.size(); d++){
            System.out.println(list.get(d));
        }
    }
}
