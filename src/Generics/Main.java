package Generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> odd = new ArrayList<>();

        ArrayList<Integer> even = new ArrayList<>();

        ArrayList<Integer> othr = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            list.add(Integer.parseInt(s));
        }
        for (Integer x : list) {
            if (x % 3 == 0) {
                odd.add(x);

            }
            if (x % 2 == 0) {
                even.add(x);
            }
            if(x % 3 != 0 && x % 2 != 0) {
                othr.add(x);
            }
        }
        printList(odd);
        printList(even);
        printList(othr);

    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}

