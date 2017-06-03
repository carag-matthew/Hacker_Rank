package Algorithms.Warmup.Staircase;

import java.util.Scanner;

/**
 * Created by Matt on 6/1/2017.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++)
        {
            for(int k = 0; k < n; k++)
            {
                if(k >= n - i - 1) System.out.print("#");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
