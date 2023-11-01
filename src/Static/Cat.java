package Static;

import java.util.ArrayList;

public class Cat {
    String name;
    public static int catCount;
    static ArrayList<Cat> cats;

    static int getCatCount(){
       return catCount;
    }
    Cat(){
        this.name = name;
        catCount++;

    }
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();
        System.out.println(cats);


    }
}
