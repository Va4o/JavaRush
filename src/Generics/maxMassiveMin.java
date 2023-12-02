package Generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class maxMassiveMin {
    public static void main(String[] args) throws IOException {
        int[] list = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        int max = list[0];
        int min = list[0];
        for (int j = 1; j < list.length; j++) {
            if (list[j] > max) {
                max = list[j];
            }
        }
        for(int k = 0; k < list.length; k++){
            if(list[k] < min){
                min = list[k];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
