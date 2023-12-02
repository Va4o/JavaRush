package ArrayListLinkedList;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class linkaray {
    class Main{
        static ArrayList<Integer> arrayList = new ArrayList<>();
        static LinkedList<Integer> linkedList = new LinkedList<>();

        public static void main(String[] args) throws Exception{
            Date startArray = new Date();
            for(int i = 0; i < 10000; i++){
                arrayList.add(i);
                linkedList.add(i);
            }
            Date endArray = new Date();
            Date startLinked = new Date();
            for(int i = 0; i < 10000; i++){
                linkedList.add(i);
            }
            Date endLinked = new Date();
            long msDelay4 = endLinked.getTime() - startLinked.getTime();
            long msDelay = endArray.getTime() - startArray.getTime();
            for(int i = 0; i < arrayList.size(); i++){
                arrayList.remove(i);
                i--;
            }
            for(int k = 0 ; k < linkedList.size(); k++){
                linkedList.remove(k);
                k--;
            }

            System.out.println("ArrayList: "+ getArrayList());
            System.out.println("LinkedList: " + getLinkedList());
            Date startV = new Date();
            for(int getT = 0; getT < 10000; getT++){
                getArrayList();
            }
            Date endV = new Date();
            Date startV1 = new Date();
            for(int getA = 0; getA < 10000; getA++){
                getLinkedList();
            }
            Date endV2 = new Date();
            long msDelay1 = endV.getTime() - startV.getTime();
            long msDelay2 = endV2.getTime() - startV1.getTime();
            System.out.println("From the paste of ArrayList passed: " + msDelay + "ms");
            System.out.println("From the paste of LinkedList passed: " + msDelay4 + "ms");
            System.out.println("From the getArray: " + msDelay1 + "ms");
            System.out.println("From the GetLinked: " + msDelay2 + "ms");


        }
        private static void setArray(ArrayList<Integer> arrayList){
            Main.arrayList = arrayList;
        }
        private static void setLinked(LinkedList<Integer> linkedList){
            Main.linkedList = linkedList;
        }
        private static LinkedList<Integer> getLinkedList(){
            return linkedList;
        }
        private static ArrayList<Integer> getArrayList(){
            return arrayList;
        }
    }
}
