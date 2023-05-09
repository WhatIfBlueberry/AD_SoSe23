package org.example;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //List<Integer> list = List.of(2,3,6,8,3,24,6,8,34,3,5,5,3,7,8,32,21,6,7,4,2,7,8,5,12,15,18,15,14,12,19,20,1);
        ThreadLocalRandom.current().nextInt(1000, 10000);
        List<Integer> randomList = IntStream.range(0, 10000)
                                          .mapToObj(i -> ThreadLocalRandom.current().nextInt(1000, 10000 + 1))
                                          .collect(Collectors.toList());
        System.out.println(CountSort.sort(randomList));
        var array = randomList.stream().mapToInt(Integer::intValue).toArray();
        HeapSort.sort(array, 0, array.length-1);
        System.out.println(array);
    }


}