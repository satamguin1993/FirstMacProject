package preparation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubsequentUniqueChar {

    static int longestUniqueSubstr(String s) {

        // Creating a set to store the last positions of occurrence
        HashMap<Character, Integer> seen = new HashMap<>();
        int maximum_length = 0;

        // starting the inital point of window to index 0
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            // Checking if we have already seen the element or not
            if (seen.containsKey(s.charAt(end))) {
                // If we have seen the number, move the start pointer
                // to position after the last occurrence
                start = Math.max(start, seen.get(s.charAt(end)) + 1);
            }

            // Updating the last seen value of the character
            seen.put(s.charAt(end), end);
            maximum_length = Math.max(maximum_length, end - start + 1);
        }
        return maximum_length;
    }

    public static void main(String []args){
        String s = "american express";
        System.out.println("The input String is " + s);
        int length1 = longestUniqueSubstr(s);
        int length = getLongestUniqueString(s.toCharArray());
        System.out.println("The length of the longest non-repeating character substring is " + length);
    }

    private static int getLongestUniqueString(char[] input) {
        int MAX_LENGTH = Integer.MIN_VALUE;
        int currentLength = 0;
        Set<Character> set = new HashSet<>();
        set.add(input[0]);

        for(int i=1;i<input.length;i++) {
            if(set.contains(input[i])) {
                currentLength = 0;
                continue;
            } else {
                currentLength++;
                set.add(input[i]);
                MAX_LENGTH = Math.max(MAX_LENGTH, currentLength);

            }
        }

        return MAX_LENGTH;
    }


}
