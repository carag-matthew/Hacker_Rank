package Algorithms.Warmup.TimeConversion;

import java.util.Scanner;
/**
 * Created by Matt on 6/3/2017.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        String[] array = line.split(":");
        int hour = Integer.parseInt(array[0]);
        String hourString = "";

        if(array[2].contains("PM") && hour < 12)
        {
            hour += 12;
        } else if(array[2].contains("AM") && hour == 12) {
            hour = 0;
        }

        if(hour < 12)
            hourString = "0";
        hourString += "" + hour;

        System.out.printf("%s:%s:%s", hourString, array[1], array[2].substring(0,2));
    }
}
