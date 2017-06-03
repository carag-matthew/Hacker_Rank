package Algorithms.Warmup.PlusMinus;

import java.util.Scanner;

/**
 * Created by Matt on 6/1/2017.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for(int i = 0; i < n; i++)
        {
            int it = cin.nextInt();
            if(it > 0) positiveCount++;
            else if(it < 0) negativeCount++;
            else zeroCount++;
        }

        System.out.printf("%.6f\n",(double)positiveCount/n);
        System.out.printf("%.6f\n",(double)negativeCount/n);
        System.out.printf("%.6f\n",(double)zeroCount/n);
    }
}
