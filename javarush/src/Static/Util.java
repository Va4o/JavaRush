package Static;

public class Util {
    static double x1 = 1, x2 = 2, y1 = 3, y2 = 4;
     static double res = (x2 - x1) - (y2 - y1);
    static double getDistance(){
        return res;
    }
    static double sqrt(double a){
        Util.res = a;
        return a;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(10));
    }
}
