package Constructors;

public class Dog {
    String name;
    int height;
    String color;
    public Dog(String name){
        this.name = name;

    }
    public Dog(String name, int height){
        this.name = name;
        this.height = height;
    }
    public Dog(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public static void main(String[] args) {
        Dog dog = new Dog("Dog",25,"Brown");
        System.out.println("Name: " + dog.name);
        System.out.println("Height: " + dog.height);
        System.out.println("Color: " + dog.color);
    }
}
