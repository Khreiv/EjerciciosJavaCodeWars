package com.khreiv.SumOfPositives;

/*

DESCRIPTION:
You get an array of numbers, return the sum of all of the positives ones.

EXAMPLE [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.

*/

public class SumOfPositives {

    public static void main(String[] args) {
        int[] arr = {1, -4, 7, 12};

        System.out.println(suma(arr));
    }
    public static int suma(int[] arr) {
        return java.util.Arrays.stream(arr)
                .filter(num -> num >= 0)
                .sum();
    }
}
