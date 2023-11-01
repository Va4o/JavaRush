package Constructors;

public class Cat {
    String name;
    float weight;
    int age;
    float weightS;
    String color;
    String address;
    String addressX = "Unknown";

    public Cat(String name){
        this.name = name;
    }
    public Cat(String name, float weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public Cat(String name, int age, float weightS){
        this.name = name;
        this.age = age;
        this.weight = weightS;
    }
    public Cat(float weight, String color){
        this.weight = weight;
        this.color = color;
        this.address = addressX;
    }
    public Cat(float weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
    public static void main(String[] args) {
        Cat cat = new Cat(4.1f, "Grey", "Somewhere");
        System.out.println("Name: " + cat.name);
        System.out.println("Weight: " + cat.weight);
        System.out.println("Age: " + cat.age);
        System.out.println("Color: " + cat.color);
        System.out.println("Address: " + cat.address);
    }
}
