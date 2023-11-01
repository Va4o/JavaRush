package Cat;

public class Cat {
    String name;
    int weight;
    int weightS = 4;
    int age;
    int ageS = 13;
    String color;
    String colorS = "Grey";
    String address;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name1, int weight, int age){
        this.name = name1;
        this.weight = weight;
        this.age = age;
    }
    public void initialize(String name2, int ageS){
        this.name = name2;
        this.age = ageS;
    }
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
    }
    public void initialize(int weight1, String color1, String address){
        this.weight = weight1;
        this.color = color1;
        this.address = address;
    }
    public void ifUnknown(){
        if(weight == 0){
            this.weight = weightS;
        }
        if(age == 0){
            this.age = ageS;
        }
        if(color == null){
            this.color = colorS;
        }

    }

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.ifUnknown();
        System.out.println("Name: " + cat.name);
        System.out.println("Age: " + cat.age);
        System.out.println("Weight: " + cat.weight);
        System.out.println("Color: " + cat.color);
        System.out.println("Address: " + cat.address);
    }

}