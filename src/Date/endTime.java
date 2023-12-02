package Date;

import jdk.jfr.Threshold;

import java.util.Date;

public class endTime {
    public static void main(String[] args) throws Exception{
        Date startTime = new Date();
        long endTime = startTime.getTime() + 5000;
        Date endDate = new Date(endTime);

        Date currentDate  = new Date();

        if(currentDate.after(endDate)){
            System.out.println("End time");
        }
    }
}
