package arrays_and_strings;

/*
    Method that replace all spaces in a String with '%20'
 */
public class URLify {

    public static String replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0;
        int index;
        int i;

        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        index = trueLength + spaceCount * 2;
        if(trueLength < str.length) {
            str[trueLength] = '\0';
        }

        for(i = trueLength - 1; i >= 0; i--) {
            if(str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index -= 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }

        }

        return String.valueOf(str);
    }

    public static void main(String[] args) {
        System.out.println(replaceSpaces("Mr John Smith      ".toCharArray(), 13)); // Mr%20John%20Smith
    }
}
