//CS210(c) F2017
//Liam Thompson
//This program checks if the passed in string is all vowels

public class HW5Exercise024 {
    public static void main(String[] args) {
        System.out.println(isAllVowels("abcdeftdsafdei"));
        System.out.println(isAllVowels("aeiou"));
    }

    /**
     * checks passed in string for vowels
     * @param s string
     * @return true is string is all vowels, and false if not.
     */
    public static boolean isAllVowels(String s) {
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'a'
                || s.charAt(i) == 'e'
                || s.charAt(i) == 'i'
                || s.charAt(i) == 'o'
                || s.charAt(i) == 'u') {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}
