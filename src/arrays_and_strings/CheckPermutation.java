package arrays_and_strings;

import java.util.Arrays;

/*
    Method to decide if one is a permutation of the other
 */
public class CheckPermutation {

    private static String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static boolean isPermutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        return sort(s).equals(sort(t));
    }

    public static void main(String[] args) {
        System.out.println(isPermutation("god", "dog")); // true
        System.out.println(isPermutation("dog", "cat")); // false
    }
}
