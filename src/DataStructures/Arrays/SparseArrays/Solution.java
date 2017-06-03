package DataStructures.Arrays.SparseArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Matt on 6/1/2017.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        // Create dictionary
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            String line = in.nextLine();
            if (!map.containsKey(line)) {
                map.put(line, 1);
            } else {
                map.put(line, map.get(line) + 1);
            }
        }

        int q = in.nextInt();
        in.nextLine();
        for(int i = 0; i < q; i++) {
            String line = in.nextLine();

            if (map.containsKey(line)) {
                System.out.println(map.get(line));
            } else {
                System.out.println(0);
            }
        }
    }

}
