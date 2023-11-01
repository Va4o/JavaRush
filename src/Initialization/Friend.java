package Initialization;

public class Friend {
    String name = null;
    int age;
    String gender = null;

    public void initialize(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    public void initialize(String name1, int age1){
        this.name = name1;
        this.age = age1;
    }
    public void initialize(String name2){
        this.name = name;
    }

    public static void main(String[] args) {
        Friend Vafo = new Friend();
        Vafo.initialize("Vafo",18, "Male");
        System.out.println("Name: " + Vafo.name);
        System.out.println("Age: " + Vafo.age);
        System.out.println("Gender: " + Vafo.gender);
    }


}
