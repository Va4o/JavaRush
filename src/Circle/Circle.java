package Circle;

public class Circle {
    int centerX;
    int centerY;
    int radius;
    int width;
    String color;

    public void initialize(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public void initialize(int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public void initialize(int centerX, int centerY, int radius, int width, String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        c.initialize(10,10,5, 5, "Red");
        System.out.println(c.centerX);
        System.out.println(c.centerY);
        System.out.println(c.radius);
        System.out.println(c.width);
        System.out.println(c.color);
    }
}
