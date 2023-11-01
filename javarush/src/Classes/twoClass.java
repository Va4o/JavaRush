package Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class twoClass {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] list = new String[3];
        for(int i = 0; i < list.length; i++){
            list[i] = reader.readLine();
        }
        float[] array = new float[3];
        System.out.println("Now start to enter the digits of first massive: ");
        for(int i = 0; i < array.length; i++){
            String s = reader.readLine();
            array[i] = Float.parseFloat(s);
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }



}
