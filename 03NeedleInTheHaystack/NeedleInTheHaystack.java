package com.khreiv.NeedleInTheHaystack;

/*

DESCRIPTION:
Can you find the needle in the haystack?
Write a function findNeedle() that takes an array full of junk but containing one "needle"
After your function finds the needle it should return a message (as a string) that says:
"found the needle at position " plus the index it found the needle, so:

EXAMPLE(Input --> Output):
["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5"

*/


import java.util.Arrays;

public class NeedleInTheHaystack {

    public static void main(String[] args) {

        String[] haystack = {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        System.out.println(findNeedle(haystack));
    }
    public static String findNeedle(String[] haystack){
        return String.format("found the needle at position %d", Arrays.asList(haystack).indexOf("needle"));
    }
}
