package Static;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringHepler {

    static String multiply(String s, int count) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        s = reader.readLine();
        for(count = 0; count < 2; count++){
            System.out.println(s);
        }
        return s;
    }
    static String multiply(String s) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        s = reader.readLine();
        for(int i = 0; i < 5; i++){
            System.out.println(s);
        }
        return s;
    }

    public static void main(String[] args) throws IOException {
        multiply("name", 0);
    }
}
