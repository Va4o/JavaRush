package Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class1 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[4];
        for(int i = 0; i < list.length; i++){
            list[i] = reader.readLine();
        }

        for(int i = 3; i < list.length; i--){
            System.out.println(list[i]);
            if(i <= 0){
                break;
            }
        }

    }
}
