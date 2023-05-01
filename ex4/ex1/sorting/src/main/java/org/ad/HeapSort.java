package org.ad;

import java.util.Arrays;

public class HeapSort {

    private static void BuildHeap(int[] a, int f, int l) {
       int n = l-f+1;
       for (int i = f + (n-2) / 2; i >= f; i--) {
           Heapify(a,f,l,i);
       }
        System.out.println("Build Heap: " + Arrays.toString(a));
    }

    static void HeapSort(int[] a, int f, int l) {
        BuildHeap(a,f,l);
        for (int i = l; i > f; i--) {
            System.out.println("step " + (l - i) + " : " + Arrays.toString(a));
            swap(a,f,i);
            Heapify(a,f,i-1,f);
        }
        System.out.println("sorted: " + Arrays.toString(a));
    }

    private static void Heapify(int[] a, int f, int l, int root) {
        int largest;
        int left = f+(root-f)*2+1;
        int right = f+(root-f)*2+2;

        if (left <= l && a[left] > a[root]) {
            largest = left;
        } else {
            largest = root;
        }
        if (right <= l && a[right] > a[largest]) {
            largest = right;
        }
        if (largest != root) {
            swap(a, root, largest);
            Heapify(a,f,l,largest);
        }
    }
        private static void swap(int[] a, int index1, int index2) {
            int temp = a[index1];
            a[index1] = a[index2];
            a[index2] = temp;
        }
}
