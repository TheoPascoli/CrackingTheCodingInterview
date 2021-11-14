package arrays_and_strings;

/*
    Method that check if a String is a permutation of a palindrome
 */
public class IsPermutationOfPalindrome {

    private static int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);

        if (a <= val && val <= z) {
            return val - a;
        }

        return -1;
    }

    private static int[] buildCharFrequencyTable(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
            }
        }

        return table;
    }

    private static boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;

        for (int count : table) {
            if(count % 2 == 1) {
                if(foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }

        return true;
    }

    public static boolean isPermutationOfPalindrome(String phrase) {
        int[] table = buildCharFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("tact coa")); // true
        System.out.println(isPermutationOfPalindrome("tact coaa")); // false
    }
}




















