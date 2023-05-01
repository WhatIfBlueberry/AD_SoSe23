package org.ad;

import java.util.Arrays;

public class MergeSort {

    static void MergeSort(int[] a, int f, int l) {
        if (f < l) {
            int m = (f+l+1) / 2;
            MergeSort(a,f,m-1);
            MergeSort(a,m,l);
            Merge(a,f,l,m);
        }
        System.out.println(Arrays.toString(a));
    }
    static void Merge(int[] a, int f, int l, int m) {
        int i;
        int n = (l-f) + 1;
        int a1f = f;
        int a1l = m-1;
        int a2f = m;
        int a2l = l;
        int[] anew = new int[n];

        for (i = 0; i < n; i++) {
            if (a1f <= a1l) {
                if (a2f <= a2l) {
                    if(a[a1f] <= a[a2f]) {
                        anew[i] = a[a1f++];
                    } else {
                        anew[i] = a[a2f++];
                    }
                } else {
                    anew[i] =a[a1f++];
                }
            } else {
                anew[i] = a[a2f++];
            }
        }

        for (i=0; i<n; i++) {
            a[f+i]=anew[i];
        }
    }
}
