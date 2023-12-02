package Date;

import java.util.Date;

public class howMuchPassed {
    public static void main(String[] args) {
        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int minutes = currentTime.getMinutes();
        int seconds = currentTime.getSeconds();
        System.out.println("From midnight passed: " + hours + ":" + minutes + ":" + minutes);
    }
}
