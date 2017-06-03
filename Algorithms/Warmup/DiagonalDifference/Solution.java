package Algorithms.Warmup.DiagonalDifference;

import java.util.Scanner;

/**
 * Created by Matt on 6/1/2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        cin.nextLine(); // Set to the next line
        int primarySum = 0;
        int secondarySum = 0;
        int p1 = 0;
        int p2 = n-1;

        while(p1 < n && p2 >= 0)
        {
            String[] line = cin.nextLine().split(" ");
            primarySum += Integer.parseInt(line[p1++]);
            secondarySum += Integer.parseInt(line[p2--]);
        }

        System.out.println(Math.abs(primarySum - secondarySum));
    }
}
