package org.ad;

public class Main {
    public static void main(String[] args) {
        int a[] = new int[]{-5, 13, -23, 7, -3, 17, 23, 12, -35, 19};
        HeapSort.HeapSort(a, 0, a.length-1);
        //MergeSort.MergeSort(a, 0, a.length-1);
    }
}