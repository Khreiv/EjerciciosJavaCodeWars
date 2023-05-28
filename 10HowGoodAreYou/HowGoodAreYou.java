/*
DESCRPTION
There was a test in your class and you passed it. Congratulations!
But you're an ambitious person. You want to know if you're better than the average student in your class.

You receive an array with your peers' test scores. Now calculate the average and compare your score!

Return True if you're better, else False!

Note:
Your points are not included in the array of your class's points. For calculating the average point you may add your point to the given array!

EXAMPLE:
(int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}), (69) -> true
*/

package com.khreiv.HowGoodAreYou;

public class HowGoodAreYou {
    public static void main(String[] args) {

        int[] clase = {100, 40, 34, 57, 29, 72, 57, 88};
        int me = 75;
        System.out.println(betterThanAverage(clase, me)); //true
    }
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return java.util.stream.IntStream.of(classPoints).sum()/classPoints.length < yourPoints;
    }
}
