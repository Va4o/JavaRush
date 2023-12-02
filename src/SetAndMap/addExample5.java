package SetAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class addExample5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] letterS = new char[0];
        char p = ' ';
        String string = reader.readLine();
        String[] text = string.split(" ");
        for (int i = 0; i < text.length; i++) {
            letterS = text[i].toCharArray();
            for (int n = 0; n < letterS.length; n++) {
                if (letterS[n] == p) {
                    n++;
                }
                letterS[0] = Character.toUpperCase(letterS[0]);
            }
            System.out.print(" " + new String(letterS));
        }
    }
}



