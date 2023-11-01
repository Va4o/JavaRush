package Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bigMassive {
    public static void main(String[] args) throws IOException {
        int[] array = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }
        int[] arrayF = (int[]) Arrays.copyOf(array, 10);
        int[] arrayS = (int[]) Arrays.copyOf(array, 20);


        for (int i = 10; i < array.length; i++) {
            System.out.println(arrayS[i]);
        }

    }
}
