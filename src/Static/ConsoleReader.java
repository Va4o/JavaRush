package Static;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.CompletionService;

public class ConsoleReader {

    static String read;
    static int integer;
    static double a;
    static boolean b;

    static String readString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        read = reader.readLine();
        return read;
    }
    static int readInt() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        integer = Integer.parseInt(reader.readLine());
        return integer;
    }
    static double readDouble() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = Double.parseDouble(reader.readLine());
        return  a;
    }
    static boolean readBoolean() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        b = Boolean.parseBoolean(reader.readLine());
         return b;
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Input integer: ");
        readInt();
    }
}
