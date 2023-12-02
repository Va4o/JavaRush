package Generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.Consumer;

public class doubleStrings {
    public static void main(String[] args) throws IOException {
        ArrayList<String> words = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 5; i++){
            words.add(reader.readLine());
        }
        doubleValues(words);
        System.out.println(words);
    }
    public static void doubleValues(ArrayList<String> words){
        for(int i = 0; i < words.size(); i++){
            String word = words.get(i);
            words.add(i + 1,word);
            i++;
        }
    }
}
