package com.khreiv.CenturyFromYear;

/*

DESCRIPTION
The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.
Given a year, return the century it is in.

EXAMPLE
1705 --> 18
1900 --> 19
1601 --> 17
2000 --> 20

*/

public class CenturyFromYear {

    public static void main(String[] args) {
        System.out.println(century(90));
    }
    public static int century(int number){
        return ((number - 1) / 100) + 1;
    }
}