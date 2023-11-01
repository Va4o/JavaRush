package Rectangle;

public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public void initialize(int top){
        this.top = top;
    }
    public void initialize(int top,int left){
        this.top = top;
        this.left = left;
    }
    public void initialize(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
    }
    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void ifWiHeX(){
        if(width == 0){
            this.width = 0;
            this.height = 0;
        }
        if(height == 0){
            this.height = 0;
            this.width = 0;
        }
    }
    public void ifHX(){
        if(height == 0){
            this.height = width;
        }
    }

    public static void main(String[] args) {
    Rectangle r = new Rectangle();
    r.initialize(1,2,2);
//    r.ifWiHeX();
    r.ifHX();
        System.out.println(r.top);
        System.out.println(r.left);
        System.out.println(r.width);
        System.out.println(r.height);
    }
}
