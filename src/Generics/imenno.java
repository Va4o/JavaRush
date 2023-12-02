package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class imenno {
    public static void main(String[] args){
        String[] s = {"Mama" , "Mila" ,"Ramu"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s));
         for (int i = 0; i < list.size(); i++){
            String in = "imenno";
            if(i == 0) list.add(1,in);
            if(i == 1) list.add(3,in);
            if(i == 2) list.add(in);
            System.out.println(list.get(i));

        }


    }
}
