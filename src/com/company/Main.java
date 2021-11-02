package com.company;

import java.math.BigInteger;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int a1[] = {1, 2, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9};
        int a2[] = {1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] c = new int[a1.length + a2.length];
        int count = 0;
        for (int i = 0; i < a1.length; i++) {
            c[count] = a1[i];
            count++;
        }
        for (int j = 0; j < a2.length; j++) {
            c[count] = a2[j];
            count++;
        }
        System.out.println(Arrays.toString(c));

        for (int i = 0; i < c.length - 1; i++) {
            // внутренний цикл прохода
            for (int j = c.length - 1; j > i; j--) {
                if (c[j - 1] >= c[j]) {
                    int tmp = c[j - 1];
                    c[j - 1] = c[j];
                    c[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(c));
    }
}
