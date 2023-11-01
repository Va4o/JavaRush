package Constructors;

public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public Rectangle(int top){
        this.top = top;
    }
    public Rectangle(int top ,int left){
        this.top = top;
        this.left = left;
    }
    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
    }
    public Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(1);
        System.out.println(r.top);
        System.out.println(r.left);
        System.out.println(r.width);
        System.out.println(r.height);
    }
}
