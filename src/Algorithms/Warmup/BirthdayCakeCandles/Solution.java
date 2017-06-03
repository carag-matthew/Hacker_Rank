package Algorithms.Warmup.BirthdayCakeCandles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Matt on 6/1/2017.
 */
public class Solution {
    public void quickSort(long[] a, int start, int end)
    {
        if(start < end)
        {
            int q = partition(a, start, end);
            quickSort(a, start, q-1);
            quickSort(a, q+1, end);
        }
    }

    public int partition(long[] a, int start, int end)
    {
        long x = a[end];
        int i = start-1;
        for(int j = start; j < end; j++)
        {
            if(a[j] < x)
            {
                i++;
                long temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        long temp = a[i+1];
        a[i+1] = a[end];
        a[end] = temp;
        return i+1;
    }


    public static void main(String[] args) throws FileNotFoundException {
        if(args.length > 1) {
            System.setIn(new FileInputStream(args[1]));
            System.out.println("OH YEAH!");
        }


        Solution solution = new Solution();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Long> a = new ArrayList();

        for(int i = 0; i < n; i++) {
            a.add(in.nextLong());
        }

        //solution.quickSort(a, 0, a.length-1);
        Collections.sort(a);

        int iterator = n-1;
        int count = 1;  // Case n = 1
        if(n > 1)
        {
            while(iterator > 0 && (a.get(iterator) == a.get(--iterator))) {
                count++;
            }
        }

        System.out.println(count);

    }

}
