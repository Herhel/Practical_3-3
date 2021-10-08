package com.alfa.work12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Runner {

    public void run() {
        List<String> list = createList();
        System.out.println(list);
        print(list, s -> s.startsWith("1"));
        System.out.println();
        list.stream().filter(s -> s.startsWith("1")).forEach(s -> System.out.print(s + ", "));
    }

    public Integer[] createArray() {
        Random random = new Random();
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) - 50;
        }
        return arr;
    }

    public List<String> createList() {
        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            list.add(Integer.toString(random.nextInt(50)));
        }
        return list;
    }

    public Integer sum(Integer[] array, Predicate<Integer> predicate) {
        Integer summa = 0;
        for (Integer elem : array) {
            if (predicate.test(elem)) {
                summa += elem;
            }
        }
        return summa;
    }

    public void print(List<String> list, Predicate<String> predicate) {
        for (String str : list) {
            if (predicate.test(str)) {
                System.out.print(str + ", ");
            }
        }
    }
}
