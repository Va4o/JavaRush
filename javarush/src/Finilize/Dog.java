package Finilize;

public class Dog {
    String name;
    public Dog(String name){
        this.name = name;
    }
    protected void finalize() throws Throwable{
        System.out.println(name + "Destroyed");
    }
}
