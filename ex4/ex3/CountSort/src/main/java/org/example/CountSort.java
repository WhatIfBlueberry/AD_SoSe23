package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountSort {
    public static List<Integer> sort(List<Integer> unsorted) {
        long start = System.currentTimeMillis();
        List<Integer> ret = new ArrayList<>();
        int max = Collections.max(unsorted);
        int[] bin = new int[max+1];
        unsorted.stream().forEach(value -> bin[value]++);
        for (int i = 0; i < bin.length; i++) {
            int val = bin[i];
            while (val > 0) {
                ret.add(i);
                val--;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("CountSort took: " + (end-start) + " ms");
        return ret;
    }
}
