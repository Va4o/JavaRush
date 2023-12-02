package LinkArrayLists;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class linkArrayList {
    static LinkedList<String> linkedList = new LinkedList<>();
    static ArrayList<String> arrayList = new ArrayList<>();
    static Date timeStart = new Date();
    static Date timeEnd = new Date();


    public static void setLinkedList(LinkedList<String> linkedList1) throws InterruptedException {
        Date sTime = new Date();
    for(int i = 0, n = 0; i <= 10000; i++){
        linkedList.add("add " + n);
        n++;
        System.out.println(linkedList.get(i));
        Thread.sleep(20);
        Date eTime = new Date();
        sTime = timeStart;
        eTime = timeEnd;
    }

    for(int q = 10000; q >= 0; q--){
        System.out.println(linkedList.get(q));
        linkedList.remove(q);
        if(q == 0) System.out.println("--------------------------------------------------------LinkedList END------------------------------------------------");
    }
    }
    public static void setArrayList(ArrayList<String> arrayList1) throws InterruptedException {
        Date sTime = new Date();
    for(int f = 0, u = 0; f <= 10000; f++){
        arrayList.add("add " + u);
        u++;
        System.out.println(arrayList.get(f));
        Thread.sleep(20);
        Date eTime = new Date();
        sTime = timeStart;
        eTime = timeEnd;
    }
    for(int a = 10000; a >= 0; a--){
        System.out.println(arrayList.get(a));
        arrayList.remove(a);
        if(a == 0) System.out.println("--------------------------------------------------------arrayList END----------------------------------------------------------");
    }
    }
    public static ArrayList<String> getArrayList(ArrayList<String> arrayList1){
        linkArrayList.arrayList = arrayList1;
        return arrayList;

    }
    public static LinkedList<String> getLinkedList(LinkedList<String> linkedList1){
        linkArrayList.linkedList = linkedList1;
        return linkedList;
    }
    public static void getTimeMsOfGet(ArrayList<String> arrayList){
        linkArrayList.arrayList = arrayList;
        long timeAnswer = timeStart.getTime() - timeEnd.getTime();
        System.out.println(timeAnswer);
    }
    public static void main(String[] args) throws InterruptedException {

        ArrayList<String> arrayList1 = new ArrayList<>();
        setArrayList(arrayList1);
        getArrayList(arrayList1);

        LinkedList<String> linkedList1 = new LinkedList<>();
        setLinkedList(linkedList1);
        getLinkedList(linkedList1);

        getTimeMsOfGet(arrayList);
        getTimeMsOfGet(linkedList);

    }

    private static void getTimeMsOfGet(LinkedList<String> linkedList) {
        linkArrayList.linkedList = linkedList;
        long currentTime = timeStart.getTime() - timeEnd.getTime();
        System.out.println(currentTime);
    }

}
