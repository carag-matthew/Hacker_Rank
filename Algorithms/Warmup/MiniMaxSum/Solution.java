package Algorithms.Warmup.MiniMaxSum;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Matt on 6/1/2017.
 */
public class Solution {
    public void insertionSort(BigInteger[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            for (int k = i; k < a.length; k++)
            {
                if(a[i].compareTo(a[k]) > 0)
                {
                    BigInteger temp = a[i];
                    a[i] = a[k];
                    a[k] = temp;
                }
            }
        }

    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner cin = new Scanner(System.in);

        BigInteger[] a = new BigInteger[5];
        a[0] = new BigInteger(cin.next());
        a[1] = new BigInteger(cin.next());
        a[2] = new BigInteger(cin.next());
        a[3] = new BigInteger(cin.next());
        a[4] = new BigInteger(cin.next());

        solution.insertionSort(a);

        BigInteger minSum = a[0].add(a[1]).add(a[2]).add(a[3]);
        BigInteger maxSum = a[4].add(a[3]).add(a[2]).add(a[1]);
        System.out.println(minSum + " " + maxSum);

    }

}
