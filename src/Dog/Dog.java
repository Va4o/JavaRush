package  Dog;
public class Dog {
    String name;
    int height;
    String color;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int height){
        this.name = name;
        this.height = height;
    }
    public void initialize(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.initialize("name", 21, "Dark Brown");
        System.out.println("Name: " + dog.name);
        System.out.println("Height of dog: " + dog.height);
        System.out.println("Color: " + dog.color);

    }
}