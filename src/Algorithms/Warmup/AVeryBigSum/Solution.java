package Algorithms.Warmup.AVeryBigSum;

import java.util.*;
import java.math.*;

/**
 * Created by Matt on 6/1/2017.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < n; i++)
        {
            BigInteger bigInteger = new BigInteger(in.next());
            sum = sum.add(bigInteger);
        }
        System.out.println(sum.toString());
    }
}
