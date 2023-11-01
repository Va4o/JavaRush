package Finilize;

public class Cat1 {
    int catCount;

    public Cat1(int catCount){
        this.catCount = catCount;
        catCount++;
    }
    protected void finalize() throws Throwable{
        catCount--;
    }

}
