
import java.io.*;   
class Time
{ 
    // Function to calculate the angle 
    static int calcAngle(double h, double m) 
    { 
        
        if (h <0 || m < 0 || h >12 || m > 60) 
            System.out.println("Wrong input"); 
  
        if (h == 12) 
            h = 0; 
        if (m == 60)  
            m = 0; 
        
        
        int minutes = (int) m;
        int hours = (int) h;
        final int hour_angle = (int) (0.5 * (hours * 60 + minutes));
        final int minute_angle = (int) (6 * minutes);

        int angle = Math.abs(hour_angle - minute_angle);

        angle = Math.min(360 - angle, angle);
        if(angle < 0)
        {
            System.out.println("Wrong input");
        }
        return angle;
    }

    public static void main(final String[] args) 
    { 
        //System.out.println(calcAngle(9, 60)+" degree"); 
        //System.out.println(calcAngle(3, 30)+" degree"); 
        //System.out.println(calcAngle(-1, 4)+" degree");
        System.out.println(calcAngle(0, 70)+" degree");
    } 
} 
