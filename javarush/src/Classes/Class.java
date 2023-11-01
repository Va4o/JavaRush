package Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{


    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[5];
        for(int i = 0; i < list.length; i++) {
            String r = reader.readLine();
            list[i] = Integer.parseInt(r);
        }

        return list;
    }
    public static int max(int[] list){
        int max= list[0];
        for(int i = 0; i < list.length; i++){
            if(list[i] > max){
                max = list[i];
            }
        }
        System.out.println("Max is: " + max);
        return 0;
    }

    public static void main(String[] args) throws IOException {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
}