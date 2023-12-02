package Date;

import java.util.Date;

public class howMuchPassedFromYear {
    public static void main(String[] args) {
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);
        Date currentTime = new Date();
        long msDistance = currentTime.getTime() - yearStartTime.getTime();
        long msTime = 24 * 60 * 60 * 1000;

        int dayCount = (int) (msDistance/msTime);
        System.out.println(dayCount + " passed days");
    }
}
