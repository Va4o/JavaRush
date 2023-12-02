package SetAndMap;

import java.util.HashSet;
import java.util.Set;

public class addExample2 {
    public static Set<String> join(Set<String> animals){
        animals.addAll(Dog.createDogs(animals));
        animals.addAll(Cat.createCats(animals));
        return animals;
    }
    private static void removeCats(Set<String> animals, Set<String> cats){
        animals.removeAll(cats);
    }
    public static void printAnimals(Set<String> animals){
        for(String animal : animals){
            System.out.println(animal);
        }
    }
    public static class Dog{
        private static Set<String> createDogs(Set<String> dogs){
            dogs.add("Dog: 1");
            dogs.add("Dog: 2");
            dogs.add("Dog: 3");
            return dogs;
        }
    }
    public static class Cat{
        private static Set<String> createCats(Set<String> cats){
            cats.add("Cat: 1");
            cats.add("Cat: 2");
            cats.add("Cat: 3");
            cats.add("Cat: 4");
            return cats;
        }

    }
    public static void main(String[] args) {
        Set<String> cats = new HashSet<>();
        Cat.createCats(cats);
        Set<String> dogs = new HashSet<>();
        Dog.createDogs(dogs);
        Set<String> join = new HashSet<>();
        join(join);
        removeCats(join,cats);
        printAnimals(join);
    }
}
