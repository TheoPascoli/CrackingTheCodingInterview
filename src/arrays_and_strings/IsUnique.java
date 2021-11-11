package arrays_and_strings;

/*
    Algorithm that determine if a String has all unique characters
 */
public class IsUnique {

    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;

        boolean[] charArr = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charArr[val]) {
                return false;
            }
            charArr[val] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUniqueChars("abcdef")); // true
        System.out.println(isUniqueChars("abcdee")); // false
    }
}
