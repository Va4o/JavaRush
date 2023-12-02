package Generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class reversedNumbers2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            array.add(Integer.parseInt(reader.readLine()));
        }
        for(int k = 0; k < array.size(); k++){
             int j = array.size() - k - 1;
            System.out.println(array.get(j));
        }
    }
}
