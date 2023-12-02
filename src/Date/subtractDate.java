package Date;
import java.util.Date;

public class subtractDate {
    public static void main(String[] args) throws InterruptedException {
        Date currentDate = new Date();
        Thread.sleep(3000);
        Date newDate = new Date();

        long msdelay = newDate.getTime() - currentDate.getTime();
        System.out.println("Time: " + msdelay + " milliseconds");
    }
}
