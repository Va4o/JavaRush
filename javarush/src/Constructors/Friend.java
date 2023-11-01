package Constructors;


public class Friend {
    String name;
    int age;
    String gender;

    public Friend(String name){
        this.name = name;
    }
    public Friend(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Friend(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public static void main(String[] args) {
        Friend f1 = new Friend("name" , 18, "Male");
        System.out.println(f1.name);
        System.out.println(f1.age);
        System.out.println(f1.gender);
    }
}
