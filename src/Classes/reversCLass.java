package Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reversCLass {
    public static void main(String[] args) throws IOException {
        int[] array = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < array.length; i++){
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }
        for(int i = 0; i < array.length; i++){
            array[i] = 10 - i;
            System.out.println(array[i]);

        }
    }
}
