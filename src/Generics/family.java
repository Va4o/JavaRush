package Generics;

public class family {
    static class Human {
        String name;
        boolean gender;
        int age;
        Human father;
        Human mom;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.gender ? "мужской" : "женский");
            text += ", возраст: " + this.age;


            if (this.father.name != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mom.name != null) {
                text += ", мать: " + this.mom.name;
            }

            return text;
        }
        public Human(String name, boolean gender, int age, Human father, Human mom) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.father = father;
            this.mom = mom;
        }

        public Human(String name, boolean gender, int age) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }


    }

    public static void main(String[] args) {
        Human ded1 = new Human("ded1", true, 70);
        Human ded2 = new Human("ded2", true, 71);

        Human bab1 = new Human("bab1", false, 65);
        Human bab2 = new Human("bab2", false, 64);

        Human father = new Human("Father", true, 47, ded1, bab1);
        System.out.println(father);
        Human mom = new Human("Mom", false, 44, ded2, bab2);
        System.out.println(mom);
        Human det1 = new Human("det1", true, 28, father, mom);
        System.out.println(det1);
        Human det2 = new Human("det2", true, 18, father, mom);
        System.out.println(det2);
        Human det3 = new Human("det3", false, 16, father, mom);
        System.out.println(det3.toString());



    }

}
