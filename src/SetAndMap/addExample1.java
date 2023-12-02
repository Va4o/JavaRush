package SetAndMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class addExample1 {
    public static void main(String[] args) {
        Set<String> cats = new HashSet<>();
        Cat.createCats(cats);
        System.out.println("Before: ");
        Cat.printCats(cats);
        cats.remove("Cat: 1");
        System.out.println("After: ");
        Cat.printCats(cats);

    }

    public static class Cat {

        public static void createCats(Set<String> cats) {
            cats.add("Cat: 1");
            cats.add("Cat: 2");
            cats.add("Cat: 3");
        }

        public static void printCats(Set<String> cats) {
            for (String text : cats) {
                System.out.println(text);
            }
        }

    }

}
