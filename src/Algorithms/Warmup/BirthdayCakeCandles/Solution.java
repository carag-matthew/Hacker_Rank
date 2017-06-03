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



    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Long> a = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            a.add(in.nextLong());
        }

        Collections.sort(a);

        int iterator = n-1;
        int count = 1;  // Case n = 1
        if(iterator > 0)
        {
            while(iterator > 0 && (a.get(iterator).equals(a.get(--iterator)))) {
                count++;
            }
        }

        System.out.println(count);

    }

}
