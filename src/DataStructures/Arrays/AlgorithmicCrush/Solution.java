package DataStructures.Arrays.AlgorithmicCrush;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Matt on 6/1/2017.
 */
public class Solution {
    public static void update(BigInteger[] array, Integer a, Integer b, Integer k)
    {
        for(int i = -1; i < (b-a); i++) // i = -1; To fix off by one error
        {
            array[a+i] = array[a+i].add(new BigInteger(k.toString()));
        }
    }

    public static BigInteger findMax(BigInteger[] array) {
        BigInteger max = array[0];
        for(int i = 1; i < array.length; i++)
        {
            if(array[i].compareTo(max) > 0)
            {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        BigInteger[] array = new BigInteger[in.nextInt()];
        int m = in.nextInt();


        for(int i = 0; i < array.length; i++) // O(N)
        {
            array[i] = new BigInteger("0");
        }

        for(int i = 0; i < m; i++) // O(N * M) - Worst Case
        {
            Solution.update(array, in.nextInt(), in.nextInt(), in.nextInt());
        }

        // If I use a max-heap here, it can be constant lookup O(1)
        System.out.println(Solution.findMax(array)); // O(N)

    }

}
