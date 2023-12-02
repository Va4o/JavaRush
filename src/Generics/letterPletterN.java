package Generics;


import java.util.ArrayList;



class letterPletterN {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("iop");
        list.add("ipo");
        list.add("poi");
        list.add("nop");
        list.add("zet");
        fix(list);
        for(String str : list){
            System.out.println(str);
        }


    }
    public static ArrayList<String> fix(ArrayList <String> list){
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i).contains("p") && list.get(i).contains("n")) {
                list.get(i);
            }
            else if(list.get(i).contains("p")){
                list.remove(i);
                i--;
            }
            else if (list.get(i).contains("n")){
                list.add(list.get(i));
            }

        }
        return list;

    }
}

