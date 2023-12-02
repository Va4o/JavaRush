package SetAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class addExample4 {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList<>();
        getIntegerList(list);
        getMinimum(list);

    }
    public static List<Integer> getIntegerList(List<Integer> list) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < n; i++){
            int N = Integer.parseInt(reader.readLine());
            list.add(N);
        }
        return list;
    }
    public static void getMinimum(List<Integer> list){
        int min = list.get(0);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < min){
                min = list.get(i);
            }
        }
        System.out.println("Min is: " + min);
    }

}
