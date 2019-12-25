/***********************************************************************
 * Name: Daniil Levitsky
 * NetID: levitskyi.dy
 * Precept: week 01 (4/9-15/9)
 * Description:This program remakes minutes in hours and minutes.
 ***********************************************************************/
public class Time {
    public static void main(String[] args) {
        int minutes, hours;
        hours = Integer.parseInt(args[0]) / 60;
        minutes = Integer.parseInt(args[0]) % 60;
        System.out.println(Integer.parseInt(args[0]));
        System.out.println("Job takes " + hours + " hours and " + minutes + " minutes");
    }
}
