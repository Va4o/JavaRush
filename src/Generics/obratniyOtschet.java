package Generics;

public class obratniyOtschet {
    public static void main(String[] args) throws InterruptedException {
        for(int i = 30; i >= 0; i--){
            Thread.sleep(100);
            System.out.println(i);
            if(i == 0){
                System.out.println("Booom!!!");
            }
        }
    }
}
